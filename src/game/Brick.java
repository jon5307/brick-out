package game;

import java.awt.Rectangle;
import java.util.Random;

public abstract class Brick {
	protected int visible = 1;
	protected int map_x; // Brick의 열 번호
	protected int map_y; // Brick의 행 번호
	protected int height; // Brick의 높이
	protected int width; // Brick의 너비
	protected int size; // box_size
	
	protected int brick_x; // Brick의 좌표 (사각형 왼쪽 상단)
	protected int brick_y; //
	
	protected int brick_hp; // 공이 닿아야 하는 횟수를 brick의 체력(hp)로 설정
	protected int x_bound; // BrickMap의 너비


	
	/**
	 * Brick을 하나씩 정의
	 * @param x BrickMap에서의 열번호
	 * @param y BrickMap에서의 행번호
	 * @param row 전체 BrickMap의 row 개수
	 * @param col 전체 BrickMap의 col 개수
	 * @param a_w BrickMap의 너비
	 * @param a_h BrickMap의 높이
	 */
	public Brick(int x, int y, int row, int col, int a_w, int a_h, int round) {
		map_x = x;
		map_y = y;
		
		size = a_h * 4; // a_h는 Start 클래스에서의 brick_map_height로 *4하면 box_size를 구할 수 있음

		height = a_h / row;
		width = a_w / col;
		setBrick(round);
	}

	public abstract void setBrick(int round);
	public abstract boolean isContact(int ball_x, int ball_y, int ball_radius);
	
	public boolean setVisible(int n) { visible = n; return true; } // MovingBall의 이중 for문에서 ? : 연산을 위해 return값 수정
	public int getVisible() { return visible; }
	public int getX() { return brick_x; }
	public int getY() { return brick_y; }
	public int getHeight() { return height; }
	public int getWidth() { return width; }
	public int getBrickHp() { return brick_hp; }
	public boolean setBrickHealth(int n) {brick_hp = n; return true;}
	public boolean setBrickHp() { brick_hp -= 1; return false; } //dummy의 참과 거짓을 구분하기 위해 false로 바꿈
}
