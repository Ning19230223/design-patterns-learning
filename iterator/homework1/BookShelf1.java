package iterator.homework1;

import iterator.Aggregate;
import iterator.Book;
import iterator.BookShelfIterator;
import iterator.Iterator;

import java.util.ArrayList;

public class BookShelf1 implements Aggregate {

    private ArrayList books;

    public BookShelf1(int initialSize) {
        this.books = new ArrayList(initialSize);
    }

    public Book getBookAt(int index) {
        return (Book) books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator getIterator() {
        return new BookShelfIterator1(this);
    }
}
