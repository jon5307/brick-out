package game;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public abstract class AnimationWriter extends JPanel implements ActionListener{
	protected BoxWriter box_writer;
	protected BallWriter ball_writer;
	protected BrickWriter brick_writer;
	protected int box_size;

	public AnimationWriter(BoxWriter b, BallWriter ball, BrickWriter brick, int size) {
		box_writer = b;
		ball_writer = ball;
		brick_writer = brick;
		box_size = size;

		setFocusable(true);
		setFocusTraversalKeysEnabled(false);

		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setTitle("Brick Breaker");
		f.setSize(size + 20, size + 40);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void paintComponent(Graphics g) {
		box_writer.paintComponent(g);
		ball_writer.paintComponent(g);
		brick_writer.paintComponent((Graphics2D)g);
	}

}
