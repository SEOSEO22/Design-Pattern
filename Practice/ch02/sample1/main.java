package Practice.ch02.sample1;

public class main {
    public static void main(String[] args) {
        // 배너를 직접 사용할 수 없는 상황
        // Banner b = new Banner("덕성");
        // b.showWithParen();
        // b.showWithAster();

        // 어댑터를 이용해 Banner를 간접적으로 사용
        Print p = new PrintBanner("덕성");

        p.printStrong();
        p.printWeak();
    }
}
