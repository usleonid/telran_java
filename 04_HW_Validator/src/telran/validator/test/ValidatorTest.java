package telran.validator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static telran.validator.utils.Validator.*;

class ValidatorTest {

	@Test
	void testCheckCreditCardNumber() {
		assertTrue(checkCreditCardNumber("12345678"));
		assertTrue(checkCreditCardNumber("1234567887654321"));
		assertTrue(checkCreditCardNumber("1234567890"));
		assertFalse(checkCreditCardNumber("1234567"));
		assertFalse(checkCreditCardNumber("12345678876543210"));
		assertFalse(checkCreditCardNumber("12345678A"));
	}

	@Test
	void testCheckDateFormatEU() {
		assertTrue(checkDateFormatEU("26.10.2023"));
		assertTrue(checkDateFormatEU("05.02.2023"));
		assertTrue(checkDateFormatEU("31.11.2023"));
		assertFalse(checkDateFormatEU("26.15.2023"));
		assertFalse(checkDateFormatEU("32.11.2023"));
		assertFalse(checkDateFormatEU("ab.10.2023"));
		assertFalse(checkDateFormatEU("12/12/2023"));
		assertFalse(checkDateFormatEU("2023.10.26"));
		assertFalse(checkDateFormatEU("2023-10-26"));
	}

	@Test
	void testCheckDateFormatUS() {
		assertTrue(checkDateFormatUS("2023-10-30"));
		assertTrue(checkDateFormatUS("2023-02-05"));
		assertTrue(checkDateFormatUS("2023-11-31"));
		assertFalse(checkDateFormatUS("2023-15-26"));
		assertFalse(checkDateFormatUS("2023-11-32"));
		assertFalse(checkDateFormatUS("2023-10-ab"));
		assertFalse(checkDateFormatUS("2023/12/12"));
		assertFalse(checkDateFormatUS("26-10-2023"));
		assertFalse(checkDateFormatUS("26.10.2023"));
	}

	@Test
    void testCheckPhoneNumber() {
        assertTrue(checkPhoneNumber("+99(99)9999-9999"));
        assertTrue(checkPhoneNumber("+12(34)5678-9012"));
        assertTrue(checkPhoneNumber("+01(23)4567-8901"));
        assertFalse(checkPhoneNumber("+999(99)9999-9999")); 
        assertFalse(checkPhoneNumber("+99(999)9999-9999"));
        assertFalse(checkPhoneNumber("+99(99)999-9999"));
        assertFalse(checkPhoneNumber("+9(99)999-99-99"));
    }

    @Test
    void testCheckLessEquals255() {
        assertTrue(checkLessEquals255("0"));
        assertTrue(checkLessEquals255("123"));
        assertTrue(checkLessEquals255("255"));
        assertFalse(checkLessEquals255("256"));
        assertFalse(checkLessEquals255("999"));
        assertFalse(checkLessEquals255("abc"));
        assertFalse(checkLessEquals255("-1"));
    }

}
