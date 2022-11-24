import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AnimationWriter extends JPanel implements KeyListener, ActionListener{
	private BoxWriter box_writer;
	private BallWriter ball_writer;
	private BrickWriter brick_writer;
	private Player player;
	
	public AnimationWriter(BoxWriter b, BallWriter ball, BrickWriter brick, Player p) {
		box_writer = b;
		ball_writer = ball;
		brick_writer = brick;
		player = p;

		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setTitle("Brick Breaker");
		f.setSize(720, 740);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public void paintComponent(Graphics g) {
		box_writer.paintComponent(g);
		player.paintComponent(g);
		ball_writer.paintComponent(g);
		brick_writer.paintComponent((Graphics2D)g);
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
