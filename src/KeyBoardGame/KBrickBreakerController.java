package KeyBoardGame;

import game.*;

public class KBrickBreakerController extends BrickBreakerController{
	private KMovingBall ball;
	private KAnimationWriter writer;
	public KBrickBreakerController(MovingBall b, AnimationWriter w) {
		super(b, w);
		ball = (KMovingBall)b;
		writer = (KAnimationWriter)w;
	}
	
	@Override
	public void runAnimation() {
		int time_unit = 1;
		int painting_delay = 20;
		while(true) {
			writer.getParent().repaint();
			while(writer.getIsStart()) {
				delay(painting_delay);
				ball.move(time_unit);
				writer.getParent().repaint();
				writer.setIsStart();
			}
		}
	}

	private void delay(int how_long) {
		try {Thread.sleep(how_long);}
		catch (InterruptedException ignored) {}
	}
}
