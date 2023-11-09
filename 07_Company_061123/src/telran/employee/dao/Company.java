package telran.employee.dao; //data access object

import telran.employee.model.Employee;

//only public abstract methods
public interface Company {
	boolean addEmployee (Employee employee);
	Employee removeEmployee(int id);
	Employee findEmployee(int id);
	int quantity();
	double totalSalary();
	double avgSalary();
	double totalSales();
	void printEmployees();
}
