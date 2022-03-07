class Employee
{
private int employeeId; 
private String employeeName;
private double salary;
private static String cname="IBM";
public Employee()
{
	System.out.println("Default Constructor");
}
public Employee(int employeeId, String employeeName, double salary)
{   
    System.out.println("3 parameterized Constructor");
	this.employeeId=employeeId;
	this.employeeName=employeeName;
	this.salary=salary;
}
public void setEmployeeId(int employeeId)
{
	this.employeeId=employeeId;
}
public void setEmployeeName(String employeeName)
{
	this.employeeName=employeeName;
}
public void setSalary(double salary)
{
	this.salary=salary;
}
public int getEmployeeId()
{
	return employeeId;
}
public String getEmployeeName()
{
	return employeeName;
}
public double getSalary()
{
	return salary;
}
public String getCname()
{
	return cname;
}

}