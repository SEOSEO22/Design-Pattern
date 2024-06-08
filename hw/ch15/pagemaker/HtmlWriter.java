package hw.ch15.pagemaker;

import java.io.Writer;
import java.io.IOException;

public class HtmlWriter {
    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    // 타이틀 출력 
    public void title(String title) throws IOException {
        writer.write("<html>");
        writer.write("\n");
        writer.write("<head>");
        writer.write("\n");
        writer.write("<title>" + title + "</title>");
        writer.write("\n");
        writer.write("</head>");
        writer.write("\n");
        writer.write("<body>");
        writer.write("\n");
        writer.write("<h1>" + "차서연의 " + title + "</h1>");
        writer.write("\n");
    }

    // 단락 출력 
    public void paragraph(String msg) throws IOException {
        writer.write("<p>" + msg + "</p>");
        writer.write("\n");
    }

    // 링크 출력 
    public void link(String href, String caption) throws IOException {
        paragraph("<a href=\"" + href + "\">" + caption + "</a>");
    }

    // 이메일 주소 출력 
    public void mailto(String mailaddr, String username) throws IOException {
        link("mailto:" + mailaddr, username);
    }

    // URL 주소 출력 : 차서연
    public void printUrl(String urladdr, String urlname) throws IOException {
        link(urladdr, urlname);
    }

    // HTML 닫기 
    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>");
        writer.write("\n");
        writer.close();
    }
}
