package ranking;

import java.io.*;

public class RankWriter {

  private PrintWriter outfile;

  public RankWriter(String file_name) {
    try {
      outfile = new PrintWriter(new FileWriter(file_name));
    }
    catch (Exception e) {
      System.out.println("PayrollWriter Error: " + file_name);
      throw new RuntimeException(e.toString());
    }
  }

  public void close() {
    outfile.close();
  }

  public void writeRank(Ranker[] rankers, int headcount) {
    for (int i = 0; i < headcount; i++) {
      outfile.println(rankers[i].name() + "," + rankers[i].score());
    }
    outfile.print("!");
  }

}