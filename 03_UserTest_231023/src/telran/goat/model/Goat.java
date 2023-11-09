package telran.goat.model;

public class Goat {
	private static int count;
	public final int max; //final должно быть инициализировано при создании объекта и потом его изменить нельзя
	public static final int GOAT_LIMIT = 100; //such method is used for constants creation
	
	public Goat(int max) {
		this.max = max;
	}

	public int getMax() {
		return max;
	}

	public static void increment() {
		count++;
	}

	public static int getCount() {
		return count;
	}
	
	
}
