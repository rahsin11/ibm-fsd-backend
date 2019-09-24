package com.example.empapp2.service;

import java.util.*;

import java.util.concurrent.Callable;
import java.io.*;
import java.sql.SQLException;

import com.example.empapp2.dom.empdb;
import com.example.empapp2.employee.*;


public class EmpServices implements ServiceInterface {

//	ArrayList<Emp> EmpList = new ArrayList<Emp>();
	Scanner sc = new Scanner(System.in);
	
	empdb db= new empdb();

	public EmpServices() throws SQLException ,ClassNotFoundException{
		super();
	
	}

	@Override
	public void addUser() throws SQLException {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter ID, NAME , DESIGNATION,COMPANY");
		Emp n=new Emp(sc.nextInt(),sc.next(),sc.next(),sc.next());
		
		db.addToDB(n);
	
		

	}

	@Override
	public void removeUser() throws SQLException {
		System.out.println("Enter ID to delete");
   db.deleteById(sc.nextInt());

	}

	@Override
	public void viewAll() throws SQLException {

		
		db.viewfromdb();
		
		
	}

	@Override
	public void view() throws SQLException {
		
		System.out.println("ENTER ID to search");
		int i=sc.nextInt();
		db.viewById(i);

		

	}

	@Override
	public void importEmp() throws FileNotFoundException {
		// TODO Auto-generated method stub
//		File file= new File("C:\\Training\\ibm-fsd-backend\\assignments\\corejava\\employee-mgmt-app01\\src\\export.txt");
//		Scanner sc= new Scanner(file);
//		String s;
//	
//	    while(sc.hasNext())
//	    {
//	    	Emp n =new Emp();
//		s=sc.nextLine();
//		System.out.println(s);
//		String[] str= s.split(",");
//		n.setEmpId(( Integer.parseInt(str[0])));
//		n.setEmpName(str[1]);
//		n.setSalary(Float.parseFloat(str[2]));
//		EmpList.add(n);
//	    }
//		
//		
//		
//	
//			
//		sc.close();
//		
	}

	@Override
	public void exportEmp() throws IOException {
		// TODO Auto-generated method stub
//		PrintWriter out=null;
//		  out = new PrintWriter(new FileWriter("C:\\Training\\ibm-fsd-backend\\assignments\\corejava\\employee-mgmt-app01\\src\\export.txt"));
//
//	for(int i=0;i<EmpList.size();i++)
//	{
//		String s1= Integer.toString(EmpList.get(i).getEmpId());
//		String s2=EmpList.get(i).getEmpName();
//		String s3=Float.toString(EmpList.get(i).getSalary());
//		
//		out.write(s1);
//		out.write(',');
//		out.write(s2);
//		out.write(',');	
//	    out.write(s3);
//	    out.write('\n');
//	}
//	out.flush();
//	
//	
//	
//	
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
}