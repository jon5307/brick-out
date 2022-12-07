package game;


import java.awt.*;

public class BrickWriter {
	protected Brick[][] GameMap;
	protected int row;
	protected int col;
	protected int b_height;
	protected int b_width;
	protected int size;
	
	public BrickWriter(BrickMap bm) {
		GameMap = bm.getMap();
		row = bm.getRow();
		col = bm.getCol();
		size = bm.getAreaHeight() * 4;
		b_width = bm.getAreaWidth() / col;
		b_height = bm.getAreaHeight() / row;
	}
	
	public void paintComponent(Graphics2D g) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (GameMap[i][j].getVisible() > 0) {
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
	}
}
