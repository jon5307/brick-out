package game;

import ranking.*;

import javax.swing.*;

import static java.lang.Math.max;

public abstract class MovingBall {
	protected double x_pos;
	protected double y_pos;
	protected int radius;
	protected double x_velocity = 2.5;
	protected double y_velocity = 2.5;
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
		return (int) x_pos;
	}
	
	public int yPosition() {
		return (int) y_pos;
	}
	
	public int radiusOf() {
		return radius;
	}
	
	public abstract void move (int time_units);

	public void boxCrash(){
		if (container.leftContact((int) (x_pos - radius)))
			x_velocity = Math.abs(x_velocity);
		else if (container.rightContact((int) (x_pos + radius)))
			x_velocity = -Math.abs(x_velocity);
		else if (container.topContact((int) (y_pos - radius)))
			y_velocity = Math.abs(y_velocity);
	}
	public void brickCrash(Brick b, int x, int y){
		int left = x - b.getX();
		int right = b.getX() + b.getWidth() - x;
		int top = y - b.getY();
		int bottom = b.getY() + b.getHeight() - y;
		// top-bottom crash
		if (max(top,bottom) > max(left,right)){
			// top
			if (top < bottom) {
				y_velocity = -Math.abs(y_velocity);
				y_pos = b.getY() - radius;
			}
			// bottom
			else {
				y_velocity = Math.abs(y_velocity);
				y_pos = b.getY() + b.getHeight() + radius;
			}
		}
		// left-right crash
		else{
			// left
			if (left < right) {
				x_velocity = -Math.abs(x_velocity);
				x_pos = b.getX() - radius;
			}
			// right
			else {
				x_velocity = Math.abs(x_velocity);
				x_pos = b.getX() + b.getWidth() + radius;
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
		System.out.println("x_velocity: " + x_velocity + ", y_velocity: " + y_velocity);
	}
	public void gameOver(){
		OnlineRankMan rm = new OnlineRankMan();
		rm.onlineRegRank(JOptionPane.showInputDialog(null, "Input your name",
				null), player.getScore());
		rm.mkRank();
		rm.showRank();
	}
	//계속 할건지 그만둘건지 선택하는 코드 추가
}
