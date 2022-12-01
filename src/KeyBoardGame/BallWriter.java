package KeyBoardGame;

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
	
}