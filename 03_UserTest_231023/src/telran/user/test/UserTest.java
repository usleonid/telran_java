package telran.user.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.user.model.User;

class UserTest {
	
	User user;
	String email = "peter@gmail.com";
	String password = "12345Ab!";
	
	@BeforeEach
	void setUp() throws Exception {
		user = new User(email,password);
	}

	//check the work of the set password. if the setter works correctly getPassword should return it
	@Test
	void testValidPassword() {
		String validPassword = "QwertY123!";
		user.setPassword(validPassword);
		assertEquals(validPassword, user.getPassword());
	}

	
	@Test
	void testPasswordLength() {
		String invalidPassword = "Qwe123!";
		user.setPassword(invalidPassword);
		assertEquals(password, user.getPassword());
	}
	
	@Test
	void testPasswordHaveUppercaseSymbol() {
		String invalidPassword = "qwe1234!";
		user.setPassword(invalidPassword);
		assertEquals(password, user.getPassword());
	}
	
	@Test
	void testPasswordHaveLowercaseSymbol() {
		String invalidPassword = "QWE1234!";
		user.setPassword(invalidPassword);
		assertEquals(password, user.getPassword());
	}
	
	@Test
	void testPasswordHaveDigit() {
		String invalidPassword = "Qwertyu!";
		user.setPassword(invalidPassword);
		assertEquals(password, user.getPassword());
	}
	
	@Test
	void testPasswordHaveSpecialSymbol() {
		String invalidPassword = "Qwerty12";
		user.setPassword(invalidPassword);
		assertEquals(password, user.getPassword());
	}
	
	//TO DO: unit tests for email
	/*
	 * 1) @ exist and only one
	 * 2) after @ there is dot
	 * 3) after last dot there are 2 or more symbols
	 * 4) allow only alphabetic, digits, '_', '-', '.', '@'
	 */
	
	@Test
	void testValidEmail() {
		String validEmail = "mannbook@gmail.com";
		user.setEmail(validEmail);
		assertEquals(validEmail, user.getEmail());
	}
	
	@Test
	void testEmailHaveAt() {
		String invalidEmail = "mannbook.gmail.com";
		user.setEmail(invalidEmail);
		assertEquals(email, user.getEmail());
	}
	
	@Test
	void testEmailHaveOnlyOneAt() {
		String invalidEmail = "mann@book@gmail.com";
		user.setEmail(invalidEmail);
		assertEquals(email, user.getEmail());
	}
	
	@Test
	void testEmailHaveDotAfterAt() {
		String invalidEmail = "mannbook@gmailcom";
		user.setEmail(invalidEmail);
		assertEquals(email, user.getEmail());
	}
	
	@Test
	void testEmailHaveTwoOrMoreSymbolsAfterLastDot() {
		String invalidEmail = "mannbook@cando.co.i";
		user.setEmail(invalidEmail);
		assertEquals(email, user.getEmail());
	}
	
	@Test
	void testEmailHaveOnlyAlphabeticDigitsUnderscoreDash() {
		String invalidEmail = "man&book@gmail.com";
		user.setEmail(invalidEmail);
		assertEquals(email, user.getEmail());
	}
}
