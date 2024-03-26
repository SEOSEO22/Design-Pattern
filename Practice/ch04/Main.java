package Practice.ch04;

import Practice.ch04.framwork.Factory;
import Practice.ch04.framwork.Product;
import Practice.ch04.idcard.IDCard;
import Practice.ch04.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        // 신분증을 직접 생성
        Product id1 = new IDCard("csy");
        id1.use();

        // 신분증을 공장을 통해서 생성
        Factory f1 = new IDCardFactory();
        Product id2 = f1.create("csy2");
        id2.use();
    }
}
