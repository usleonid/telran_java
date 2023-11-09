package telran.employee.dao;

import telran.employee.model.Employee;

public class CompanyImpl implements Company {
	
	private Employee[] employees;
	private int size;
	
	public CompanyImpl(int capacity) {
		employees = new Employee[capacity];
//		size = 0;
	}
	
	//test driven development (TDD)
	
	@Override
	public boolean addEmployee(Employee employee) {
		if (employee == null || size == employees.length || findEmployee(employee.getId()) != null) {
			return false;
		}
		employees[size] = employee;
		size++;
		return true;
	}

	@Override
	public Employee removeEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int quantity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double totalSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double avgSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double totalSales() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printEmployees() {
		// TODO Auto-generated method stub
		
	}
	
}
