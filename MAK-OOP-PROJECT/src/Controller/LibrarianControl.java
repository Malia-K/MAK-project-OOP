package Controller;
import java.io.BufferedReader;
import Model.Book;
import java.util.Vector;
import Model.Librarian;

public class LibrarianControl extends EmployeeControl {
	BufferedReader br = new BufferedReader(New InputStreamReader(System.in));
    private Librarian librarian;
    private Vector <Book> library;
    private ReaderControl readerControl;
    private BookControl bookControl;
    
    public LibrarianControl() {
    	
    }
    
    public LibrarianControl(User u) {
    	super(u);
    }
    
    public Librarian getLibrarian() {
        return (Librarian) this.getUser();
    }
    
    public void deleteBook() throws IOException {
    	System.out.println("Please, give the name of the book that you want to delete from library");
    	String bookName = br.readLine();
    	if(bookName() == 0) {
    		System.out.println("The input is empty, please try again");
    		deleteBook;
    		return;
    	}
    	for(Book b: Database.getInstance().getLibrary()) {
    		if(b.getName().equals(bookName)) {
    			Database.getInstance().getLibrary().remove(b);
    			System.out.printlm("Book " + bookName + " deleted");
    			return;
    		}
    	}
    	System.out.println("Book " + bookName + " wasn't found");
    }
    
    public void manageBooks() throws NumberFormatException, IOException {
    	System.out.println("Choose action: \n\t0. Return to menu\n\t1. Add book\n\t2. Delete Book");
    	try {
    		int action = Integet.parseInt(br.readLine());
    		if(action == 0) {
    			return;
    		}
    		
    		else if(action == 1) {
    			(new addBook(getBook())).
    		}
    	}
    	
    	
    }
    
    
    


}
