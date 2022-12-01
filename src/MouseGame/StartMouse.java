package MouseGame;

import ranking.RankManager;

public class StartMouse {

  private RankManager rankManager;

  public StartMouse(RankManager rm) {
    rankManager = rm;
    startGame();
  }

  public void startGame(){

    int box_size = 350; // 게임 화면 크기 조정
    int ball_radius = 10;
    int brick_map_width = box_size - box_size / 4;
    int brick_map_height = box_size / 4;
    Box box = new Box(box_size);

    BrickMap board = new BrickMap(3, 7, brick_map_width, brick_map_height);
    MovingBall ball = new MovingBall(box_size / 2, box_size / 2, ball_radius, box, board);

    BallWriter ball_writer = new BallWriter(ball);
    BoxWriter box_writer = new BoxWriter(box);
    BrickWriter brick_writer = new BrickWriter(board);

    AnimationWriterMouse writer = new AnimationWriterMouse(box_writer, ball_writer, brick_writer, box_size);

    new BrickBreakerController(ball, writer).runAnimation();
  }

}
