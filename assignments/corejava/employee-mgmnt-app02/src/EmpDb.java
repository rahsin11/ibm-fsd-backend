import java.sql.*;

public class EmpDb {
	  static Connection conn = null;
		static Statement stmt = null;
		static PreparedStatement pstmt = null;
		static ResultSet rs = null;
		
		EmpDb(){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","training","training");
				//stmt = conn.createStatement();
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	
		public void addEmployee(Employee employee) throws SQLException
	{
		
		int id = employee.getId();
		String name = employee.getName();
		String des = employee.getDes();
		String sal = employee.getSal();
		 String query = " insert into details (id,name, designation,salary)"
			        + " values (?, ?, ?, ?)";
		 PreparedStatement preparedStmt = conn.prepareStatement(query);
	      preparedStmt.setInt (1, id);
	      preparedStmt.setString (2, name);
	      preparedStmt.setString (3, des);
	      preparedStmt.setString (4, sal);
	      
		preparedStmt.execute();
		conn.close();
		
	}
	
	public void displayEmployee() throws SQLException
	{
			
		 String query = " select * from  details";
		 PreparedStatement preparedStmt = conn.prepareStatement(query);
		 ResultSet rs = preparedStmt.executeQuery();
		
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String designation = rs.getString("designation");
				String salary = rs.getString("salary");

				// Display values
				System.out.format("\t%d \t%s \t%s \t%s\n", id, name, designation, salary);
			}
		 
		 
		 conn.close();
		 
		
		
	}

}