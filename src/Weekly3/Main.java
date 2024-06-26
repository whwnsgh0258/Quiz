package Weekly3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();
        String author = sc.nextLine();
        String identifier = sc.nextLine();
        Book book1 = new Book<>(title, author, identifier);
        Book book2 = new Book<>(title, author, identifier);

        BookSelf<String> bookSelf = new BookSelf<>();
        bookSelf.addBook(book1);
        bookSelf.addBook(book2);
    }
}
