package ranking;

import javax.swing.*;
import java.awt.*;

public class RankBoard extends JFrame {

  private int headCount;
  private Container cp;

  public RankBoard(int headCount) {
    this.headCount = headCount;
    setTitle("Ranking");
    setSize(300, 300);
    cp = getContentPane();
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

  public void ViewRank(Ranker[] rankers){
    cp.removeAll();
    this.dispose();
    JPanel p1 = new JPanel(new GridLayout(headCount + 1, 3));
    p1.add(new JLabel("순위"));
    p1.add(new JLabel("이름"));
    p1.add(new JLabel("점수"));
    for (int i = 0; i < headCount; i++) {
      p1.add(new JLabel("" + (i + 1) + "위"));
      p1.add(new JLabel(rankers[i].name()));
      p1.add(new JLabel("" + rankers[i].score()));
    }
    cp.add(p1);
    setVisible(true);
  }
}
