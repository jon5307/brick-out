package MouseGame;

public class MovingBall {
	private int x_pos;
	private int y_pos;
	private int radius;
	private double x_velocity = 0;
	private double y_velocity = 0;
	private Box container;
	private BrickMap game;
	private BrickHealth brickHealth;
	private int p;

	public MovingBall(int x_initial, int y_initial, int r, Box box, BrickMap bm, BrickHealth bh) {
		x_pos = x_initial;
		y_pos = y_initial;
		radius = r;
		container = box;
		game = bm;
		brickHealth = bh;
		p = bm.getP();
	}

	public int xPosition() {
		return x_pos;
	}

	public int yPosition() {
		return y_pos;
	}

	public int radiusOf() {
		return radius;
	}

	public void move (int time_units) {
		x_pos += x_velocity * time_units;
		if (container.inHorizontalContact(x_pos))
			x_velocity *= -1;
		y_pos += y_velocity * time_units;
		if (container.inVerticalContact(y_pos))
			y_velocity *= -1;
		if(container.bottomContact(y_pos)) {
			stop();
		}

		Brick[][] game_map = new Brick[game.getRow()][game.getCol()];
		game_map = game.getMap();


		for (int i = 0; i < game_map.length; i++) {
			for (int j = 0; j < game_map[0].length; j++) {
				if (game_map[i][j].getVisible() == 1
					&& game_map[i][j].isContact(x_pos, y_pos, radius)) {
					if (game_map[i][p].isContact(x_pos, y_pos, radius)) {
						brickHealth.healthZero(i,p);
					}
					else
						brickHealth.healtMinus(i,j);
					if (brickHealth.getHealth(i,j) == 0) {
						game_map[i][j].setVisible(0);
					}
					if (x_pos + radius - 1 <= game_map[i][j].getX() ||
							x_pos + 1 >= game_map[i][j].getX() + game_map[i][j].getWidth()){
							if (!game_map[i][p].isContact(x_pos, y_pos, radius)) {x_velocity *= -1;}
					}
					else {
						if (!game_map[i][p].isContact(x_pos, y_pos, radius))
							y_velocity *= -1;
					}
				}
			}
		}

	}

	public void stop() {
		x_velocity = 0;
		y_velocity = 0;
	}

	public void setVelocity(double x, double y) {
		x_velocity = x;
		y_velocity = y;
	}
}
