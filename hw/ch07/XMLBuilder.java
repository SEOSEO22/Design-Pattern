package hw.ch07;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class XMLBuilder extends Builder {
    private String filename = "untitled.xml";
    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        filename = title + ".xml";
        sb.append("<document>\n");
        sb.append("<title>");
        sb.append(title);
        sb.append("</title>\n");
    }

    @Override
    public void makeString(String str) {
        sb.append("<string>");
        sb.append(str);
        sb.append("</string>\n");
    }

    @Override
    public void makeItems(String[] items) {
        sb.append("<items>\n");
        for (String i : items) {
            sb.append("<item>");
            sb.append(i);
            sb.append("</item>\n");
        }
        sb.append("</items>\n");
    }

    @Override
    public void close() {
        sb.append("</document>\n");
        try {
            Writer writer = new FileWriter(filename);
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public String getXMLResult() {
        return sb.toString();
    }
}
