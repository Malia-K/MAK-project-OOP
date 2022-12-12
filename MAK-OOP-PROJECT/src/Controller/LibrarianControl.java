package Controller;

import Model.Book;
import java.util.Vector;
import Model.Librarian;

public class LibrarianControl extends EmployeeControl {
    private Librarian librarian;
    private Vector <Book> library;
    private ReaderControl readerControl;
    private BookControl bookControl;
    
    public Librarian getLibrarian() {
        return this.librarian;
    }
    


}
