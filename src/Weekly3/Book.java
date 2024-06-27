package Weekly3;

public class Book<T> {
    private String title; // 제목
    private String author; // 저자
    private T identifier; // 고유 식별자

    public Book( String title, String author, T identifier) {
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

    // 이거 몰랐음
    @Override
    public String toString() {
        return "제목 = " + title + ", 저자 = " + author + ", id = " + identifier;
    }
}
