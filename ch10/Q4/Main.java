package ch10.Q4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

        // 사전순으로 작은 순서
        list.sort( new Comparator<String>() { // 익명의 내부 클래스 사용
            public int compare(String a, String b) {
                // 두 문자열의 크기를 비교해야함
                return a.compareTo(b); // a 문자열이 b 문자열보다 크면 1 리턴, 작으면 -1 리턴, 같으면 0 리턴                
            }
        } );
        System.out.println(list);

        // 사전순으로 큰 순서 
        list.sort( new Comparator<String>() {
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        } );
        System.out.println(list);
    }
}
