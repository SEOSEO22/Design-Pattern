package hw.ch10;

import java.util.*;

class Main {
    public static void main(String[] args) {
        // Student 리스트로 변환
        List<Student> list = new ArrayList<Student>(); // 차서연 : 빈 리스트 생성
        list.add(new Student("최승훈", "20240418",171)); // Student 요소 추가
        list.add(new Student("차서연", "20220732",170)); // Student 요소 추가
        list.add(new Student("이송미", "20220810",165)); // Student 요소 추가
        list.add(new Student("윤윤지", "20220823", 160)); // Student 요소 추가
        list.add(new Student("여현정", "20220956",155)); // Student 요소 추가

        System.out.println("학번 : 20220732, 이름 : 차서연");
        System.out.println();
        
        // 오름차순
        System.out.println("** (1) 정렬 결과 (오름차순)");
        list.sort(new ComparatorAscending());
        System.out.println(list);
        System.out.println();

        // 내림차순
        System.out.println("** (2) 정렬 결과 (내림차순)");
        list.sort(new ComparatorDescending());
        System.out.println(list);
    }
}
