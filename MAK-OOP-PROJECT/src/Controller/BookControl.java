package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Model.Book;
import Model.Database;

public class BookControl {
    private Book book;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public BookControl() {}
    
    public BookControl(Book b) {
    	this.book = b; 
    }
    
    public Book getBook() {
    	return this.book;
    }
    
    public void deleteBook() throws IOException {
    	System.out.println("Please, give the name of the book that you want to delete from library");
    	String bookName = br.readLine();
    	if(bookName.length() == 0) {
    		System.out.println("The input is empty, please try again");
    		deleteBook();
    		return;
    	}
    	for(Book b: Database.getInstance().getLibrary()) {
    		if(b.getName().equals(bookName)) {
    			Database.getInstance().getLibrary().remove(b);
    			System.out.println("Book '" + bookName + "' deleted");
    			return;
    		}
    	}
    	System.out.println("Book '" + bookName + "' wasn't found");
    }
    
    
    public void addBook() throws IOException {
    	System.out.println("Please, add following information:\n" 
				+ "\tName of the Book:");
    	String bookName = br.readLine();
    	System.out.println("\n\t Author:");
    	String bookAuthor = br.readLine();
    	Book newBook = new Book(bookName, bookAuthor);
    	Database.getLibrary().add(newBook);
    	System.out.println("Book '" + bookName + "' successfully added");
    }
    
    
    
}
