package telran.builder;

public class StringBuilderAppl {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Java");
		builder.append("_").append(11);
		System.out.println(builder);
		System.out.println(builder.reverse());
		// All methods of builder change itself
	}

}
