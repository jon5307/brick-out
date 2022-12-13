package KeyBoardGame;

import game.*;

public class InitializeForNextRound {

	private int round = 1;
	private int score;
	private int life;
	int box_size = 350; // 게임 화면 크기 조정
	int brick_map_width = box_size - box_size / 4;
	int brick_map_height = box_size / 4;
	
	//KBrickMap => GameMap (KBrick)
	
	//KBrick_Writer -> GameMap <- KMovingBall
	public int initialization(BrickWriter brick_writer, MovingBall ball) {
		BrickMap new_bm = new KBrickMap(3, 7, brick_map_width, brick_map_height, round);
		if (brick_writer instanceof KBrickWriter && ball instanceof KMovingBall) {
			((KBrickWriter)brick_writer).changeBrickMap(new_bm);
			((KMovingBall)ball).changeBrickMap(new_bm);
		}
		return round++;
	}
	
	public int getRound() { return round; }
}
