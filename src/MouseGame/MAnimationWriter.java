package MouseGame;

import java.awt.event.*;
import game.*;

public class MAnimationWriter extends AnimationWriter implements MouseListener, ActionListener{

  public MAnimationWriter(BoxWriter b, BallWriter ball, BrickWriter brick, int size) {
    super(b, ball, brick, size);
    addMouseListener(this);
  }

  public void actionPerformed(ActionEvent e) { repaint(); }


  @Override
  public void mouseClicked(MouseEvent e) {
    int x =  e.getX() - ball_writer.xPosition();
    int y = box_size - e.getY();
    double sqrt = Math.sqrt(x * x + y * y);
    double x_vel = 6.4 * Math.asin(x / sqrt);
    double y_vel = -6.4 * Math.asin(y / sqrt);
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
