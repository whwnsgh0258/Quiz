package Weekly3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookSelf<T> implements BookManager {
    private List<Book<T>> books;

    public BookSelf() {
        this.books = new ArrayList<>();
    }

    @Override
    public void addBook(Book t) {
        this.books.add(t);
        System.out.println(t + " 책이 추가되었습니다");
    }

    @Override
    public void removeBook(Book t) {
        if (this.books.contains(t)) {
            this.books.remove(t);
            System.out.println(t + " 책이 삭제되었습니다.");
        } else {
            System.out.println("해당하는 책이 없습니다");
        }
    }

    @Override
    public List<Book> searchByTitle(String title) {
        if (this.books.isEmpty()) {
            return null;
        }else {
            return books.stream().filter(b -> b.getTitle().equalsIgnoreCase(title)).collect(Collectors.toList());
        }
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        if (this.books.isEmpty()) {
            return null;
        }
        return books.stream().filter(b -> b.getAuthor().equalsIgnoreCase(author)).collect(Collectors.toList());
    }
}
