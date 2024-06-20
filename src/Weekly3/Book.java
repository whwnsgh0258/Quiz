package Weekly3;

public class Book <T>{
    private String title; // 제목
    private String author; // 저자
    private T identifier; // 고유 식별자

    public Book(String author, T identifier, String title) {
        this.author = author;
        this.identifier = identifier;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public T getIdentifier() {
        return identifier;
    }

    public String getTitle() {
        return title;
    }
}