package Model;

public class Book {
	private String name;
	private String author;
    
	public Book() {}

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }  
    
    public String toString() {
    	return "book name: " + name + "\nbook author: " + author;
    }
}
