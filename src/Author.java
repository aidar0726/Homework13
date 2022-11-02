import java.util.Objects;

public class Author {
    private String authorName;
    private String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return authorName.equals(c2.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName);
    }

    @Override
    public String toString() {
        return "Обект Author: " + "Имя автора: " + authorName + " , Фамилия автора: " + authorSurname;
    }
}
