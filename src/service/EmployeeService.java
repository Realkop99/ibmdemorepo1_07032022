import entity.Employee;
import dao.EmployeeDAO;
import java.util.list;
public class EmployeeService
{
	private Employee emp;
	private EmployeeDAO edao;
	
	public List<Employee> getallEmployees()
	{
		return edao.getallEmployees();
	}
}