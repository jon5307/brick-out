package KeyBoardGame;

import game.BrickMap;
import game.BrickWriter;

import java.awt.*;

public class KBrickWriter extends BrickWriter {
	
	//private BrickMap bm;
	private boolean isRest = true;
	
	public KBrickWriter(BrickMap bm) {
		super(bm);
		//this.bm = bm;
	}
	
	public void changeBrickMap(BrickMap new_bm) {
		GameMap = new_bm.getMap();
		System.out.println(GameMap);
	}

	@Override
	public void paintComponent(Graphics2D g) {
		boolean rest = false;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (GameMap[i][j].getVisible() > 0) {
					rest = true;
					g.setColor(Color.pink);
					g.fillRect(j * b_width + size / 8, i * b_height + size / 8, b_width, b_height);

					g.setStroke(new BasicStroke(3));
					g.setColor(Color.black);
					g.drawRect(j * b_width + size / 8
							, i * b_height + size / 8, b_width, b_height);

					g.setColor(Color.black);
					g.setFont(new Font("", Font.BOLD, size/20)); //box_size의 비율로 크기 바꿈
					g.drawString(GameMap[i][j].getBrickHp()+"",
							j * b_width + size / 8 + b_width / 2 ,
							i * b_height + size / 8 + b_height / 2 + 5);
				}
			}
		}
		isRest = rest;
	}
	
	public boolean isThisRest() {
		return isRest;
	}
	
}
