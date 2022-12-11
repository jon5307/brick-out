package KeyBoardGame;

import game.*;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;
import javax.swing.*;

public class KAnimationWriter extends AnimationWriter implements KeyListener{
	private boolean isStart = false;
	private RoundStartButton rSB;
	private RoundWriter round_writer;
	
	public KAnimationWriter(BoxWriter b, BallWriter ball, BrickWriter brick, ScoreWriter sw, RoundWriter rw,Player p, int size) {
		super(b, ball, brick, sw, p, size);
		round_writer = rw;
		JFrame j = super.getFrame();
		rSB = new RoundStartButton(this, rw, brick, ball.getMovingBall());
		j.add(rSB, BorderLayout.SOUTH);
		j.setSize(size + 20, size + 60);
		addKeyListener(this);
	}

	public void actionPerformed(ActionEvent e) { repaint(); }

	public void keyTyped(KeyEvent e) { }

	@Override
	public void paintComponent(Graphics g) {
		box_writer.paintComponent(g);
		ball_writer.paintComponent(g);
		brick_writer.paintComponent((Graphics2D)g);
		player.paintComponent(g);
		score_writer.paintComponent(g);
		round_writer.paintComponent(g);
	}
	
	public void keyPressed(KeyEvent e) { 
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			player.moveRight();
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			player.moveLeft();
		}
	}

	public void keyReleased(KeyEvent e) { 
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			player.moveRight();
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			player.moveLeft();
		}
	}
	
	public boolean getIsStart() {
		boolean isStart = this.isStart;
		return isStart;
	}
	
	public void setIsStart(boolean n) {
		System.out.println(isStart + "<- setIsStart(boolean n)");
		isStart = n;
		System.out.println(isStart + "<- setIsStart2(boolean n)");
	}
	
	public void setIsStart() {
		if (isStart) {
			if (brick_writer instanceof KBrickWriter) {
				if (! ((KBrickWriter) brick_writer).isThisRest()) {
					//((KBrickWriter) brick_writer).initIsRest();
					setIsStart(false);
					rSB.isEnable(true);
				}
			}
		}
	}
	

}
