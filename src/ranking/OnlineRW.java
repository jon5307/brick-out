package ranking;

import javax.swing.*;
import java.awt.*;

public class OnlineRW extends JFrame{
    private int headCount;
    private Container cp;
    public OnlineRW(int headCount) {
        this.headCount = headCount;
        setTitle("Top 10");
        setSize(400, 500);
        cp = getContentPane();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public void ViewORank(OnlineRanker[] rankers){
        cp.removeAll();
        this.dispose();
        JPanel p1 = new JPanel(new GridLayout(headCount + 1, 3));
        p1.add(new JLabel("순위"));
        p1.add(new JLabel("이름"));
        p1.add(new JLabel("점수"));
        for (int i = 0; i < headCount; i++) {
            p1.add(new JLabel("" + (i + 1) + "위"));
            p1.add(new JLabel(rankers[i].getName()));
            p1.add(new JLabel("" + rankers[i].getScore()));
        }
        cp.add(p1);
        setVisible(true);
    }
}
