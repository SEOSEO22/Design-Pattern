package hw.ch01;

public class Book {
    private String name;
    private String author; // 차서연 : author 필드 생성

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
