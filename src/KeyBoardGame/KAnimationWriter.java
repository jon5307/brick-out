package KeyBoardGame;

import game.BallWriter;
import game.BoxWriter;
import game.BrickWriter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KAnimationWriter extends game.AnimationWriter implements KeyListener{

	protected Player player;

	public KAnimationWriter(BoxWriter b, BallWriter ball, BrickWriter brick, Player p, int size) {
		super(b, ball, brick, size);
		addKeyListener(this);
		player = p;
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		player.paintComponent(g);
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
}
