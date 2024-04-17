package hw.ch05;

import hw.ch05.idcard.IDCardFactoryChaSeoyeon1;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("20220732 차서연");
        
        IDCardFactoryChaSeoyeon1 factory1 = IDCardFactoryChaSeoyeon1.getInstance();
        IDCardFactoryChaSeoyeon1 factory2 = IDCardFactoryChaSeoyeon1.getInstance();
    
        if (factory1 == factory2) System.out.println("factory1과 factory2는 같은 인스턴스입니다.");
        else System.out.println("factory1과 factory2는 다른 인스턴스입니다.");
    }
}
