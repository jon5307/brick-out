package ranking;

import java.sql.*;

public class OnlineRankMan {
    private Connection conn;
    private Statement state = null;

    private OnlineRanker[] rankers = new OnlineRanker[10];
    private OnlineRW rw = new OnlineRW(10);

    public OnlineRankMan(){
        try {
            OnlineLeaderBoard lb = new OnlineLeaderBoard();
            conn = lb.connect();
            state = conn.createStatement();
        } catch (SQLException e) {
            System.out.println("state error");
        }
    }

    public void onlineRegRank(String name, int score){
        int rank = 0;
        try {
            state.executeUpdate(" INSERT INTO brick_out_game.leaderboard (username, score) " +
                    "VALUE ('"+name+"', "+score+"); ");
        } catch (SQLException e) {
            System.out.println("insert error");
        }
    }

    public void mkRank(){
        try {
            ResultSet res = state.executeQuery(" SELECT * FROM leaderboard ORDER BY score DESC; ");
            int i=1;
            while(res.next()) {
                if(i<11){
                    int score = res.getInt("score");
                    String name = res.getString("username");
                    System.out.println("[" + i + "] " + name + " : " + score);
                    rankers[i-1] = new OnlineRanker(i, name, score);
                    i++;
                }else {
                    break;
                }
            }
        } catch (SQLException e) {
            System.out.println("select error");
        }
    }

    public void showRank(){
        rw.ViewORank(rankers);
    }
}
