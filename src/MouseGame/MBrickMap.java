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
	public MBrickMap(int r, int c, int w, int h, int round) { // 라운드 기능 추가에 따른 int type parameter 추가
		super(r, c, w, h, round);
	}

	@Override
	public void setBrick(int round) { // 라운드 기능 추가에 따른 int type parameter 추가
		GameMap = new MBrick[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				GameMap[i][j] = new MBrick(j, i, row, col, area_width, area_height, 1); // 1은 아직 만들어지지 않은 round 개념을 피하기 위해 생성.
			}
		}
	}
}
