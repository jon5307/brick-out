package ranking;

import static java.lang.Thread.sleep;

public class RankTest {
  public static void main(String[] args) throws InterruptedException {
    RankManager rm = new RankManager();
    rm.ViewRank();
    sleep(5000);
    System.out.println(rm.regRank("?", 460));
    rm.ViewRank();
  }
}
