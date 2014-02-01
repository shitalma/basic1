package report;

import java.util.List;

public class FormatHtml implements Formatter {
    @Override
    public String getFormatText(String title, List<HeadLine> headline) {
        StringBuilder builder = new StringBuilder("");
        builder.append("<h1>"+title+"</h1>\n<ul>\n");
        for (HeadLine headLine : headline) {
            builder.append("<li>"+headLine).append("</li>\n");
        }
        builder.append("</ul>");
        return builder.toString();
    }
}
