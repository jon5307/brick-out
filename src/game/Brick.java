package game;

import java.awt.*;

public class Brick {
	private int visible = 1;
	private int map_x; // Brick의 열 번호
	private int map_y; // Brick의 행 번호
	private int height; // Brick의 높이
	private int width; // Brick의 너비 
	private int size; // box_size
	
	private int brick_x; // Brick의 좌표 (사각형 왼쪽 상단)
	private int brick_y; // 
	
	
	
	/**
	 * Brick을 하나씩 정의
	 * @param x BrickMap에서의 열번호
	 * @param y BrickMap에서의 행번호
	 * @param row 전체 BrickMap의 row 개수
	 * @param col 전체 BrickMap의 col 개수
	 * @param a_w BrickMap의 너비
	 * @param a_h BrickMap의 높이
	 */
	public Brick(int x, int y, int row, int col, int a_w, int a_h) {
		map_x = x;
		map_y = y;
		
		size = a_h * 4; // a_h는 Start 클래스에서의 brick_map_height로 *4하면 box_size를 구할 수 있음

		height = a_h / row;
		width = a_w / col;
	}
	
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
	
	public void setVisible(int n) { visible = n; }
	public int getVisible() { return visible; }
	public int getX() { return brick_x; }
	public int getY() { return brick_y; }
	public int getWidth() { return width; }
}
