package hw.ch17;

public class Main {
    public static void main(String[] args) {
        System.out.println("20220732 차서연");
        
        NumberGenerator png = new PrimeNumberGenerator();

        Observer o1 = new DigitObserver();
        Observer o2 = new GraphObserver();
        Observer o3 = new NamePrintObserver();
    
        png.addObserver(o1);
        png.addObserver(o2);
        png.addObserver(o3);

        png.execute();
    }
}
