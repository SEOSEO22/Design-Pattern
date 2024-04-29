package hw.ch11;

public class Main {
    public static void main(String[] args) {
        // 차서연 : 디렉토리 생성
        Directory documents = new Directory("MyDocuments", "20240401", "ChaSeoyeon");
        Directory data = new Directory("MyData", "20240401", "ChaSeoyeon");
        Directory pictures = new Directory("MyPictures", "20240401", "ChaSeoyeon");

        // 차서연 : 트리 구조 생성
        documents.add(new File("차서연0.doc", "20240501", 1000, "ChaSeoyeon"));
        documents.add(data);
        data.add(new File("차서연1.doc", "20240501", 2000, "ChaSeoyeon"));
        data.add(new File("차서연2.java", "20240501", 3000, "ChaSeoyeon"));
        data.add(pictures);
        pictures.add(new File("차서연3.gif", "20240601", 4000, "ChaSeoyeon"));
        pictures.add(new File("차서연4.jpg", "20240601", 5000, "ChaSeoyeon"));
        pictures.add(new File("차서연5.png", "20240601", 6000, "ChaSeoyeon"));

        // 차서연 : 과제 요구 조건 만족을 위한 메소드 집합
        System.out.println("20220732 차서연");
        documents.printList();
    }
}
