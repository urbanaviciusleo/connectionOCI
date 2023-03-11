package connectionOCI;
import java.sql.*;

public class ATPExample {
    public static void main(String[] args) {
        try {
        	
            // Load the JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Set up the JDBC URL
            String url = "jdbc:oracle:thin:@" + "your-database-info";
            // Set up the database credentials
            String user = "ADMIN";
            String databasePassword = "your-password-here";

            // Create a connection to the database
            Connection conn = DriverManager.getConnection(url, user, databasePassword);

            // Perform database operations here
            Statement stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            
            while (rs.next()) {
                String userEmail = rs.getString("email");
                String userName = rs.getString("username");
                String userPassword = rs.getString("password");
                String userCellphone = rs.getString("cellphone");
                System.out.println(userEmail + ", " + userName + ", " + userPassword + ", " + userCellphone);
            }

            // Close the connection
            conn.close();
            
            System.out.println("Finished");
            
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
