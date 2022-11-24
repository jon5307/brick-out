
public class Start {

	public static void main(String[] args) {
		int box_size = 700;
		int ball_radius = 20;
		Box box = new Box(box_size); // 게임 플레이 창 크기
		BrickMap board = new BrickMap(3, 7, 150, 540); // brick을 3 * 7 행렬로 만든다. 
		Player player = new Player(310, 690, 100); // 플레이어 바 위치 (310, 690), 가로 길이: 100
		MovingBall ball = new MovingBall(350, 350, ball_radius, box, board, player); // 공 위치 (350, 350)
		
		BallWriter ball_writer = new BallWriter(ball);
		BoxWriter box_writer = new BoxWriter(box);
		BrickWriter brick_writer = new BrickWriter(board);
		
		AnimationWriter writer = new AnimationWriter(box_writer, ball_writer, brick_writer, player);

		new BrickBreakerController(ball, writer).runAnimation();
	}

}
