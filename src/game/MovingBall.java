package game;



public class MovingBall {
	protected int x_pos;
	protected int y_pos;
	protected int radius;
	protected double x_velocity = 5;
	protected double y_velocity = 5;
	protected Box container;
	protected BrickMap game;
	
	public MovingBall(int x_initial, int y_initial, int r, Box box, BrickMap bm) {
		x_pos = x_initial;
		y_pos = y_initial;
		radius = r;
		container = box;
		game = bm;
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
		

		
		Brick[][] game_map;
		game_map = game.getMap();
		
		for (int i = 0; i < game_map.length; i++) {
			for (int j = 0; j < game_map[0].length; j++) {
				if (game_map[i][j].getVisible() == 1
					&& game_map[i][j].isContact(x_pos, y_pos, radius)) {
					game_map[i][j].setVisible(0);
					if (x_pos + radius - 1 <= game_map[i][j].getX() ||
							x_pos + 1 >= game_map[i][j].getX() + game_map[i][j].getWidth()){
							x_velocity *= -1;
					}
					else {
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
