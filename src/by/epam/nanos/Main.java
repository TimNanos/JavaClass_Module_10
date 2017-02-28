package by.epam.nanos;

import java.util.regex.Pattern;

public class Main {
    static final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<breakfast-menu>\n" +
            "<food id=\"1\">\n" +
            "<name>Belgian Waffles</name>\n" +
            "<price>$5.95</price>\n" +
            "<description>\n" +
            "two of our famous Belgian Waffles with plenty of\n" +
            "real maple syrup\n" +
            "</description>\n" +
            "<calories>650</calories>\n" +
            "</food>\n" +
            "<food id=\"2\">\n" +
            "<name>Strawberry Belgian Waffles</name>\n" +
            "<price>$7.95</price>\n" +
            "<description>\n" +
            "light Belgian waffles covered with strawberries and\n" +
            "whipped cream\n" +
            "</description>\n" +
            "<calories>900</calories>\n" +
            "</food>\n" +
            "</breakfast-menu>";

    public static void main(String[] args) {
        String pattern = "<+";

        Pattern p = Pattern.compile(pattern);
        String[] result = p.split(xml);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
