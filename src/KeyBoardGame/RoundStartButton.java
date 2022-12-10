package KeyBoardGame;

import javax.swing.*;
import java.awt.event.*;
public class RoundStartButton extends JButton implements ActionListener{
	private KAnimationWriter writer;
	public RoundStartButton(KAnimationWriter w) {
		super("Round Start");
		writer = w;
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		writer.setIsStart(true);
		isEnable(false);
	}
	
	public void isEnable(boolean b) {
		this.setEnabled(b);
	}

}
