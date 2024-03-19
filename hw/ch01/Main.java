package hw.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("20220732 차서연");

        BookShelf bookShelf = new BookShelf(6); // 차서연 : 책 최대 개수 수정 및 책 정보 수정
        bookShelf.appendBook(new Book("자료구조론1", "박우창"));
        bookShelf.appendBook(new Book("자료구조론2", "최승훈"));
        bookShelf.appendBook(new Book("자료구조론3", "유견아"));
        bookShelf.appendBook(new Book("자료구조론4", "이주영"));
        bookShelf.appendBook(new Book("자료구조론5", "이경미"));
        bookShelf.appendBook(new Book("인간실격", "다자이 오사무"));

        // 명시적으로 Iterator를 사용하는 방법 
        Iterator<Book> it = bookShelf.iteratorBackward(); // 차서연 : 역방향 반복자
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        // 확장 for문을 사용하는 방법 
        for (Book book: bookShelf) { // 차서연 : 순방향 반복자
            System.out.println(book.getName());
        }
        System.out.println();
    }
}
