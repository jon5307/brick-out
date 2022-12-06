package game;

import java.awt.*;

public class ScoreWriter {
	private Player player;
	private int box_size;
	
	/** 
	 * @param p 플레이어 바 객체
	 * @param b_s box_size 값
	 */
	public ScoreWriter(Player p, int b_s) {
		player = p;
		box_size = b_s;
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		g.setFont(new Font("", Font.BOLD, box_size/20)); //box_size의 비율로 크기 바꿈
		g.drawString("SCORE: " + Integer.toString(player.getScore()), box_size/35, box_size/15);
	}
}
