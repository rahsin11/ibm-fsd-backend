import java.util.*;
import java.io.*;


public class Emp {
	String EmpName ;
	int EmpId;
	float Salary;
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	public Emp(String empName, int empId, float salary) {
		super();
		EmpName = empName;
		EmpId = empId;
		Salary = salary;
	}
	
	
	public Emp() {
		super();
	}


//	ArrayList<Emp> EmpList = new ArrayList<Emp>();
//	
//	
//	
//	@Override
//	public void addUser() {
//		Scanner sc= new Scanner(System.in);
//		// TODO Auto-generated method stub
//		System.out.println("ENTER EMPLOYEE DETAILS Name,Id,Salary");
//		String name=sc.next();
//		int id=sc.nextInt();
//		float salary= sc.nextFloat();		
//		
//		Emp x= new Emp(name,id,salary);
//		
//		
//		EmpList.add(x);
//		
//		
//	}
//	@Override
//	public void removeUser() {
//		// TODO Auto-generated method stub
//		System.out.println("ENTER ID of the employee to remove");
//		Scanner sc= new Scanner(System.in);
//		int id=sc.nextInt();
//		int t = -1;
//		for(int i=0;i<EmpList.size();i++)
//		{
//			if(id==EmpList.get(i).EmpId)
//				t=i;
//		}
//		System.out.println("Index" + t);
//		if(t!=-1)
//		EmpList.remove(t);
//		else
//		System.out.println("FAILED TO REMOVE ID NOT FOUND");
//		
//		
//		
//		
//	}
//	@Override
//	public void viewAll() {
//		// TODO Auto-generated method stub
//EmpList.forEach(u->{
//	System.out.println("ID :" + u.EmpId);
//	System.out.println("NAME : " + u.EmpName);
//});
//		
//	}
//	@Override
//	public void view() {
//		// TODO Auto-generated method stub
//		
//	}
//	public void impEmp() throws Exception {
//		// TODO Auto-generated method stub
//		File file= new File("C:\\Training\\ibm-fsd-backend\\assignments\\corejava\\employee-mgmt-app01\\src\\import.txt");
//		Scanner sc= new Scanner(file);
//		String s;
//	
//		
//		s=sc.nextLine();
//		String[] str= s.split(",");
//		setEmpId(( Integer.parseInt(str[1])));
//		setEmpName(str[0]);
//		setSalary(Float.parseFloat(str[2]));
//		
//		
//	
//			
//		sc.close();
//	}
//	
	
	
	

}