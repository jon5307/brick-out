package game;



public abstract class MovingBall {
	protected int x_pos;
	protected int y_pos;
	protected int radius;
	protected double x_velocity = 5;
	protected double y_velocity = 5;
	protected Box container;
	protected BrickMap game;
	protected Player player;
	
	public MovingBall(int x_initial, int y_initial, int r, Box box, BrickMap bm, Player p) {
		x_pos = x_initial;
		y_pos = y_initial;
		radius = r;
		container = box;
		player = p;
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
					//game_map[i][j].setVisible(0);
					Brick b = game_map[i][j];
					boolean dummy = b.getBrickHp() <= 1 ? b.setVisible(0) : b.setBrickHp(); // dummy값은 ? : 연산을 위해 생성.
					// 공이 닿았을 때 브릭의 체력이 0이면(== 닿기 전까지 체력이 1 이하) visible을 0으로, 그렇지 않으면 brick_hp -= 1
					if (dummy) { 
						player.plusScore(); //dummy가 참이면 브릭을 하나 부순 것이므로 점수를 올려줌
					} 
					if (x_pos + radius -1 <= game_map[i][j].getX() ||
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
