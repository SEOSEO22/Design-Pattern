package Practice.ch02.sample2;

public class Main {
    public static void main(String[] args) {
        // 어댑터 생성
        Print p = new PrintBanner("덕성2");
        p.printWeak();
        p.printStrong();
    }
}
