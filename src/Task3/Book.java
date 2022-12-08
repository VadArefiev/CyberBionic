package Task3;

public class Book {

    private Title title;
    private Author author;
    private Content content;

    public Book(Title title, Author author, Content content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public static void main(String[] args) {

        Book book = new Book(new Title("3 богатіря"),new Author("Толстой"),new Content("3 ТОМА"));

    }

    @Override
    public String toString() {
        return "Book{" +
                "title=" + title +
                ", author=" + author +
                ", content=" + content +
                '}';
    }
}
