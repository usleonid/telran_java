package telran.user.model;

public class User {
	private String email;
	private String password;
	
	public User(String email, String password) {
		setEmail(email);
		setPassword(password);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (isEmailValid(email)) {
			this.email = email;
		} else {
			System.out.println(email + " is not valid");
		}
	}
	
	/*
	 * 1) @ exist and only one
	 * 2) after @ there is dot
	 * 3) after last dot there are 2 or more symbols
	 * 4) allow only alphabetic, digits, '_', '-', '.', '@'
	 */
	private boolean isEmailValid(String email) {
		int indexAt = email.indexOf('@');
		if (indexAt == -1 || indexAt != email.lastIndexOf('@')) {
			return false;
		}
		if (email.indexOf('.', indexAt) == -1) {
			return false;
		}
		if (email.lastIndexOf('.') > email.length() - 3) {
			return false;
		}
		for (int i = 0; i < email.length(); i++) {
			char c = email.charAt(i);
			if (!(c == '_' || c == '-' || c == '.' || c == '@' || Character.isDigit(c) || Character.isAlphabetic(c))) {
				return false;
			}
		}
		return true;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(isPasswordValid(password)) {
            this.password = password;
        } else {
            System.out.println("Password is not valid!");
        }
	}
	
	/*
	 * 1) lenght >= 8
	 * 2) min one digit
	 * 3) min one symbol in upperCase
	 * 4) min one symbol in lowerCase
	 * 5) min one symbol as special symbol (!%@$&)
	 */
	
	private boolean isPasswordValid(String password) {
		if (password.length() < 8) {
	        return false;
	    }

	    boolean hasDigit = false;
	    boolean hasUpperCase = false;
	    boolean hasLowerCase = false;
	    boolean hasSpecialChar = false;
	    String specialChars = "!%@$&";

	    for (char c : password.toCharArray()) {
	        if (Character.isDigit(c)) hasDigit = true;
	        if (Character.isUpperCase(c)) hasUpperCase = true;
	        if (Character.isLowerCase(c)) hasLowerCase = true;
	        if (specialChars.contains(String.valueOf(c))) hasSpecialChar = true;
	    }
	    
	    return hasDigit && hasUpperCase && hasLowerCase && hasSpecialChar;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}
	
	
}
