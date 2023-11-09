package telran.wrapper;

import java.util.Iterator;

public class ArrayArgsAppl {

	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Wrong number of arguments");
			return;
		}
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double res = calculator(a, b, args[2]);
		System.out.println("Result = " + res);
	}
	
	public static double calculator(double a, double b, String oper) {
		switch (oper) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		case "/":
			return a / b;
		default:
			System.out.println("Wrong operation");
			return Double.NaN;
		}
	}
}
