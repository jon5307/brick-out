package ranking;

import java.sql.*;

public class OnlineRankMan {
    private Connection conn;
    private Statement state = null;

    public OnlineRankMan(){
        OnlineLeaderBoard lb = new OnlineLeaderBoard();
    }

    public void onlineRegRank(String name, int score){
        int rank = 0;
        try {
            state.executeUpdate(" INSERT INTO Brick (Ranking, Name, Score) " +
                    "VALUE ("+rank+","+name+","+score+") ");
        } catch (SQLException e) {
            System.out.println("insert err");
        }
    }
}
