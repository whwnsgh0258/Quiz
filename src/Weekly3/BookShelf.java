package Weekly3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookShelf<T> implements BookManager {
    private List<Book<T>> books;

    public BookShelf() {
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
    public List<Book<T>> searchByTitle(String title) {
        List<Book<T>> result = new ArrayList<>();
        for (Book<T> book : books) {
            if (book.getTitle().equalsIgnoreCase(book.getTitle())) {
                result.add(book);
            }else {
                System.out.println("검색 결과가 없습니다");
            }
        }
        return result;
    }

    @Override
    public List<Book<T>> searchByAuthor(String author) {
        List<Book<T>> result = new ArrayList<>();
        for (Book<T> book : books) {
            if (book.getAuthor().equalsIgnoreCase(book.getAuthor())) {
                result.add(book);
            }else {
                System.out.println("검색 결과가 없습니다");
            }
        }
        return result;
    }
}