package telran.employee;

import telran.employee.model.Employee;
import telran.employee.model.Manager;
import telran.employee.model.SalesManager;
import telran.employee.model.WageEmployee;

public class EmployeeAppl {

	public static void main(String[] args) {
		Employee[] employees = new Employee[6];
		employees[0] = new Manager(1000, "John", "Smith", 182, 20_000, 20);
		employees[1] = new WageEmployee(2000, "Mary", "Smith", 182, 40);
		employees[2] = new SalesManager(3000, "Peter", "Jackson", 182, 40_000, 0.1);
		employees[3] = new SalesManager(4000, "Rabindranate", "Anand", 91, 80_000, 0.1);
//		employees[4] = new Employee(5000, "Ivanushka", "Durachok", 182);
		printArray(employees);
		double total = totalSalary(employees);
		System.out.println("Total salary = " + total);
		total = totalSales(employees);
		System.out.println("Total sales =" + total);

	}

	private static double totalSales(Employee[] employees) {
		double sum = 0;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] instanceof SalesManager) {
				SalesManager sm = (SalesManager) employees[i];
				sum += sm.getSalesValue();
			}
		}
		return sum;
	}

	private static double totalSalary(Employee[] employees) {
		double sum = 0;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null) {
				sum += employees[i].calcSalary();
			}
		}
		return sum;
	}

	private static void printArray(Object[] employees) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null) {
				System.out.println(employees[i]);
			}
		}

	}

}
