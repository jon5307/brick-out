package MouseGame;

import game.BrickMap;
import game.BrickWriter;

import java.awt.*;

public class MBrickWriter extends BrickWriter {
	public MBrickWriter(BrickMap bm) {
		super(bm);
	}
	public void paintComponent(Graphics2D g) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (GameMap[i][j].getVisible() > 0) {
					g.setColor(Color.pink);
					g.fillRect(j * b_width, i * b_height, b_width, b_height);

					g.setStroke(new BasicStroke(3));
					g.setColor(Color.black);
					g.drawRect(j * b_width
							, i * b_height, b_width, b_height);

					g.setColor(Color.black);
					g.setFont(new Font("", Font.BOLD, size/100)); //box_size의 비율로 크기 바꿈
					g.drawString(GameMap[i][j].getBrickHp()+"",
							j * b_width + b_width / 2 - 3,
							i * b_height + b_height / 2 + 5);
				}
			}
		}
	}
}
