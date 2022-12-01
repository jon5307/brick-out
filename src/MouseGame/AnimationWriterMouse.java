package MouseGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnimationWriterMouse extends JPanel implements MouseListener, ActionListener{
  private BoxWriter box_writer;
  private BallWriter ball_writer;
  private BrickWriter brick_writer;
  private int box_size;

  public AnimationWriterMouse(BoxWriter b, BallWriter ball, BrickWriter brick, int size) {
    box_writer = b;
    ball_writer = ball;
    brick_writer = brick;
    box_size = size;

    addMouseListener(this);
    setFocusable(true);
    setFocusTraversalKeysEnabled(false);

    JFrame f = new JFrame();
    f.getContentPane().add(this);
    f.setTitle("KeyBoardGame.Brick Breaker");
    f.setSize(size + 20, size + 40);
    f.setVisible(true);
    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

  public void paintComponent(Graphics g) {
    box_writer.paintComponent(g);
    ball_writer.paintComponent(g);
    brick_writer.paintComponent((Graphics2D)g);
  }

  public void actionPerformed(ActionEvent e) { repaint(); }


  @Override
  public void mouseClicked(MouseEvent e) {
    int x =  e.getX() - ball_writer.xPosition();
    int y = box_size - e.getY();
    double x_vel = 6.4 * Math.asin(x / Math.sqrt(x * x + y * y));
    double y_vel = -6.4 * Math.asin(y / Math.sqrt(x * x + y * y));
    System.out.println("x_vel: " + x_vel + " y_vel: " + y_vel);
    ball_writer.setVelocity(x_vel, y_vel);
  }

  @Override
  public void mousePressed(MouseEvent e) {

  }

  @Override
  public void mouseReleased(MouseEvent e) {

  }

  @Override
  public void mouseEntered(MouseEvent e) {

  }

  @Override
  public void mouseExited(MouseEvent e) {

  }
}
