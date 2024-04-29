package hw.ch11;

public class File extends Entry {
    private String name, date, author;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public File(String name, String date, int size, String author) { // 차서연 : 생성자 추가
        this.name = name;
        this.date = date;
        this.size = size;
        this.author = author;
    }

    @Override
    public int getCount() { // 차서연 : 추상 메소드 구현
        return 1;
    }

    @Override
    public String getDate() { // 차서연 : 추상 메소드 구현
        return date;
    }

    @Override
    public String getAuthor() { // 차서연 : 추상 메소드 구현
        return author;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
