import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

//    @OneToOne(mappedBy = "author")
    @OneToMany(mappedBy = "author")
    private List<Book> books;

    public Author() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
//        return "Author[id = " + id + ", name = '" + name + "', bookTitle = '" + book.getTitle() + "']";
        return "Author[id = " + id + ", name = '" + name + "', booksCount = " + books.size() + "]";
    }
}
