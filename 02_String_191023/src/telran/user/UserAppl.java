package telran.user;

import telran.user.model.User;

public class UserAppl {

	public static void main(String[] args) {
		User user = new User("john@gmail.com", "TelRan@52");
		System.out.println(user);
		user.setEmail("john@walla.co.il");
		user.setPassword("aFiFon@2023");
		System.out.println(user);
	}

}
