package telran.employee;

import telran.employee.model.Employee;
import telran.employee.model.Manager;

public class EqualsAppl {

	public static void main(String[] args) {
		Employee empl1 = new Manager(1000, "John", "Smith", 182, 20_000, 20);
//		Employee empl2 = empl1;
		Employee empl2 = new Manager(1000, "John", "Smith", 182, 20_000, 20);
		boolean check = empl1 == empl2;
		System.out.println("Comparing: " + check);
		check = empl1.equals(empl2);
		System.out.println("Equals: " + check);

	}

}
