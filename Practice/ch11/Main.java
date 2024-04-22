package Practice.ch11;

public class Main {
    public static void main(String[] args) {
        // File 객체 생성
        Entry f1 = new File("a.txt", 100);
        System.out.println(f1.getName());
        System.out.println(f1.getSize());
        f1.printList();
        f1.printList("c:/docs");
        System.out.println(f1);

        Entry f2 = new File("b.txt", 200);

        // Directory 객체 생성
        Entry d1 = new Directory("root");
        Directory d2 = new Directory("bin");
        
        System.out.println(d1.getName());
        System.out.println(d1.getSize());

        ((Directory)d1).add(f1); // 타입캐스팅과 . 중 우선순위는 .이 더 높기 때문에 한 번 더 괄호를 쳐준다.
        ((Directory)d1).add(f2); // 다운캐스팅
        d1.printList();

        d2.add(new File("bin.txt", 300));
        ((Directory)d1).add(d2);
        d1.printList();

        System.out.println(d1.getSize());
    }
}
