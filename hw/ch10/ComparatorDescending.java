package hw.ch10;

import java.util.Comparator;

public class ComparatorDescending implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) { // 차서연 : 내림차순 정렬 구현
        return s2.compareTo(s1);
    }
}
