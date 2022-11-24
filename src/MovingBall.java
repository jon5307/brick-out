
public class MovingBall {
	private int x_pos;
	private int y_pos;
	private int radius;
	private int x_velocity = +5;
	private int y_velocity = +5;
	private Box container;
	private Player player;
	private BrickMap game;
	
	public MovingBall(int x_initial, int y_initial, int r, Box box, BrickMap bm, Player p) {
		x_pos = x_initial;
		y_pos = y_initial;
		player = p;
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
		
		if (player.isContact(x_pos, y_pos, radius)) {
			y_velocity *= -1;
		}
		
		Brick[][] game_map = new Brick[game.getRow()][game.getCol()];
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
	
}
