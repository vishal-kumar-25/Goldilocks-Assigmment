import java.sql.*;

public class ReadFromDB {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "root";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM test");

            while (rs.next()) {
                System.out.println(
                    rs.getString("emp_name") + " - " + rs.getInt("emp_age")
                );
            }

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}