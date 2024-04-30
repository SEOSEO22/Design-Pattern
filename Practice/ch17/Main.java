package Practice.ch17;

public class Main {
    public static void main(String[] args) {
        // 관찰 대상 생성
        NumberGenerator ng1 = new RandomNumberGenerator();

        // 관찰자 생성
        Observer o1 = new DigitObserver();
        Observer o2 = new GraphObserver();

        // 관찰자를 관찰 대상에 등록
        ng1.addObserver(o1);
        ng1.addObserver(o2);

        // 관찰 대상에게 상태 변화를 지시
        ng1.execute();
    }
}
