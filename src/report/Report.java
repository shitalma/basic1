package report;

public class Report {
    public static void main(String[] args) {
        NewsPrinter np = new NewsPrinter("The Times Of TW");
        np.addNews(new HeadLine("News1"));
        np.addNews(new HeadLine("News2"));
        np.printFormat(new FormatText());

        System.out.println("------------------------------------------");

        np.printFormat(new FormatHtml());
    }
}
