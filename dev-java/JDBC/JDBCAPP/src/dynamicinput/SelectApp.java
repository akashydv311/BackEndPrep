package dynamicinput;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectApp {
	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		Connection connection = null;
		Statement statement = null;
		ResultSet resultset = null;
		
		// load and register the driver
		// automatic
		
		// 2.getConnection
		String url = "jdbc:mysql://localhost:3306/jdbcdb";
		
		System.out.println("Enter DB user name: ");		
		String user = sc.next();
		
		System.out.println("Enter DB password: ");
		String pass = sc.next();
		
		try {
			
			connection = DriverManager.getConnection(url, user, pass);
			
			if(connection!=null) {
				// 3. Query Statement
				statement = connection.createStatement();
				
				if(statement!=null) {
					// 4. Execute 
					String selectQuery = "Select * from player";
					resultset = statement.executeQuery(selectQuery);
					
					System.out.println("\nTeam\tName");
					
					if(resultset!=null) {
						while(resultset.next()) {
							String playerName = resultset.getString("name");
							String playerTeam = resultset.getString("team");
							System.out.println(playerTeam+" \t"+playerName);
						}
					}
				}
			}
			
		}catch (SQLException ex) {
			ex.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			// close resourse
			int count = 0;
			if(resultset!=null) {
				resultset.close();
				++count;
			}
			if(statement!=null) {
				statement.close();
				++count;
			}
			if(connection!=null) {
				connection.close();
				++count;
			}
			if(count==3) {
				System.out.println("\n*******All resources close!*******");
			}else {
				System.out.println("\n*******All resourses not closed!******");
			}
	
		}
		
		
		
	}
}
