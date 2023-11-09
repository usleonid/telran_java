package telran.regex.utils;
import java.util.regex.Pattern;

public class PhotoSelector {
    public static String[] selectPictures(String[] pictures, String regex) {
        Pattern pattern = Pattern.compile(regex);
        String[] foundPictures = new String[pictures.length];
        int index = 0;
        for (int i = 0; i < pictures.length; i++) {
            if (pattern.matcher(pictures[i]).find()) {
                foundPictures[index] = pictures[i];
                index++;
            }
        }
        // Удаление пустых элементов из массива
        String[] result = new String[index];
        System.arraycopy(foundPictures, 0, result, 0, index);
        return result;
    }
}