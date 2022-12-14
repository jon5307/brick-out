package MouseGame;

import game.*;

public class StartMouse {


	public StartMouse() {
		startGame();
	}

	public void startGame(){

		int box_size = 350; // 게임 화면 크기 조정
		int ball_radius = 10;
		int brick_map_width = box_size;
		int brick_map_height = box_size;
		Box box = new Box(box_size);

		Player player = new Player(0, box_size - 8, box_size, box_size);
		MBrickMap board = new MBrickMap(9, 9, brick_map_width, brick_map_height);
		MovingBall ball = new MMovingBall(box_size / 2, box_size - ball_radius -25, ball_radius, box, board, player);

		BallWriter ball_writer = new BallWriter(ball);
		BoxWriter box_writer = new BoxWriter(box);
		BrickWriter brick_writer = new MBrickWriter(board);
		ScoreWriter score_writer = new ScoreWriter(player, box_size);

		MAnimationWriter writer = new MAnimationWriter(box_writer, ball_writer, brick_writer, score_writer, player, box_size);

		new BrickBreakerController(ball, writer).runAnimation();
	}

}
