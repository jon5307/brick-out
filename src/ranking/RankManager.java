package ranking;


public class RankManager {

  public final int HeadCount = 10;
  public final String rank_file = "rank.csv";
  private Ranker[] rankers;
  private RankBoard rankboard;
  private RankWriter rankwriter;

  public RankManager() {
    rankers = new Ranker[HeadCount];
    rankboard = new RankBoard(HeadCount);

    String name;
    int score;
    RankReader reader = new RankReader(rank_file);

    for (int i = 0; i < HeadCount; i++) {
      if (reader.getNextRecord()) {
        name = reader.name();
        score = reader.score();
        rankers[i] = new Ranker(name, score);
      }
    }
    reader.close();
  }

  /**
   * 랭킹에 등록한다
   * @param name 랭킹에 등록할 이름
   * @param score 점수
   * @return 등록후 랭킹 순위 (실패시 0)
   */
  public int regRank(String name, int score) {
    int rank = 0;
    for (int i = 0; i < HeadCount; i++) {
      if (rankers[i].score() == score) {
        rankers[i].setName(rankers[i].name() + "& " + name);
        break;
      }
      else if (rankers[i].score() < score) {
        for (int j = HeadCount - 1; j > i; j--) {
          rankers[j] = rankers[j - 1];
        }
        rankers[i] = new Ranker(name, score);
        break;
      }
    }
    return rank;
  }

  public void saveRank() {
    rankwriter = new RankWriter(rank_file);
    rankwriter.writeRank(rankers,HeadCount);
    rankwriter.close();
  }

  public void ViewRank() {
    rankboard.ViewRank(rankers);
  }

}
