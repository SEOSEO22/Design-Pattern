package hw.ch05.idcard;

import hw.ch05.framework.Factory;
import hw.ch05.framework.Product;

public class IDCardFactoryChaSeoyeon1 extends Factory {
    private static IDCardFactoryChaSeoyeon1 factory1 = new IDCardFactoryChaSeoyeon1(); // 차서연 : static 변수 생성
    private int serial = 100;

    private IDCardFactoryChaSeoyeon1() { // 차서연 : private 생성자 생성

    }

    public static IDCardFactoryChaSeoyeon1 getInstance() { // 차서연 : static 변수인 factory1을 반환하는 getInstance 메소드 생성
        return factory1;
    }

    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
