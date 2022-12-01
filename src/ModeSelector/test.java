package ModeSelector;
import KeyBoardGame.StartKeyboard;
import ranking.*;
import MouseGame.*;

public class test {
	public static void main(String args[]) {
		ModeSelect first_frame = new ModeSelect();
		RankManager rank_manager = new RankManager();

		int f_n = 0;
		while(f_n == 0) {
			f_n = first_frame.get_frame_number();
			delay(1); //입력 대기를 위한 딜레이
		}
		
		switch(f_n) {
		case 1:
			new StartMouse(rank_manager);
			break;
		case 2:
			new StartKeyboard(rank_manager);
			break;
		case 3:
			rank_manager.ViewRank();
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
