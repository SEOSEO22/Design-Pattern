package hw.ch03;

public class Main {
    public static void main(String[] args) {
        // 차서연 : ChaSeoyeonDisplay 객체 생성
        AbstractDisplay cd = new ChaSeoyeonDisplay("차서연", "20220732", 3);

        cd.display(10); // 차서연 : display(10) 메소드 호출
        cd.display(5); // 차서연 : display(5) 메소드 호출
    }
}
