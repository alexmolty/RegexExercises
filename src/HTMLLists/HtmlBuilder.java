package HTMLLists;

public class HtmlBuilder {
    public static String buildList(String[] items) {
        if(items == null || items.length == 0) return "";
        StringBuilder result = new StringBuilder();
        result.append("<ul>\n");
        for(String item : items) {
            result.append("<li>");
            result.append(item);
            result.append("</li>\n");
        }
        result.append("</ul>");
        return result.toString();
    }
}
