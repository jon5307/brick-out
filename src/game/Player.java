package game;

import java.awt.*;

public class Player {
	private int playerX;
	private int playerY;
	private int width;
	private int score;
	private int box_size;
	
	public Player(int initial_x, int initial_y, int size, int box_size) {
		playerX = initial_x;
		playerY = initial_y;
		width = size;
		score = 0;
		this.box_size = box_size;
	}
	
	public void moveRight() { if(playerX < box_size - width) playerX += 20; }
	public void moveLeft() { if(playerX > 0) playerX -= 20; }
	public int getX() { return playerX; }
	public int getY() { return playerY; }

	public void paintComponent(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(playerX, playerY, width, 8);
	}
	
	public boolean isContact(int ball_x, int ball_y, int ball_radius) {
		Rectangle ballRect = new Rectangle(ball_x, ball_y, ball_radius, ball_radius);

		return ballRect.intersects(new Rectangle(playerX, playerY, width, 8));
	}
	
	/**
	 * 브릭을 하나 깨부실때마다 5점씩 획득
	 */
	public void plusScore() {
		score +=5 ;
	}
	
	/**
	 * @return 현재 점수
	 */
	public int getScore() {
		return score;
	}
}
