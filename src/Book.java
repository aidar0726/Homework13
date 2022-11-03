import java.util.Objects;

public class Book {
    private Author authorName;

    private String bookName;
    private int publishingYear;

    public Book(Author authorName, String bookName, int publishingYear) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }


    public String getBookName() {
        return bookName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {

        this.publishingYear = publishingYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return bookName.equals(c2.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName);
    }

    @Override
    public String toString() {
        return authorName.toString() +  ", Название книги: " + bookName + ", Год издания: " + publishingYear;
    }
}
