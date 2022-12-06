package KeyBoardGame;

import game.*;
import ranking.RankManager;

public class StartKeyboard {

	private RankManager rankManager;
	
	public StartKeyboard(RankManager rm){
		rankManager = rm;
		startGame();
	}
	
	public void startGame() {
		int box_size = 350; // 게임 화면 크기 조정
		int ball_radius = 10;
		int brick_map_width = box_size - box_size / 4;
		int brick_map_height = box_size / 4;
		Box box = new Box(box_size);

		BrickMap board = new BrickMap(3, 7, brick_map_width, brick_map_height);
		Player player = new Player(box_size / 2 - box_size / 10, box_size - 8, box_size / 5);
		MovingBall ball = new KMovingBall(box_size / 2, box_size / 2, ball_radius, box, board, player);

		BallWriter ball_writer = new BallWriter(ball);
		BoxWriter box_writer = new BoxWriter(box);
		BrickWriter brick_writer = new BrickWriter(board);
		ScoreWriter score_writer = new ScoreWriter(player, box_size);
		KAnimationWriter writer = new KAnimationWriter(box_writer, ball_writer, brick_writer,  score_writer, player, box_size);

		new BrickBreakerController(ball, writer).runAnimation();
	}
}
