package Practice.ch02.sample1;

// Adapter
// 상속을 이용한 어댑터
public class PrintBanner extends Banner implements Print {
    // 실제 일은 Banner가 하도록 한다.

    public PrintBanner(String string) {
        super(string); // 부모 생성자 호출
    }

    @Override
    public void printStrong() {
        super.showWithAster();
    }

    @Override
    public void printWeak() {
        super.showWithParen();        
    }
}
