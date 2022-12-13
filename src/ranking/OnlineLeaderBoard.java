package ranking;

import java.sql.*;

public class OnlineLeaderBoard {
    private Connection conn = null;
    private String url = "jdbc:mysql://내인생폭8.온라인.한국:3306/Brick";
    private String user = "root";
    private String pw = "111111";


    public OnlineLeaderBoard(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pw);
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 오류");
        } catch (SQLException error){
            error.printStackTrace();
        }
    }

}
