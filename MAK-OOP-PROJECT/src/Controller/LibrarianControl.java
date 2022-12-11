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
    
    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }
    
    public Vector <Book> getLibrary() {
        return this.library;
    }

    public BookControl getBookControl() {
        return this.bookControl;
    }
    
    public ReaderControl getReaderControl() {
        return this.readerControl;
    }  
}
