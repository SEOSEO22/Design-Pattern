package hw.ch05.idcard;

import hw.ch05.framework.Factory;
import hw.ch05.framework.Product;

public class IDCardFactoryChaSeoyeon2 extends Factory {
    private static IDCardFactoryChaSeoyeon2 factory = null; // 차서연 : static 변수 생성
    private int serial = 100;
    // 일련번호와 신분증 대응표 괸리
    // key(일련번호)와 value(신분증 객체) 쌍으로 관리 => HashMap, HashTable 등 이용

    private IDCardFactoryChaSeoyeon2() { // 차서연 : private 생성자 추가
        System.out.println("인스턴스를 생성했습니다.");
        slowdown();
    }

    public static synchronized IDCardFactoryChaSeoyeon2 getInstance() { // 차서연 : factory2가 null일 경우 객체를 생성하고, null이 아닐 경우 factory2 반환
        if (factory == null) {
            factory = new IDCardFactoryChaSeoyeon2();
        }
        return factory;
    }
    
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }

    private void slowdown() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
    }
}
