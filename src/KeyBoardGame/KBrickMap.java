package KeyBoardGame;

import game.Brick;
import game.BrickMap;

public class KBrickMap extends BrickMap {

	private int rest_brick_count = 21;  // static으로 했을 시에 KMovingBall에서 참조를 갱신하지 않게 됨.
	protected int round;

	//private static int round = 1; // 삭제: round를 파라미터에 추가해서 문제가 사라짐. 
	//static으로 해야 되더라... 아래 Override한 게 round 선언하고 대입은 안 된 시점에서 실행되는 것 같습니다...  
	//private int round = 1;
	
	/**
	 * Brick의 집합체를 따로 관리하기 위해 만듬
	 *
	 * @param r 전체 BrickMap의 row 개수
	 * @param c 전체 BrickMap의 col 개수
	 * @param w BrickMap의 너비
	 * @param h BrickMap의 높이
	 */
	public KBrickMap(int r, int c, int w, int h, int round) { // 라운드 기능 추가에 따른 int type parameter 추가
		super(r, c, w, h);
		this.round = round;
		setBrick(round);
	}


	public void setBrick(int round) { // 라운드 기능 추가에 따른 int type parameter 추가
		System.out.println("Created");
		GameMap = new KBrick[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				GameMap[i][j] = new KBrick(j, i, row, col, area_width, area_height, round); // 1은 아직 만들어지지 않은 round 개념을 피하기 위해 생성.
				//System.out.println(round);
			}
		}
	}
	
	public void BickMapDecrement() {
		rest_brick_count -= 1;
	}
	
	public int getRestBrick() {
		return rest_brick_count;
	}
	
	public int getRound() {
		return round;
	}
	
}
