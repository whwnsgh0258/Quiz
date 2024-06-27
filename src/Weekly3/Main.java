package Weekly3;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // BookShelf 객체 생성 (String 타입 식별자)
        BookShelf<String> bookShelf = new BookShelf<>();

        // BookStack 객체 생성 (Integer 타입 식별자)
        BookStack<Integer> bookStack = new BookStack<>();

        // 도서 정보 입력(BookShelf)
        System.out.println("도서 정보 입력 (BookShelf)");
        System.out.print("제목: ");
        String shelfTitle = scanner.nextLine();
        System.out.print("저자: ");
        String shelfAuthor = scanner.nextLine();
        System.out.print("식별자(문자열): ");
        String shelfIdentifier = scanner.nextLine();

        // BookShelf에 도서 추가
        Book<String> shelfBook = new Book<>(shelfTitle, shelfAuthor, shelfIdentifier);
        bookShelf.addBook(shelfBook);

        // 도서정보 입력(BookStock)
        System.out.println("도서정보 입력 (BookStack)");
        System.out.print("제목: ");
        String stackTitle = scanner.nextLine();
        System.out.print("저자: ");
        String stackAuthor = scanner.nextLine();
        System.out.print("식별자 (정수): ");
        int stackIdentifier = scanner.nextInt();

        // BookStack에 도서 추가
        Book<Integer> stackBook = new Book<>(stackTitle, stackAuthor, stackIdentifier);
        bookStack.pushBook(stackBook);

        // BookShelf에서 도서 제목으로 검색
        System.out.print("검색하고 싶은 책의 제목을 입력하세요: ");
        scanner.nextLine();
        String searchTitle = scanner.nextLine();
        List<Book<String>> searchTitleResults = bookShelf.searchByTitle(searchTitle);
        System.out.println("제목 검색 결과:");
        for (Book<String> book : searchTitleResults) {
            System.out.println("제목: " + book.getTitle() + "저자: " + book.getAuthor());
        }

        // BookShelf에서 도서 저자로 검색
        System.out.print("검색하고 싶은 책의 저자를 입력하세요: ");
        String searchAuthor = scanner.nextLine();
        List<Book<String>> searchAuthorResults = bookShelf.searchByAuthor(searchAuthor);
        System.out.println("저자 검색 결과:");
        for (Book<String> book : searchAuthorResults) {
            System.out.println("제목: " + book.getTitle() + "저자: " + book.getAuthor());
        }

        // BookStack에서 도서 꺼내기 (popBook)
        try {
            Book<Integer> poppedBook = bookStack.popBook();
            System.out.println("제목: " + poppedBook.getTitle() + "저자: " + poppedBook.getAuthor());
        } catch (EmptyStackException e) {
            System.out.println("BookStack이 비어있습니다");
        }

        // BookStack에서 맨 위의 도서 확인하기 (peekBook)
        try {
            Book<Integer> peekedBook = bookStack.peekBook();
            System.out.println("제목: " + peekedBook.getTitle() + "저자: " + peekedBook.getAuthor());
        } catch (EmptyStackException e) {
            System.out.println("BookStack이 비어있습니다");
        }

        // BookStack이 비어있는지 확인하기 (isEmpty)
        boolean isEmpty = bookStack.isEmpty();
        System.out.println(isEmpty);

        scanner.close();
    }
}