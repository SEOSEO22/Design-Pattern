package hw.ch03;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay cd = new CharDisplay('a');

        // cd.open();
        // cd.print();
        // cd.close();

        cd.display(); // 템플릿 메소드를 호출

        AbstractDisplay sd = new StringDisplay("덕성여대");

        // sd.open();
        // sd.print();
        // sd.close();

        sd.display();
    }
}
