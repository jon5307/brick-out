package game;

public class BrickBreakerController {
	private MovingBall ball;
	private AnimationWriter writer;
	
	public BrickBreakerController(MovingBall b, AnimationWriter w) {
		ball = b;
		writer = w;
	}
	
	public void runAnimation() {
		int time_unit = 1;
		int pating_delay = 20;
		while(true) {
			delay(pating_delay);
			ball.move(time_unit);
			writer.getParent().repaint();
		}
	}
	
	private void delay(int how_long) {
		try {Thread.sleep(how_long);}
		catch (InterruptedException e) {}
	}
}
