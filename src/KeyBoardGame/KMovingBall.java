package KeyBoardGame;

import game.*;

public class KMovingBall extends MovingBall {

	private int x_init;
	private int y_init;
	
	public KMovingBall(int x_initial, int y_initial, int r, Box box, BrickMap bm, Player p) {
		super(x_initial, y_initial, r, box, bm,p);
		x_init = x_initial;
		y_init = y_initial;
		player = p;
		System.out.println(bm);
	}
	
	public void changeBrickMap(BrickMap new_bm) {
		System.out.println(game);
		game = new_bm;
		System.out.println(game);
		x_pos = x_init;
		y_pos = y_init;
	}
	
	public void move (int time_units) {
		// 충돌시 방향 변경
		boxCrash();

		// 공 이동
		x_pos += x_velocity * time_units;
		y_pos += y_velocity * time_units;

		if (player.isContact((int) x_pos, (int) y_pos, radius)) {
			y_velocity *= -1;
		}

		Brick[][] game_map;
		game_map = game.getMap();
		int x = (int) x_pos;
		int y = (int) y_pos;
		for (int i = 0; i < game_map.length; i++) {
			for (int j = 0; j < game_map[0].length; j++) {
				if (game_map[i][j].getVisible() == 1 && game_map[i][j].isContact((int) x_pos, (int) y_pos, radius)) {
					//game_map[i][j].setVisible(0);
					Brick b = game_map[i][j];
					boolean dummy = b.getBrickHp() <= 1 ? b.setVisible(0) : b.setBrickHp(); // dummy값은 ? : 연산을 위해 생성.
					// 공이 닿았을 때 브릭의 체력이 0이면(== 닿기 전까지 체력이 1 이하) visible을 0으로, 그렇지 않으면 brick_hp -= 1
					if (dummy) {
						if (game instanceof KBrickMap) {
							((KBrickMap) game).BickMapDecrement();
						}
						player.plusScore(); //dummy가 참이면 브릭을 하나 부순 것이므로 점수를 올려줌
					}
					brickCrash(b,x,y);
				}
			}
		}
	}
}
