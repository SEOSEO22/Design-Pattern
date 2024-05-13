package hw.ch17;

public class NamePrintObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.print("NamePrintObserver:");
        
        for (int i = 0; i < generator.getNumber(); i++) {
            System.out.print("차서연 ");
        }
        System.out.println();

        try {
            Thread.sleep(1000); // 1초 멈춤
        } catch (InterruptedException e) {
        }
    }
    
}
