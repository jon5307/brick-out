package MouseGame;

import java.awt.*;
import java.util.Random;

public class BrickWriter {
	private Brick GameMap[][];
	private int row;
	private int col;
	private int b_height;
	private int b_width;
	private int size;
	private int[][] brickhealth;
	private int p;

	public BrickWriter(BrickMap bm,BrickHealth bh) {
		GameMap = bm.getMap();
		row = bm.getRow();
		col = bm.getCol();
		size = bm.getAreaHeight() * 4;
		b_width = bm.getAreaWidth() / col;
		b_height = bm.getAreaHeight() / row;
		brickhealth = bh.getHealthMap();
		p = bm.getP();
	}

	public void paintComponent(Graphics2D g) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (GameMap[i][j].getVisible() > 0) {
					if (p == j) {
						g.setColor(Color.green);
						g.fillOval(j * b_width + size / 8 + 10, i * b_height + size / 8 + 7, 15,15);
					}
					else {
						g.setColor(Color.pink);
						g.fillRect(j * b_width + size / 8, i * b_height + size / 8, b_width, b_height);

						g.setStroke(new BasicStroke(3));
						g.setColor(Color.black);
						g.drawRect(j * b_width + size / 8, i * b_height + size / 8, b_width, b_height);
						g.setColor(Color.BLACK);
						g.drawString(Integer.toString(brickhealth[i][j]), j * b_width + size / 8 + 15, i * b_height + size / 8 + 17);
					}
				}
			}
		}

	}
}
