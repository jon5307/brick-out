package KeyBoardGame;

import game.*;

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class KAnimationWriter extends AnimationWriter implements KeyListener{
	private boolean isStart = false;
	
	public KAnimationWriter(BoxWriter b, BallWriter ball, BrickWriter brick, ScoreWriter sw, Player p, int size) {
		super(b, ball, brick, sw, p, size);
		JFrame j = super.getFrame();
		RoundStartButton rSB = new RoundStartButton(this);
		j.add(rSB, BorderLayout.SOUTH);
		j.setSize(size + 20, size + 60);
		addKeyListener(this);
	}

	public void actionPerformed(ActionEvent e) { repaint(); }

	public void keyTyped(KeyEvent e) { }

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
		return isStart;
	}
	
	public void setIsStart(boolean n) {
		isStart = n;
	}
}
