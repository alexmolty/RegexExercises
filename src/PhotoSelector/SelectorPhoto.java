package PhotoSelector;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SelectorPhoto {


    public static String[] selectPictures(String[] pictures, String regExp) {
        if(pictures == null || pictures.length == 0 || regExp == null) return new String[0];
        Pattern p = Pattern.compile(regExp);
        String[] temp = new String[pictures.length];
        int index = 0;
        for (String picture : pictures) {
            if(picture == null) continue;
            Matcher m = p.matcher(picture);
            if(m.find()) {
                temp[index++] = picture;
            }
        }
        return Arrays.copyOf(temp, index);
    }
}