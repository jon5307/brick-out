package ranking;

import static java.lang.Thread.sleep;

public class RankTest {
  public static void main(String[] args) throws InterruptedException {
    RankManager rm = new RankManager();
    rm.ViewRank();
    sleep(10000);
    rm.regRank("?", 450);
    rm.ViewRank();
  }
}
