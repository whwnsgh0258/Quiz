package Weekly3;

import java.util.EmptyStackException;
import java.util.Stack;

public class BookStack <T>{
    private Stack<Book<T>> books;
    public BookStack() {
        this.books = new Stack<>();
    }

    // Stack에 Book 추가
    public void pushBook(Book<T> book) {
        books.push(book);
    }

    // stack에 마지막에 추가된 Book 빼서 출력 (없으면 에러 throw)
    public Book<T> popBook() {
        if (books.isEmpty()) {
            throw new EmptyStackException();
        }else {
            return books.pop();
        }
    }

    // stack에 마지막에 추가된 Book 출력 (없으면 에러 throw)
    public Book<T> peekBook() {
        if (books.isEmpty()) {
            throw new EmptyStackException();
        }else {
            return books.peek();
        }
    }
    public Boolean isEmpty() {
        if (this.books.isEmpty()) {
            return true;
        }
        return false;
    }
}
