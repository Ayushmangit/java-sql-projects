
import java.sql.*;

public class Main {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/testdb"; // Change to your DB
		String user = "root"; // Your MySQL user
		String password = "root"; // Your MySQL password

		try {
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement stmt = conn.createStatement();

			int a = stmt.executeUpdate("insert into ayushmanDB values(4, 'dichak',21)");
			System.out.println(a);

			ResultSet rs = stmt.executeQuery("SELECT * FROM ayushmanDB"); // Change table

			while (rs.next()) {
				System.out.println(rs.getString("id") + " " + rs.getString("name")); // First column
			}

			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("Connection failed: " + e.getMessage());
		}
	}
}
