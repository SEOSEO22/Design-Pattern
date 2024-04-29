package hw.ch11;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name, date, author;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public Directory(String name, String date, String author) { // 차서연 : 생성자 추가
        this.name = name;
        this.date = date;
        this.author = author;
    }

    @Override
    public int getCount() { // 차서연 : 추상 메소드 구현
        int num = 0;
        for (Entry e : directory) {
            num += e.getCount();
        }
        return num;
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
        int size = 0;
        for (Entry entry: directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry: directory) {
            entry.printList(prefix + "/" + name);
        }
    }

    // 디렉터리 엔트리를 디렉터리에 추가한다
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }
}
