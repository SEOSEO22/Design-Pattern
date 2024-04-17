package hw.ch10;

// 비교가능한 클래스가 되려면 Comparable 인터페이스를 구현해야 함.
public class Student implements Comparable<Student> {
    private String name, id; // 차서연 : 속성 추가
    private int height;

    public Student(String name, String id, int height) { // 차서연 : 생성자 추가
        this.name = name;
        this.id = id;
        this.height = height;
    }
    
    @Override
    public int compareTo(Student s) { // 차서연 : 조건문을 사용해 반환값 설정
        if (height > s.height) return 1;
        else if (height < s.height) return -1;
        else return 0;
    }
    
    public String toString() {
        return "(이름: " + name + ", 학번: " + id + ", 키: " + height + ")";
    }
}
