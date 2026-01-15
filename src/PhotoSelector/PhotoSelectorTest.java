package PhotoSelector;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhotoSelectorTest {
    private static final String[] pictures =
            {
                    "Paris\\20140101_090000.jpg",
                    "Paris\\20140201_121005.jpg",
                    "Paris\\20150301_211035.jpg",
                    "Paris\\20150401_110023.gif",
                    "Paris\\20150401_181705.jpg",
                    "Paris\\20150501_231035.gif",
                    "London\\20140205_090000.jpg",
                    "London\\20140205_121005.jpg",
                    "London\\20140601_211035.gif",
                    "London\\20151001_110023.jpg",
                    "London\\20151001_121705.jpg",
                    "London\\20151001_231035.jpg",
                    "Chicago\\20150301_120001.png",
                    "Chicago\\20151111_232000.png"
            };

    @Test
    @DisplayName("All Europe pictures")
    public void testAllEuropePictures() {
        String regExp = "London|Paris";
        String[] expected =
                {
                        "Paris\\20140101_090000.jpg",
                        "Paris\\20140201_121005.jpg",
                        "Paris\\20150301_211035.jpg",
                        "Paris\\20150401_110023.gif",
                        "Paris\\20150401_181705.jpg",
                        "Paris\\20150501_231035.gif",
                        "London\\20140205_090000.jpg",
                        "London\\20140205_121005.jpg",
                        "London\\20140601_211035.gif",
                        "London\\20151001_110023.jpg",
                        "London\\20151001_121705.jpg",
                        "London\\20151001_231035.jpg"
                };
        String[] actuals = SelectorPhoto.selectPictures(pictures, regExp);
        assertArrayEquals(expected, actuals);
    }

    @Test
    @DisplayName("All Paris pictures")
    public void testAllParisPictures() {
        String regExp = "Paris";
        String[] expected =
                {
                        "Paris\\20140101_090000.jpg",
                        "Paris\\20140201_121005.jpg",
                        "Paris\\20150301_211035.jpg",
                        "Paris\\20150401_110023.gif",
                        "Paris\\20150401_181705.jpg",
                        "Paris\\20150501_231035.gif",
                };
        String[] actuals = SelectorPhoto.selectPictures(pictures, regExp);
        assertArrayEquals(expected, actuals);
    }

    @Test
    @DisplayName("All autumn pictures")
    public void testAllAutumnPictures() {
        String regExp = "\\d{4}(09|10|11)\\d{2}_";
        String[] expected =
                {
                        "London\\20151001_110023.jpg",
                        "London\\20151001_121705.jpg",
                        "London\\20151001_231035.jpg",
                        "Chicago\\20151111_232000.png"
                };
        String[] actuals = SelectorPhoto.selectPictures(pictures, regExp);
        assertArrayEquals(expected, actuals);
    }

    @Test
    @DisplayName("All 2015 spring pictures")
    public void testAll2015SpringPicture() {
        String regExp = "2015(0[345])\\d{2}_";
        String[] expected =
                {
                        "Paris\\20150301_211035.jpg",
                        "Paris\\20150401_110023.gif",
                        "Paris\\20150401_181705.jpg",
                        "Paris\\20150501_231035.gif",
                        "Chicago\\20150301_120001.png",
                };
        String[] actuals = SelectorPhoto.selectPictures(pictures, regExp);
        assertArrayEquals(expected, actuals);
    }

    @Test
    @DisplayName("All night pictures (from 18:00 till 24:00)")
    public void  testAllNightPictures() {
        String regExp = "\\d{8}_(1[89]|2[0-3])\\d{4}\\.";
        String[] expected =
                {
                        "Paris\\20150301_211035.jpg",
                        "Paris\\20150401_181705.jpg",
                        "Paris\\20150501_231035.gif",
                        "London\\20140601_211035.gif",
                        "London\\20151001_231035.jpg",
                        "Chicago\\20151111_232000.png"
                };
        String[] actuals = SelectorPhoto.selectPictures(pictures, regExp);
        assertArrayEquals(expected, actuals);
    }

    @Test
    @DisplayName("All night pictures from Chicago")
    public void  testAllNightPicturesFromChicago() {
        String regExp = "Chicago\\\\\\d{8}_(1[89]|2[0-3])\\d{4}\\.";
        String[] expected =
                {
                        "Chicago\\20151111_232000.png"
                };
        String[] actuals = SelectorPhoto.selectPictures(pictures, regExp);
        assertArrayEquals(expected, actuals);
    }

    @Test
    @DisplayName("All jpg and png pictures")
    public void  testAllJPGAndPNGPictures() {
        String regExp = ".+\\\\\\d{8}_\\d{6}\\.(jpg|png)";
        String[] expected =
                {
                        "Paris\\20140101_090000.jpg",
                        "Paris\\20140201_121005.jpg",
                        "Paris\\20150301_211035.jpg",
                        "Paris\\20150401_181705.jpg",
                        "London\\20140205_090000.jpg",
                        "London\\20140205_121005.jpg",
                        "London\\20151001_110023.jpg",
                        "London\\20151001_121705.jpg",
                        "London\\20151001_231035.jpg",
                        "Chicago\\20150301_120001.png",
                        "Chicago\\20151111_232000.png"
                };
        String[] actuals = SelectorPhoto.selectPictures(pictures, regExp);
        assertArrayEquals(expected, actuals);
    }
}