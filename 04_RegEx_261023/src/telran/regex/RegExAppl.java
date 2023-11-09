package telran.regex;

import java.util.Iterator;

public class RegExAppl {

	public static void main(String[] args) {
		String str = "Java10";
		String pattern = " *(J|j)ava([1-9]|[1-9][0-9])?";
		boolean check = str.matches(pattern);
		System.out.println(check);
		String domain = "abrakadabra.com";
		//^ - circuleflex
		pattern = "(-|\\w)+\\.(com|org|il)";
		check = domain.matches(pattern);
		System.out.println(check);
		/*
		 * 1) @ exist and only one
		 * 2) after @ there is dot
		 * 3) after last dot there are 2 or more symbols
		 * 4) allow only alphabetic, digits, '_', '-', '.', '@'
		 */
		String email = "peter@gmail.com";
		pattern = "(\\w|-|\\.)+@[A-Za-z0-9]([A-Za-z0-9]|-|\\.)*\\.[A-Za-z]{2,6}";
		check = email.matches(pattern);
		System.out.println(check);
		String text = "Java, JavaScript, TypeScript, HTML, CSS, C";
		String[] data = text.split("\\s*,\\s*");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
