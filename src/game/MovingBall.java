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
	
	public abstract void move (int time_units);

	public void stop() {
		x_velocity = 0;
		y_velocity = 0;
	}

	public void setVelocity(double x, double y) {
		x_velocity = x;
		y_velocity = y;
	}
	public void gameOver(){
		// TODO
		// 점수 저장, 게임 종료 안내 등을 수행하는 코드 작성해야함
		System.out.println("게임 종료");
	}
	
}
