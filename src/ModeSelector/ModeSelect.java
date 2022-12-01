package ModeSelector;
import javax.swing.*;
import java.awt.*;

public class ModeSelect extends JFrame {
	private int f_n = 0;
	
	public ModeSelect() {
		setTitle("Mode Select");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(3, 1));
		ModeButton mouse_mode = new ModeButton("Mouse Mode", this);
		ModeButton keyBoard_mode = new ModeButton("KeyBoard Mode",this);
		ModeButton ranking_mode = new ModeButton("Rank", this);
		cp.add(mouse_mode);
		cp.add(keyBoard_mode);
		cp.add(ranking_mode);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public void set_frame_number(int n) {
		f_n = n;
	}
	
	public int get_frame_number() {
		return f_n;
	}
}
