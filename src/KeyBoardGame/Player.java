package KeyBoardGame;

import java.awt.*;

public class Player {
	private int playerX;
	private int playerY;
	private int height;
	private int score;
	
	public Player(int initial_x, int initial_y, int size) {
		playerX = initial_x;
		playerY = initial_y;
		height = size;
		score = 0;
	}
	
	public void moveRight() { playerX += 20; }
	public void moveLeft() { playerX -= 20; }
	public int getX() { return playerX; }
	public int getY() { return playerY; }

	public void paintComponent(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(playerX, playerY, height, 8); 
	}
	
	public boolean isContact(int ball_x, int ball_y, int ball_radius) {
		Rectangle ballRect = new Rectangle(ball_x, ball_y, ball_radius, ball_radius);

		return ballRect.intersects(new Rectangle(playerX, playerY, height, 8));
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
