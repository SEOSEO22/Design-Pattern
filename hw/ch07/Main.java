package hw.ch07;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        // TextBuilder를 이용해서 문서 만들기
        TextBuilder tb1 = new TextBuilder();
        Director d1 = new Director(tb1);
        d1.construct();
        System.out.println(tb1.getTextResult());

        // HTMLBuilder를 이용해서 문서 만들기
        HTMLBuilder hb1 = new HTMLBuilder();
        Director d2 = new Director(hb1);
        d2.construct();
        System.out.println(hb1.getHTMLResult() + " is created.");

        // XMLBuilder를 이용해서 문서 만들기
        XMLBuilder xb1 = new XMLBuilder();
        Director d3 = new Director(xb1);
        d3.construct();
        System.out.println(xb1.getXMLResult());
    }
}
