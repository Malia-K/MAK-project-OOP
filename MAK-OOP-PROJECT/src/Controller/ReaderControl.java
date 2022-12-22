package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Model.*;

public class ReaderControl {
	private User reader;

	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    
    public ReaderControl() {}
    
    public ReaderControl(User u) {
    	this.reader = u;
    }
    
    
    public void addReader() throws IOException {
    	System.out.println("Please, add following information separated by space:\n" 
				+ "\t New reader's ID:");
    	String id = br.readLine();
    	System.out.println("\n\tTaken book:");
    	String bookName = br.readLine();
    	
    	for(User u : Database.getUsers()) {
    		if(u.getId().equals(id)) {
    			for(Book b : Database.getLibrary()) {
    	    		if(b.getName().equals(bookName)) {
    	    			Database.getReaders().put(u, b);
    	    			System.out.println("Reader '" + id + "' successfully added");
    	    			return;
    	    		}
    	    	}
    			System.out.println("There is no such a book. try again.. ");
    			addReader();
    			
    		}
    		System.out.println("There is no such reader. try again.. ");
			addReader();
    		
    	}

    }
    
    
    public void deleteReader() throws IOException {
    	System.out.println("Please, give the ID of reader you want to delete:");
    	String id = br.readLine();
    	
    	for(User u : Database.getUsers()) {
    		if(u.getId().equals(id)) {
    			Database.getReaders().remove(u);
    			System.out.println("Reader '" + id + "' was deleted");
    			
    		}
    		System.out.println("There is no such reader. try again.. ");
			deleteReader();
    		
    	}
    }
    
}
