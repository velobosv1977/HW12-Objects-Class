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
}
