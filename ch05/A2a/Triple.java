package ch05.A2a;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Triple {
    // key와 value("ALPHA", Triple("ALPHA") 객체), ...
    // <> -> Type Parameter, String과 Triple 타입의 key와 value를 갖는 HashMap 생성
    private static Map<String,Triple> map = new HashMap<>();
    
    // static 변수임을 한 번에 설정
    static { // static -> 클래스 로드 시 실행
        String[] names = { "ALPHA", "BETA", "GAMMA" };
        Arrays.stream(names).forEach(s -> map.put(s, new Triple(s)));
    }

    private String name;

    private Triple(String name) {
        System.out.println("The instance " + name + " is created.");
        this.name = name;
    }

    public static Triple getInstance(String name) {
        return map.get(name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
