package KeyBoardGame;

import game.*;

public class StartKeyboard {

	
	public StartKeyboard(){
		startGame();
	}
	
	public void startGame() {
		int box_size = 350; // 게임 화면 크기 조정
		int ball_radius = 10;
		int brick_map_width = box_size - box_size / 4;
		int brick_map_height = box_size / 4;
		Box box = new Box(box_size);
		int first_round = 1;

		BrickMap board = new KBrickMap(3, 7, brick_map_width, brick_map_height, first_round);
		Player player = new Player(box_size / 2 - box_size / 10, box_size - 8, box_size / 5, box_size);
		MovingBall ball = new KMovingBall(box_size / 2, box_size / 2, ball_radius, box, board, player); // box_size / 2
		
		BallWriter ball_writer = new BallWriter(ball);
		BoxWriter box_writer = new BoxWriter(box);
		BrickWriter brick_writer = new KBrickWriter(board);
		ScoreWriter score_writer = new ScoreWriter(player, box_size);
		RoundWriter round_writer = new RoundWriter(first_round, box);
		KAnimationWriter writer = new KAnimationWriter(box_writer, ball_writer, brick_writer,  score_writer, round_writer, player, box_size);

		new KBrickBreakerController(ball, writer).runAnimation();
	}
}
