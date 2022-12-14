package ModeSelector;
import KeyBoardGame.StartKeyboard;
import ranking.*;
import MouseGame.*;

public class main {
	public static void main(String[] args) {
		ModeSelect first_frame = new ModeSelect();

		int f_n = 0;
		while(f_n == 0) {
			f_n = first_frame.get_frame_number();
			delay(1); //입력 대기를 위한 딜레이
		}
		
		switch(f_n) {
		case 1:
			new StartMouse();
			break;
		case 2:
			new StartKeyboard();
			break;
		case 3:
			OnlineRankMan olm = new OnlineRankMan();
			olm.mkRank();
			olm.showRank();
			break;
		}
		
	}
	
	private static void delay(int n) {
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
