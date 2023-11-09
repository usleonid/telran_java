package telran.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherAppl {

	public static void main(String[] args) {
		String str = "Don't Trouble trouble until trouble troubles you";
		String regex = "(T|t)rouble\\w*";
		boolean check = str.matches(regex);
		System.out.println(check);
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		check = matcher.matches();
		System.out.println(check);
		System.out.println("==============================");
		check = matcher.find();
		System.out.println(check);
		System.out.println(matcher.start()); // where is it match
		System.out.println(matcher.end()); // where is it ended
		System.out.println(matcher.group()); // what group of symbols does it find
		check = matcher.find();
		System.out.println(matcher.start()); // where is it match
		System.out.println(matcher.end()); // where is it ended
		System.out.println(matcher.group()); // what group of symbols does it find
		matcher.reset(); // reset the search to the beginning
		System.out.println("==============================");
		printAllFind(matcher);
		System.out.println("==============================");
		str = "All my troubles seemed so far away";
//		matcher = pattern.matcher(str);
		matcher.reset(str); // add new string to the object and reset position of cursor to the beginning
		printAllFind(matcher);
		System.out.println("==============================");
		
	}

	public static void printAllFind(Matcher matcher) {
		matcher.reset();
		while (matcher.find()) {
			System.out.println(matcher.start()); // where is it match
			System.out.println(matcher.end()); // where is it ended
			System.out.println(matcher.group()); // what group of symbols does it find
		}
	}
}
