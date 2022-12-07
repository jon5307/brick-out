package KeyBoardGame;

import game.Brick;

import java.awt.*;
import java.util.Random;

public class KBrick extends Brick {
	/**
	 * Brick을 하나씩 정의
	 *
	 * @param x     BrickMap에서의 열번호
	 * @param y     BrickMap에서의 행번호
	 * @param row   전체 BrickMap의 row 개수
	 * @param col   전체 BrickMap의 col 개수
	 * @param a_w   BrickMap의 너비
	 * @param a_h   BrickMap의 높이
	 * @param round
	 */
	public KBrick(int x, int y, int row, int col, int a_w, int a_h, int round) {
		super(x, y, row, col, a_w, a_h, round);
	}

	@Override
	public void setBrick(int round) {
		Random random = new Random();
		brick_hp = random.nextInt(round, round+3); // brick_hp를 무작위로 설정. 이는 round 수에 의존.
	}

	@Override
	public boolean isContact(int ball_x, int ball_y, int ball_radius) {
		brick_x = map_x * width + size / 8;
		brick_y = map_y * height + size / 8;

		Rectangle brickRect = new Rectangle(brick_x, brick_y, width, height);

		int border_x, boarder_y;
		for (int i = 0; i < 8; i++){
			border_x = ball_x + (int)(ball_radius * Math.cos(i * Math.PI / 4));
			boarder_y = ball_y + (int)(ball_radius * Math.sin(i * Math.PI / 4));
			if (brickRect.contains(border_x, boarder_y)) {
				return true;
			}
		}
		return false;
	}
}
