package Practice.ch02.sample1;

// 필요로 하는 인터페이스
// 자바는 클래스 다중 상속을 지원하지 않으므로
// 타겟 인터페이스는 항상 인터페이스 형식이어야 한다.
// Target Interface
public interface Print {
    public abstract void printWeak();
    public abstract void printStrong();
}
