import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;

public class Parser {

    private static Document getPage() throws IOException {
        String url = "https://www.accuweather.com/en/by/gomel/28573/daily-weather-forecast/28573";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }

    public static void main(String[] args) throws IOException {
        Document page = getPage();
        System.out.println("   Date   Temperature   Description   Humidity");
    }
}
