package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIteratorBackward implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIteratorBackward(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = bookShelf.getLength() - 1; // 차서연 : 인덱스를 마지막 위치로 수정
    }

    @Override
    public boolean hasNext() {
        if (index >= 0) { // 차서연 :인덱스는 점점 감소하므로 0보다 크거나 같을 경우로 조건 수정
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = bookShelf.getBookAt(index);
        index--; // 차서연 : 인덱스가 감소하도록 수정
        return book;
    }
}
