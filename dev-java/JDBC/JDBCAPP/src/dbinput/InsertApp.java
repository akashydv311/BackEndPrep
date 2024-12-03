package dbinput;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertApp {
	public static void main(String[] args) throws SQLException{
		
		// resources i'll use
		Connection connection = null;
		Statement statement = null;
		ResultSet resultset = null;
		
		// 2.Establish connection
		String url = "jdbc:mysql://localhost:3306/jdbcdb";
		String user = "root";
		String pass = "root";
		
		
		try {
			connection = DriverManager.getConnection(url, user, pass);
			
			if(connection!=null) {
				// 3.creation of statement for execution
				statement = connection.createStatement();
				
				if(statement!=null) {
					
					// 4.using statement object to execute the query
					String insertQuery = "INSERT INTO player (pid, name, team) VALUES (4, 'Jasprit Bhumraha', 'MI'),(5,'Shubman Gill', 'GT'),(6,'Yashsvai Jaishwal','RR')";
					int noOfRow = statement.executeUpdate(insertQuery);
					System.out.println("No of rows affected: "+ noOfRow);
	
				}
			}
		}catch(SQLException sqlexp) {
			sqlexp.printStackTrace();
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			
			if(statement!=null) {
				statement.close();
			}
			if(connection!=null) {
				connection.close();
			}
		}
				
	}
}
