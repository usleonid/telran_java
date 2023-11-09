package telran.validator.utils;

public class Validator {
	// Credit card number (8-16 digits)
    public static boolean checkCreditCardNumber(String str) {
        return str.matches("\\d{8,16}");
    }
    
    // Date (Format: DD.MM.YYYY)
    public static boolean checkDateFormatEU(String str) {
        return str.matches("(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[012])\\.\\d{4}");
    }
    
    // Date (Format: YYYY-MM-DD)
    public static boolean checkDateFormatUS(String str) {
        return str.matches("\\d{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])");
    }
    
    // Phone Number (Format: +99(99)9999-9999)
    public static boolean checkPhoneNumber(String str) {
        return str.matches("\\+\\d{2}\\(\\d{2}\\)\\d{4}-\\d{4}");
    }
    
    // Number less than or equal to 255 (positive)
    public static boolean checkLessEquals255(String str) {
        return str.matches("(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)");
    }
}
