package Practice.ch06.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    // 프로덕트 원본(prototype)들을 관리하는 컬렉션
    private Map<String,Product> showcase = new HashMap<>();

    // Product : 부모 클래스 => 부모 타입으로 코딩해라!
    // 어떤 종류의 Product든지 다 받을 수 있다 => 유연성과 확장성이 좋다.
    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }

    public Product create(String prototypeName) {
        Product p = showcase.get(prototypeName); // 원본을 얻어옴
        return p.createCopy(); // 원본 객체를 복제해서 리턴함
    }
}
