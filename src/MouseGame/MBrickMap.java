package MouseGame;

import game.Brick;
import game.BrickMap;

public class MBrickMap extends BrickMap {
	/**
	 * Brick의 집합체를 따로 관리하기 위해 만듬
	 *
	 * @param r 전체 BrickMap의 row 개수
	 * @param c 전체 BrickMap의 col 개수
	 * @param w BrickMap의 너비
	 * @param h BrickMap의 높이
	 */
	private int round = 1;
	public MBrickMap(int r, int c, int w, int h) {
		super(r, c, w, h);
	}

	@Override
	public void setBrick() {
		GameMap = new MBrick[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i == 0)
					GameMap[i][j] = new MBrick(j, i, row, col, area_width, area_height, 1); // 1은 아직 만들어지지 않은 round 개념을 피하기 위해 생성.
				else
					GameMap[i][j] = new MBrick(j, i, row, col, area_width, area_height, 0);
			}
		}
	}
	public boolean brickDown() {

		return false;
	}
	public boolean newSetBrick() {
		boolean gameover = false;
		for (int j = 0; j < col; j++) {
			if (GameMap[row-1][j].getVisible() == 1) {
				if (GameMap[row-1][j].getVisible() == 1) {
					gameover = true;
				}
			}
		}
		for (int i = 8; i > 0; i--) {
			for (int j = 0; j < col; j++) {
				GameMap[i][j].setVisible(GameMap[i - 1][j].getVisible());
				GameMap[i][j].setBrickHealth(GameMap[i - 1][j].getBrickHp());
				GameMap[i - 1][j].setVisible(0);
				GameMap[i - 1][j].setBrickHealth(0);
			}
		}
		for (int j = 0; j < col; j++) {
			GameMap[0][j] = new MBrick(j, 0, row, col, area_width, area_height, round + 1);
		}
		round += 1;
		return gameover;
	}
}
