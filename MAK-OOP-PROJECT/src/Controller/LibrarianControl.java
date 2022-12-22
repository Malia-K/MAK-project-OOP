package Controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Model.*;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;


public class LibrarianControl extends EmployeeControl {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private Librarian librarian;
    private ReaderControl readerControl;
    private BookControl bookControl;

    
    public LibrarianControl() {}
    
    public LibrarianControl(User u) {
    	super(u);
    }
    
    public Librarian getLibrarian() {
        return (Librarian) this.getUser();
    }
    



	public void manageBooks() throws NumberFormatException, IOException {
    	System.out.println("Choose action: \n\t0. Return to menu\n\t1. Add book\n\t2. Delete Book\n");
    	try {
    		int action = Integer.parseInt(br.readLine());
    		if(action == 0) {
    			// view main page
    		}
    		else if(action == 1) {
    			bookControl.addBook();
    		}else if(action == 2) {
    			bookControl.deleteBook();
    		}
    	}catch (NumberFormatException nfe) {
			System.err.println("Invalid input, please, try again!");
			manageBooks();
		}
    	
    	
    }
    
    
    public void manageReaders() throws NumberFormatException, IOException {
    	System.out.println("Choose action: \n\t0. Return to menu \\n\\t1. Add new reader \\n\\t2. Delete reader");
    	try {
    		int action = Integer.parseInt(br.readLine());
    		if(action == 0) {
    			// view main page
    		}
    		else if(action == 1) {
    			readerControl.addReader();
    		}else if(action == 2) {
    			readerControl.deleteReader();
    		}
    	}catch (NumberFormatException nfe) {
			System.err.println("Invalid input, please, try again!");
			manageBooks();
		}
    	
    	
    }
    
    
    public void viewLibrary() {
    	String list = "";

        list += Format.formatDiv("a----------------b----------------------c\n");
        list += Format.formatRow("|   BOOK NAME    |      BOOK AUTHOR     |\n");
        list += Format.formatDiv("d----------------e----------------------f\n");
        System.out.print(list);
    	for(Book o : Database.getLibrary()) {
    		String str1 = String.format("| %14s | %-21s |", 
    									o.getName(), o.getAuthor());
            System.out.println(Format.formatRow(str1));
    	}
    	System.out.println(
    			Format.formatDiv("g----------------h----------------------i"));

    }
    
    
    public void viewReader() {
    	String list = "";

        list += Format.formatDiv("a----------------b----------------------c\n");
        list += Format.formatRow("|   READER ID    |      TAKEN BOOK      |\n");
        list += Format.formatDiv("d----------------e----------------------f\n");
        System.out.print(list);
    	for(Entry<User, Book> o : Database.getReaders().entrySet()) {
    		String str1 = String.format("| %14s | %-21s |", 
    									o.getKey().getId(), o.getValue().getName());
            System.out.println(Format.formatRow(str1));
    	}
    	System.out.println(
    			Format.formatDiv("g----------------h----------------------i"));

    }
    
    
    
    public void viewMainPage() throws InterruptedException {
	      super.viewMainPage();
	      System.out.print( " 4.  Manage Books \n"
			              + " 5.  Manage Readers \n"
			              + " 6.  Library \n"
			              + " 7.  Readers \n"
			              );

	    }
    
    
    


}