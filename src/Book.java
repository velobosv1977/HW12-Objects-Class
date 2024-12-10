import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private Integer publicationData;

    public Book(String bookName, Author author, Integer publicationData) {
        this.bookName = bookName;
        this.author = author;
        this.publicationData = publicationData;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public Integer getPublicationData() {
        return publicationData;
    }

    public void setPublicationData(Integer publicationData) {
        this.publicationData = publicationData;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author) && Objects.equals(publicationData, book.publicationData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, publicationData);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author +
                ", publicationData=" + publicationData +
                '}';
    }
}
