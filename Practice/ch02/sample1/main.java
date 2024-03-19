package Practice.ch02.sample1;

public class main {
    public static void main(String[] args) {
        // 배너를 직접 사용할 수 없는 상황
        // Banner b = new Banner("덕성");
        // b.showWithParen();
        // b.showWithAster();

        // 어댑터를 이용해 Banner를 간접적으로 사용
        // PrintBanner가 아닌 Print 형으로 변수를 선언한 이유
        // 변수는 타입이 중요함. Print 타입으로 생성한 변수는 Print에서 생성한 함수만 접근 가능.
        // PrintBanner 객체를 생성했더라도 PrintBanner에서 생성한 새 메소드를 호출하지 못함.
        // 따라서 PrintBanner에서 생성한 메서드를 호출하지 못하게 방지하기 위해 Print 타입 사용.
        Print p = new PrintBanner("덕성");

        p.printStrong();
        p.printWeak();
    }
}
