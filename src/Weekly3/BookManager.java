package Weekly3;

import java.util.List;

public interface BookManager<T>{
    void addBook(Book<T> t);
    void removeBook(Book<T> t);
    List<Book<T>> searchByTitle(String title);
    List<Book<T>> searchByAuthor(String author);
}
