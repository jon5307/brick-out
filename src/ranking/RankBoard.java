package ranking;

import javax.swing.*;
import java.awt.*;

public class RankBoard extends JFrame {

  int headCount;

  public RankBoard(int headCount) {
    this.headCount = headCount;
    setTitle("Ranking");
    setSize(300, 300);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
  }

  public void ViewRank(Ranker[] rankers){
    this.dispose();
    Container cp = getContentPane();
    JPanel p1 = new JPanel(new GridLayout(headCount, 3));
    for (int i = 0; i < headCount; i++) {
      p1.add(new JLabel("" + (i + 1) + "위"));
      p1.add(new JLabel(rankers[i].name()));
      p1.add(new JLabel("" + rankers[i].score()));
    }
    cp.add(p1);
    setVisible(true);
  }
}
