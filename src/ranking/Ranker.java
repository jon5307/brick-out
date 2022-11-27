package ranking;

public class Ranker {

  private String name;
  private int score;

  public Ranker(String name, int score) {
      this.name = name;
      this.score = score;
  }

  public String name() { return name; }
  public void setName(String name) { this.name = name; }
  public int score() { return score; }

}
