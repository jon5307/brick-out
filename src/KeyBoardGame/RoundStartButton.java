package KeyBoardGame;

import javax.swing.*;
import game.*;
import java.awt.event.*;

public class RoundStartButton extends JButton implements ActionListener{
	
	private KAnimationWriter writer;
	private RoundWriter round_writer;
	private BrickWriter brick_writer;
	private MovingBall moving_ball;
	private InitializeForNextRound init = new InitializeForNextRound();
	private int round = 1;
	
	public RoundStartButton(KAnimationWriter w, RoundWriter rw,BrickWriter bw, MovingBall ball) {
		super("Round Start");
		writer = w;
		round_writer = rw;
		brick_writer = bw;
		moving_ball = ball;
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		

		round = init.initialization(brick_writer, moving_ball);
		round_writer.setRound(round);
		System.out.println(round);
		writer.setIsStart(true);
		isEnable(false);
		
	}
	
	public void isEnable(boolean b) {
		this.setEnabled(b);
	}

	
	
}
