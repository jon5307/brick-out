package game;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public abstract class AnimationWriter extends JPanel implements ActionListener{
	protected BoxWriter box_writer;
	protected BallWriter ball_writer;
	protected BrickWriter brick_writer;
	protected ScoreWriter score_writer;
	protected int box_size;
	protected Player player;

	public AnimationWriter(BoxWriter b, BallWriter ball, BrickWriter brick, ScoreWriter sw, Player p, int size) {
		box_writer = b;
		ball_writer = ball;
		brick_writer = brick;
		score_writer = sw;
		player = p;

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
		player.paintComponent(g);
		score_writer.paintComponent(g);
	}

}
