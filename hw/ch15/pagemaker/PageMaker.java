package hw.ch15.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title(username + "'s web page");
            writer.paragraph("Welcome to " + username + "'s web page!");
            writer.paragraph("Nice to meet you!");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void makeLinkPage(String filename) {
        try {
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Link page");
            Properties mailprop = Database.getProperties("maildata");
            for (String mailaddr: mailprop.stringPropertyNames()) {
                String username = mailprop.getProperty(mailaddr, "(unknown)");
                writer.mailto(mailaddr, username);
            }
            writer.close();
            System.out.println(filename + " is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void makeUrlPage(String filename) { // 메소드 추가 : 차서연
        try {
            HtmlWriter writer = new HtmlWriter(new FileWriter("./hw/ch15/" + filename));
            writer.title("URL Page");
            Properties urlprop = Database.getProperties("urldata");
            for (String urlname: urlprop.stringPropertyNames()) {
                String urladdr = urlprop.getProperty(urlname, "(unknown)");
                writer.printUrl(urladdr, urlname);
            }
            writer.close();
            System.out.println(filename + " is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
