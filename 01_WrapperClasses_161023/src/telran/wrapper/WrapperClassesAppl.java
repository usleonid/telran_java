package telran.wrapper;

public class WrapperClassesAppl {

	public static void main(String[] args) {
		int a = 42;
		Integer b = 10;
		System.out.println(a);
		System.out.println(b);
		b = a - b;
		System.out.println(b);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		String strB = b.toString();
		System.out.println(strB);
		String strA = Integer.toString(a);
		System.out.println(strA);
		strA = "58";
		a = Integer.parseInt(strA);
		System.out.println(a);
		strB = "3.1415926";
		double pi = Double.parseDouble(strB);
		System.out.println(pi);
//		a = (int) pi;
		strB = "false";
		boolean check = Boolean.parseBoolean(strB);
		System.out.println(check);
		double c = 10.0 / 20;
		if (Double.isInfinite(c)) {
			System.out.println("wrong result");
		} else {
			System.out.println(c);
		}
	}
	
}
