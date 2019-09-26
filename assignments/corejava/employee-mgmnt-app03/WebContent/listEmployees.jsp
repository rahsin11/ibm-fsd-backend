<%@page import="com.examples.empapp.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Employees</title>
</head>
<body>
	<% List<Employee> employees = (List) request.getAttribute("empList");
	   out.print("No of employees: " + employees.size());
	 %>
	<h3>List Employees</h3>
	<table>
		<thead> 
			<tr>
				<td>ID</td>
				<td>Name</td>
				<td>Age</td>
				<td>Designation</td>
				<td>Department</td>
				<td>Country</td>
				<td>Edit</td>
				<td>Delete</td>
			</tr> 
		</thead>
		<tbody>
			<% for(Employee emp: employees) { %>
			<tr>
				<td><%= emp.getEmpId() %> </td>
				<%Integer id = 1; %>
				<td><%= emp.getName() %> </td>
				<td><%= emp.getAge() %> </td>
				<td><%= emp.getDesignation() %> </td>
				<td><%= emp.getDepartment() %> </td>
				<td><%= emp.getCountry() %> </td>
				<td><a href="updateEmployee.jsp?employeeId=<%= emp.getEmpId() %>" >Update</a> </td>
				<td><a href="deleteEmployee?employeeId=<%= emp.getEmpId() %>" >Delete</a> </td>
			</tr>
			<%} %>
		</tbody>
		</tbody>
	</table>
	<br>
	<a href="addEmployee.jsp">Add Employee</a>
</body>
</html>