package MouseGame;

import java.util.Random;

public class BrickMap {
	private Brick[][] GameMap;
	private int row;
	private int col;
	private int area_width;
	private int area_height;
	private int p;


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
		p = new Random().nextInt(col);

		GameMap = new Brick[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				GameMap[i][j] = new Brick(j, i, row, col, area_width, area_height);
			}
		}
	}

	public Brick[][] getMap(){ return GameMap; }
	public int getRow() { return row; }
	public int getCol() { return col; }
	public int getAreaWidth() { return area_width; }
	public int getAreaHeight() { return area_height; }
	public int getP() {return p;}
}
