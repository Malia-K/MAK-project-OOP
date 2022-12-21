package Controller;

import Model.Book;

public class BookControl {
    private LibrarianControl librarianControl;
    private Book book;
    public BookControl() {
    	
    }
    
    public BookControl(Book b) {
    	this.book = b; 
    }
    
    public Book getBook() {
    	return this.book;
    }
    
    
    
}
