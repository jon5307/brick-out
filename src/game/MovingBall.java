package game;

import ranking.*;

import javax.swing.*;

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
		OnlineRankMan rm = new OnlineRankMan();
		rm.onlineRegRank(JOptionPane.showInputDialog(null, "Input your name",
				null), player.getScore());
		rm.mkRank();
		rm.showRank();
	}
	//계속 할건지 그만둘건지 선택하는 코드 추가
}
