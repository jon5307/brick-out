package ranking;

import java.io.*;
import java.util.*;

public class RankReader {

  private BufferedReader infile;
  private final String EOF = "!";
  private String name;
  private int score;

  public RankReader(String file_name) {
    try {
      infile = new BufferedReader(new FileReader(file_name));
    }
    catch (Exception e) {
      System.out.println("RankReader Error - bad file name: " );
      throw new RuntimeException(e.toString());
    }
  }

  public String name() { return name; }
  public int score() { return score; }

  public void close() {
    try { infile.close(); }
    catch (IOException e) {
      System.out.println("RankReader Warning - file close failed");
    }
  }

  public boolean getNextRecord() {
    boolean result = false;
    try {
      if (infile.ready()) {
        String line = infile.readLine();
        StringTokenizer t = new StringTokenizer(line, ",");
        String s = t.nextToken().trim();
        if (! s.equals(EOF))
          if (t.countTokens() == 1) {
            name = s;
            score = Integer.parseInt((t.nextToken().trim()));
            result = true;
          }
          else {
            throw new RuntimeException(line);
          }
      }
    }
    catch (IOException e) {
      System.out.println("RankReader Error : " + e.getMessage());
    }
    catch (RuntimeException e) {
      System.out.println("RankReader Error - bad record format: " + e.getMessage() + " Skipping");
      result = getNextRecord(); // 다음 줄 시도
    }
    return result;
  }

}