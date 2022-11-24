import java.awt.Rectangle;

public class Brick {
	private int visible = 1;
	private int map_x;
	private int map_y;
	private int height;
	private int width;
	private int brick_x;
	private int brick_y;
	
	public Brick(int y, int x, int row, int col, int a_w, int a_h) {
		map_x = x;
		map_y = y;
		
		height = a_w / row;
		width = a_h / col;
	}
	
	public boolean isContact(int ball_x, int ball_y, int ball_radius) {
		brick_x = map_x * width + 80;
		brick_y = map_y * height + 50;
		
		Rectangle ballRect = new Rectangle(ball_x, ball_y, ball_radius, ball_radius);
		Rectangle brickRect = new Rectangle(brick_x, brick_y, width, height);
		
		if (ballRect.intersects(brickRect)) { 
			return true; 
		}
		else { return false; }
	}
	
	public void setVisible(int n) { visible = n; }
	public int getVisible() { return visible; }
	public int getX() { return brick_x; }
	public int getY() { return brick_y; }
	public int getWidth() { return width; }
}
