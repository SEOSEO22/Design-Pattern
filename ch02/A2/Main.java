package ch02.A2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // 어댑터 생성
        FileIO f = new FileProperties();
        try {
            f.readFromFile("src/ch02/A2/" + "file.txt");
            // 기존의 width 값 변경
            f.setValue("width", "1024");
            // height, depth 값 추가
            f.setValue("height", "512");
            f.setValue("depth", "32");
            f.setValue("name", "차서연");
            f.writeToFile("src/ch02/A2/" + "newfile.txt");
            System.out.println("newfile.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
