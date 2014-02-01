package report;

import java.util.ArrayList;
import java.util.List;

public class NewsPrinter {
    private String title;
    List<HeadLine> headline;

    public NewsPrinter(String title) {
        this.title = title;
        this.headline = new ArrayList<>();
    }

    public void addNews(HeadLine headline){
        this.headline.add(headline);
    }

    public void printFormat(Formatter formatter) {
        System.out.println(formatter.getFormatText(this.title, this.headline));
    }
}
