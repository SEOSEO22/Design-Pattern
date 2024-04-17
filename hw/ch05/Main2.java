package hw.ch05;

import hw.ch05.idcard.IDCardFactoryChaSeoyeon2;

public class Main2 extends Thread {
    public static void main(String[] args) {
        System.out.println("20220732 차서연");

        new Main2("최승훈 교수님").start();
        new Main2("차서연").start();
        new Main2("목지윤").start();
    }

    @Override
    public void run() {
        IDCardFactoryChaSeoyeon2 factory = IDCardFactoryChaSeoyeon2.getInstance();
        System.out.println(getName() + " : " + factory);
    }

    public Main2(String name) {
        super(name);
    }
}
