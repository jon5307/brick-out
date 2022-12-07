package game;


import java.awt.*;

public abstract class BrickWriter {
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
	
	public abstract void paintComponent(Graphics2D g);
}
