package iterator.homework1;

import iterator.Book;
import iterator.Iterator;

public class Main1 {

    public static void main(String[] args) {
        BookShelf1 bookShelf = new BookShelf1(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));  // 灰姑娘
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("East of Eden"));  // 伊甸园之东
        bookShelf.appendBook(new Book("Frankenstein"));  // 科学怪人
        bookShelf.appendBook(new Book("Gulliver's Travels"));  // 格列佛游记
        bookShelf.appendBook(new Book("Hamlet"));
        Iterator it = bookShelf.getIterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
