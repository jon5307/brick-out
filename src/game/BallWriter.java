package game;

import java.awt.Color;
import java.awt.Graphics;

public class BallWriter {
	private MovingBall ball;

	public BallWriter(MovingBall x) {
		ball = x;
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.red);
		int radius = ball.radiusOf();
		g.fillOval(ball.xPosition() - radius, ball.yPosition() - radius, radius * 2, radius * 2);
	}

	public void setVelocity(double x, double y) {
		ball.setVelocity(x,y);
	}

	public void stop() {
		ball.stop();
	}

	public int xPosition() {
		return ball.xPosition();
	}

	public int yPosition() {
		return ball.yPosition();
	}
	
	public MovingBall getMovingBall() { // MovingBall 접근을 위한 메소드. 
		return ball;
	}
}