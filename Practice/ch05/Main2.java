package Practice.ch05;

public class Main2 {
    public static void main(String[] args) {
        Singleton2 s1 = Singleton2.getInstance();
        Singleton2 s2 = Singleton2.getInstance();

        if (s1 == s2) {
            System.out.println("둘이 같은 인스턴스입니다.");
        }
        else {
            System.out.println("둘이 다른 인스턴스입니다.");
        }
    }
}
