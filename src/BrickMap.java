public class BrickMap {
	private Brick GameMap[][];
	private int row;
	private int col;
	private int area_width;
	private int area_height;
	
	public BrickMap(int r, int c, int w, int h) {
		row = r;
		col = c;
		area_width = w;
		area_height = h;
		
		GameMap = new Brick[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				GameMap[i][j] = new Brick(i, j, row, col, area_width, area_height);
			}
		}
	}
	
	public Brick[][] getMap(){ return GameMap; }
	public int getRow() { return row; }
	public int getCol() { return col; }
	public int getAreaWidth() { return area_width; }
	public int getAreaHeight() { return area_height; }
	public void setBrickValue(int value, int row, int col) {
		GameMap[row][col].setVisible(value);
	}
	
}
