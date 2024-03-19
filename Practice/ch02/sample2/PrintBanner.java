package Practice.ch02.sample2;

// Adapter
// 위임을 이용한 어댑터
public class PrintBanner extends Print {
// public class PrintBanner implements Print {
    Banner banner;

    public PrintBanner(String string) {
        banner = new Banner(string);
    }

    @Override
    public void printWeak() {
    }

    @Override
    public void printStrong() {
    }
}
