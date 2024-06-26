package Weekly3;

import java.util.EmptyStackException;
import java.util.Stack;

public class BookStack <T>{
    private Stack<Book<T>> books;
    public BookStack() {
        this.books = new Stack<>();
    }
    public void pushBook(Book<T> book) {
        books.push(book);
    }

    public Book<T> popBook() {
        try {
            return books.pop();
        } catch (EmptyStackException e){
            return null;
        }
    }
    public Book<T> peekBook() {
        try {
            return books.peek();
        } catch (EmptyStackException e){
            return null;
        }
    }
    public Boolean isEmpty() {
        if (this.books.isEmpty()) {
            return true;
        }
        return false;
    }
}
