import java.util.ArrayList;

public class LibrarySystem {
    private ArrayList<Librarian> librarians;
    private ArrayList<Books> bookName;
    private ArrayList<Customer> customerName;
    private int numberOfBooks;
    private int numberOfEmployees;
    private int numberOfBorrowedBooks;

    public LibrarySystem(ArrayList<Librarian> librarians){
        this.librarians = librarians;
    }

    public LibrarySystem(Librarian libranian){
        this.librarians.add(libranian);
    }

}
