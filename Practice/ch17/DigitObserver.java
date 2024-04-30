package Practice.ch17;

public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        // 통지 받으면 하는 일
        System.out.println("DigitObserver:" + generator.getNumber());
        try {
            Thread.sleep(1000); // 1초 멈춤
        } catch (InterruptedException e) {
        }
    }
}
