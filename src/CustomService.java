import java.util.List;

public class CustomService {
    public List<Book> getBookList() {
        BookDAO bookDAO = BookDAOImpl.getInstance();
        return bookDAO.getBookList();
    }

    public void changeBookInfo(Book book) {
        BookDAO bookDAO = BookDAOImpl.getInstance();
        bookDAO.changeBookInfo(book);
    }

    public List<Person> getPersonList() {
        PersonDAO personDAO = PersonDAOImpl.getInstance();
        return personDAO.getPersonList();
    }

    public List<Organisation> getOrganisationList() {
        OrganisationDAO organisationDAO = OrganisationDAOImpl.getInstance();
        return organisationDAO.getOrganisationList();
    }

    public void addBook(Book book) {
        BookDAO bookDAO = BookDAOImpl.getInstance();
        bookDAO.addBook(book);
    }

    public List<Book> findBook(String name) {
        BookDAO bookDAO = BookDAOImpl.getInstance();
        return bookDAO.findBook(name);
    }

}
