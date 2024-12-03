package dbinput;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectApp {
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
					String sqlSelectQueary = "Select * From player";
					resultset = statement.executeQuery(sqlSelectQueary);
					
					if(resultset!=null) {
						
						// 5.process the result to get data
						System.out.println("Id\tName\t\tTeam");
						
						while(resultset.next()) {
							int id = resultset.getInt(1);
							String playername = resultset.getString("name");
							String playerteam = resultset.getString("team");
							System.out.println(id+"\t"+playername+"\t"+playerteam);
						}
						
					}
				}
			}
		}catch(SQLException sqlexp) {
			sqlexp.printStackTrace();
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			
			if(resultset!=null) {
				resultset.close();
			}
			if(statement!=null) {
				statement.close();
			}
			if(connection!=null) {
				connection.close();
			}
		}
				
	}
}
