import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpService {
	
	ArrayList<Employee> employeeList = new ArrayList<Employee>();
	EmpDb db = new EmpDb();
	java.util.Scanner sc= new java.util.Scanner(System.in);

	public void add(Employee employee) throws SQLException {
		db.addEmployee(employee);
				
	}

	public void viewAll() throws SQLException {
		db.displayEmployee();
		
	}

	public void update(int id) {
//		Employee echange = null;
//		System.out.println("Enter ID of the employee to be updated: ");
//		int id = sc.nextInt();
		for(Employee e : employeeList) {
			if(id == e.getId())
			{
				EmpMain.getDetails();
			}
			else
			{
				System.out.println("Employee doesn't exist. Cannot update.");
				break;
			
			}
		}
		
		
	}

	public void delete(int id) {
		
		for(Employee e : employeeList) {
			if(id == e.getId())
			{
				employeeList.remove(e);
				break;
				
			}
		}
		
		
	}

	public void view(int id) {
		
			for(Employee e : employeeList) {
				if(id == e.getId())
				{
					System.out.println("ID: "+e.getId()+" Name: "+e.getName()+" Designation: "+e.getDes()+" Salary: "+e.getSal());
					break;
					
				}
				
			}		
	}

	public void imported() {
		// TODO Auto-generated method stub
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"C:\\Users\\AmulyaMeka\\Documents\\details.txt"));
			String line = reader.readLine();
			while (line != null) {
				//System.out.println(line);
				String []tokens = line.split(",");
				Employee emp = new Employee(Integer.parseInt(tokens[0]),tokens[1],tokens[2],tokens[3]);
				employeeList.add(emp);
				line = reader.readLine();
			}
			reader.close();
			System.out.println("File imported successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void exported() {
		 try{    
	           FileWriter fw=new FileWriter("C:\\Users\\AmulyaMeka\\Documents\\details.txt");  
	           for(Employee e : employeeList)
	           {
	        	   fw.write("Id: "+e.getId()+" Name: "+e.getName()+" Designation: "+e.getDes()+" Salary: "+e.getSal()+"\n"); 
	        	   
	           }
	              
	           fw.close();    
	          }
		 catch(Exception e){System.out.println(e);}    
	          System.out.println("File exported succesfully");    
		
	}

	

}