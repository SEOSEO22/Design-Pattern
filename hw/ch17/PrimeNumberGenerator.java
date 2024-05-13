package hw.ch17;

import java.util.Random;

public class PrimeNumberGenerator extends NumberGenerator {
    Random random = new Random();
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 100; i++) {
            number = random.nextInt(1, 101);
            if (isPrimeNumber(number)) {
                notifyObservers();
            }
        }
    }
    
    private boolean isPrimeNumber(int num) {
        for (int i = 2; i <= num; i++) {
            if (i == num) continue;
            else {
                if (num % i == 0) return false;
            }
        }
        return true;
    }
}
