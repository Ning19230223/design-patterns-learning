package iterator.homework1;

import iterator.Book;
import iterator.Iterator;

public class BookShelfIterator1 implements Iterator {

    private BookShelf1 bookShelf;

    private int index;

    public BookShelfIterator1(BookShelf1 bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index ++ ;
        return book;
    }
}
