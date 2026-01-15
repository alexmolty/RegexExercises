package HTMLLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HtmlBuilderTest {

    @Test
    void buildList() {
        String[] items = {"milk", "butter", "bread"};
        String expectedHtml = """
                <ul>
                <li>milk</li>
                <li>butter</li>
                <li>bread</li>
                </ul>""";
        String actualHtml = HtmlBuilder.buildList(items);
        assertEquals(expectedHtml, actualHtml);
    }
    @Test
    void oneItem() {
        String[] items = {"124124"};
        String expectedHtml = """
                <ul>
                <li>124124</li>
                </ul>""";
        String actualHtml = HtmlBuilder.buildList(items);
        assertEquals(expectedHtml, actualHtml);
    }
    @Test
    void checkNull() {
        String[] items = null;
        String expectedHtml = "";
        String actualHtml = HtmlBuilder.buildList(items);
        assertEquals(expectedHtml, actualHtml);
    }
}