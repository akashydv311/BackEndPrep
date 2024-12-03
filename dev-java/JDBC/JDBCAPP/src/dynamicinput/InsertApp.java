package dynamicinput;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertApp {
	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		Connection connection = null;
		Statement statement = null;
		
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
					System.out.println("Enter id name team");
					int id = sc.nextInt();
					String name = sc.next();
					String team = sc.next();
					
					String insertQuery = String.format("insert into player(pid,name,team) Values(%d, '%s', '%s')",id, name, team);
					System.out.println(insertQuery);
					int noOfRows = statement.executeUpdate(insertQuery);
					
//					System.out.println("Number of row inserted: "+ noOfRows);
				}
			}
			
		}catch (SQLException ex) {
			ex.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			// close resourse
			int count = 0;
			
			if(statement!=null) {
				statement.close();
				++count;
			}
			if(connection!=null) {
				connection.close();
				++count;
			}
			if(sc!=null) {
				sc.close();
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
