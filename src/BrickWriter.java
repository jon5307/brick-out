import java.awt.*;

public class BrickWriter {
	private Brick GameMap[][];
	private int row;
	private int col;
	private int b_height;
	private int b_width;
	
	public BrickWriter(BrickMap bm) {
		GameMap = bm.getMap();
		row = bm.getRow();
		col = bm.getCol();
		
		b_height = bm.getAreaWidth() / row;
		b_width = bm.getAreaHeight() / col;
	}
	
	public void paintComponent(Graphics2D g) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (GameMap[i][j].getVisible() > 0) {
					g.setColor(Color.pink);
					g.fillRect(j * b_width + 80, i * b_height + 50, b_width, b_height);
					
					g.setStroke(new BasicStroke(3));
					g.setColor(Color.black);
					g.drawRect(j * b_width + 80, i * b_height + 50, b_width, b_height);
				}
			}
		}
	}
}
