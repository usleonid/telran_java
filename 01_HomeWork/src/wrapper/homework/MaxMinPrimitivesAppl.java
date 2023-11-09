package wrapper.homework;

public class MaxMinPrimitivesAppl {

	public static void main(String[] args) {
		String[] defaultTypes = {"byte", "int", "short", "long", "char", "float", "double"};
		String[] typesToCheck = (args.length == 0) ? defaultTypes : args;
		
		for (String type : typesToCheck) {
            switch (type) {
                case "byte":
                    System.out.println("byte:");
                    System.out.println("  Min: " + Byte.MIN_VALUE);
                    System.out.println("  Max: " + Byte.MAX_VALUE);
                    break;
                case "int":
                    System.out.println("int:");
                    System.out.println("  Min: " + Integer.MIN_VALUE);
                    System.out.println("  Max: " + Integer.MAX_VALUE);
                    break;
                case "short":
                    System.out.println("short:");
                    System.out.println("  Min: " + Short.MIN_VALUE);
                    System.out.println("  Max: " + Short.MAX_VALUE);
                    break;
                case "long":
                    System.out.println("long:");
                    System.out.println("  Min: " + Long.MIN_VALUE);
                    System.out.println("  Max: " + Long.MAX_VALUE);
                    break;
                case "char":
                    System.out.println("char:");
                    System.out.println("  Min: " + (int) Character.MIN_VALUE);
                    System.out.println("  Max: " + (int) Character.MAX_VALUE);
                    break;
                case "float":
                    System.out.println("float:");
                    System.out.println("  Min: " + Float.MIN_VALUE);
                    System.out.println("  Max: " + Float.MAX_VALUE);
                    break;
                case "double":
                    System.out.println("double:");
                    System.out.println("  Min: " + Double.MIN_VALUE);
                    System.out.println("  Max: " + Double.MAX_VALUE);
                    break;
                default:
                    System.out.println(type + " Wrong type");
            }
        }
	}
}
