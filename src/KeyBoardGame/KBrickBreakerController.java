package KeyBoardGame;

import game.*;

public class KBrickBreakerController extends BrickBreakerController{
	private KMovingBall ball;
	private KAnimationWriter writer;
	private int frame_size;
	
	public KBrickBreakerController(MovingBall b, AnimationWriter w) {
		super(b, w);
		ball = (KMovingBall)b;
		writer = (KAnimationWriter)w;
		frame_size = writer.getFrameSize();
	}
	
	@Override
	public void runAnimation() {
		int time_unit = 1;
		int painting_delay = 20;
		boolean alive = true;
		while(alive) {
			writer.getParent().repaint();
			while(writer.getIsStart()) {
				delay(painting_delay);
				ball.move(time_unit);
				writer.getParent().repaint();
				writer.setIsStart();
				
				if(ball.yPosition() > frame_size) {
					ball.gameOver();
					//체크용
					alive = false;
					System.out.println("Game Over");
					break;
				}
			}
		}
	}

	private void delay(int how_long) {
		try {Thread.sleep(how_long);}
		catch (InterruptedException ignored) {}
	}
}
