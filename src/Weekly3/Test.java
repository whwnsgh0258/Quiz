package Weekly3;

public class Test {
    public static void main(String[] args) {
        Book book1 = new Book("조준호", "123", "Hi");
        Book book2 = new Book("123", "456", "BYE");

        System.out.println(book1.getTitle());

        BookSelf bookManager =  new BookSelf<>();
        bookManager.addBook(book1);
        bookManager.addBook(book2);

        System.out.println(bookManager.searchByTitle("hi"));
        System.out.println(bookManager.searchByTitle("bye"));

        BookStack bookStack = new BookStack();
        bookStack.pushBook(book1);
        bookStack.pushBook(book2);
        System.out.println(bookStack.peekBook());
        System.out.println(bookStack.popBook());
        System.out.println(bookStack.popBook());
        System.out.println(bookStack.popBook());
        System.out.println(bookStack.peekBook());
    }
}
