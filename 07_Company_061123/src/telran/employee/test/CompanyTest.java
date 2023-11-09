package telran.employee.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.employee.dao.Company;
import telran.employee.dao.CompanyImpl;
import telran.employee.model.Employee;
import telran.employee.model.Manager;
import telran.employee.model.SalesManager;
import telran.employee.model.WageEmployee;

class CompanyTest {
	Company company;
	Employee[] employees;

	@BeforeEach
	void setUp() throws Exception {
		company = new CompanyImpl(5);
		employees = new Employee[4];
		employees[0] = new Manager(1000, "John", "Smith", 182, 20_000, 20);
		employees[1] = new WageEmployee(2000, "Mary", "Smith", 182, 40);
		employees[2] = new SalesManager(3000, "Peter", "Jackson", 182, 40_000, 0.1);
		employees[3] = new SalesManager(4000, "Rabindranate", "Anand", 91, 80_000, 0.1);
		for (int i = 0; i < employees.length; i++) {
			company.addEmployee(employees[i]);
		}
	}

	@Test
	void testAddEmployee() {
		assertFalse(company.addEmployee(null));
		assertFalse(company.addEmployee(employees[1]));
		Employee employee = new SalesManager(5000, "Peter", "Jackson", 182, 40_000, 0.1);
		assertTrue(company.addEmployee(employee));
		assertEquals(5, company.quantity());
		employee = new SalesManager(6000, "Peter", "Jackson", 182, 40_000, 0.1);
		assertFalse(company.addEmployee(employee));
	}

	@Test
	void testRemoveEmployee() {
		Employee employee = company.removeEmployee(3000);
		assertEquals(3, company.quantity());
		assertEquals(employees[2], employee);
		assertNull(company.removeEmployee(3000));
	}

	@Test
	void testFindEmployee() {
		assertEquals(employees[2], company.findEmployee(3000));
		assertNull(company.findEmployee(5000));
	}

	@Test
	void testQuantity() {
		assertEquals(4, company.quantity());
	}

	@Test
	void testTotalSalary() {
		assertEquals(44380.0, company.totalSalary(), 0.01); //for double need accuracy
	}

	@Test
	void testAvgSalary() {
		assertEquals(44380.0 / 4, company.avgSalary(), 0.01);
	}

	@Test
	void testTotalSales() {
		assertEquals(120000.0, company.totalSales(), 0.01);
	}

	@Test
	void testPrintEmployees() {
		company.printEmployees();
	}

}
