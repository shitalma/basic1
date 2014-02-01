package report;

import java.util.List;

/**
 * Created by shitalma on 2/1/14.
 */
public class FormatText implements Formatter {
    @Override
    public String getFormatText(String title, List<HeadLine> headline) {
        StringBuilder builder = new StringBuilder("");
        builder.append(title+"\n");
        for (HeadLine headLine : headline) {
            builder.append(headLine).append("\n");
        }
        return builder.toString();
    }
}
