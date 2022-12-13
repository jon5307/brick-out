package ranking;

import java.sql.*;

public class OnlineLeaderBoard {
    //데이터베이스 접근
    private Connection conn = null;
    private String url = "jdbc:mysql://db4free.net:3306/brick_out_game";
    private String user = "sohal03";
    private String pw = "11111111";


    public OnlineLeaderBoard(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pw);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver error");
        } catch (SQLException error){
            error.printStackTrace();
        }
    }

    public Connection connect(){
        return conn;
    }

}
