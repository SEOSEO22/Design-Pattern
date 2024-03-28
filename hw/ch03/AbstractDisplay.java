package hw.ch03;

public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();

    public final void display(int times) { // 차서연 : 매개변수를 times로 변경
        open();
        for (int i = 0; i < times; i++) { // 차서연 : for문이 times만큼 반복되도록 변경
            print();
        }
        close();
    }
}
