package game;

public abstract class BrickMap {
	protected Brick[][] GameMap;
	protected int row;
	protected int col;
	protected int area_width;
	protected int area_height;
	
	/**
	 * Brick의 집합체를 따로 관리하기 위해 만듬
	 * @param r 전체 BrickMap의 row 개수
	 * @param c 전체 BrickMap의 col 개수
	 * @param w BrickMap의 너비
	 * @param h BrickMap의 높이
	 */
	public BrickMap(int r, int c, int w, int h) {
		row = r;
		col = c;
		area_width = w;
		area_height = h;
		setBrick();
	}
	public abstract void setBrick();
	public Brick[][] getMap(){ return GameMap; }
	public int getRow() { return row; }
	public int getCol() { return col; }
	public int getAreaWidth() { return area_width; }
	public int getAreaHeight() { return area_height; }
	
}
