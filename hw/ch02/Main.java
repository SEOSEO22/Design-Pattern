package hw.ch02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // 어댑터 생성
        FileIO f = new FileProperties();
        try {
            f.readFromFile("./hw/ch02/" + "file.txt"); // 차서연 : 파일 경로 수정
            f.setValue("Year", "2024"); // 차서연 : txt 파일 내용 수정
            f.setValue("bornYear", "2003");
            f.setValue("StudentId", "20220732");
            f.setValue("Name", "ChaSeoyeon");
            f.setValue("Location", "Seoul");
            f.writeToFile("./hw/ch02/" + "ChaSeoyeon.txt"); // 차서연 : 파일 경로 및 파일 이름 수정
            System.out.println("ChaSeoyeon.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
