package Weekly3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookSelf <T> implements BookManager{
    private List<Book<T>> books;

    public BookSelf(List<Book<T>> books) {
        this.books = books;
    }

    @Override
    public void addBook(Book t) {
        this.books.add(t);
    }

    @Override
    public void removeBook(Book t) {
        if (this.books.contains(t)) {
            this.books.remove(t);
        }else{
            System.out.println("해당하는 책이 없습니다");
        }
    }

    @Override
    public List<Book> searchByTitle(String title) {
        return List.of();
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        return List.of();
    }

}
