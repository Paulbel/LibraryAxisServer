import java.util.List;

public interface BookDAO {
    List<Book> getBookList();

    void changeBookInfo(Book book);

    void addBook(Book book);

    List<Book> findBook(String name);
}


