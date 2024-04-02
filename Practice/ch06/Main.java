package Practice.ch06;

import Practice.ch06.framework.Manager;
import Practice.ch06.framework.Product;

public class Main {
    public static void main(String[] args) {
        // 1. 클래스 이름을 이용해서 객체 생성
        Product upen1 = new UnderlinePen('=');
        upen1.use("duksung");

        Product mbox1 = new MessageBox('0');
        mbox1.use("duksung");

        // 2. 복제해서 객체 생성(클래스 이름이 필요X)
        Product upen2 = upen1.createCopy(); 
        upen2.use("duksung2");

        Product mbox2 = mbox1.createCopy();
        mbox2.use("duksung2");

        // 3. 매니저를 이용해서 객체를 생성하고 사용(클래스 이름 사용 X)
        // (1) 매니저 생성
        Manager manager = new Manager(); 

        // (2) 원본 등록
        UnderlinePen upen = new UnderlinePen('-'); 
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        // (3) 매니저로부터 객체 얻기
        Product p1 = manager.create("strong message"); // 복제품을 얻음
        p1.use("strong : duksung");

        Product p2 = manager.create("warning box");
        p2.use("warning : duksung");

        Product p3 = manager.create("slash box");
        p3.use("slash : duksung");
    }
}
