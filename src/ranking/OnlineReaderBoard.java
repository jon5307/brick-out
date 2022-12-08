package ranking;

import java.sql.*;

public class OnlineReaderBoard {

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection conn = null;

        String url = "jdbc:mysql://내인생폭8.온라인.한국:3306/Brick";
        String user = "root";
        String pw = "111111";

        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, pw);

        return conn;
    }
}
