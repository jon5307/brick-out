package ModeSelector;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModeButton extends JButton implements ActionListener {
    private ModeSelect modeFrame;
    
    public ModeButton(String name, ModeSelect mf) {
      super(name);
      modeFrame = mf;
      addActionListener(this);
    }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (getText().equals("Mouse Mode")) {
      modeFrame.set_frame_number(1);
    }
    else if (getText().equals("KeyBoard Mode")) {
      modeFrame.set_frame_number(2);
    }
    else if (getText().equals("Rank")) {
      modeFrame.set_frame_number(3);
    }
  }
}
