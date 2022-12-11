package KeyBoardGame;

import game.*;
import game.Box;

import java.awt.*;
import javax.swing.*;

public class RoundWriter extends JPanel {
	
	private int round;
	private int size;
	
	public RoundWriter(int round, Box b) {
		this.round = round;
		this.size = b.sizeOf();
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		g.setFont(new Font("", Font.BOLD, 15));
		g.drawString("Round: " + round, size-80, 20);
	}
	
	public void setRound(int r) {
		round = r;
	}
	
}
