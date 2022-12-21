package Model;

import java.io.Serializable;

public class Book implements Serializable, Comparable<Book>, Cloneable{
	private static final long serialVersionUID = 1L;
	private String name;
	private String author;
    
	public Book() {}
	
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}

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
    
    public boolean equals(Object o) {
    	if(this == o) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		
		Book b = (Book) o;
		return name.equals(b.getName()) && author.equals(b.getAuthor());
    }
    
	public int compareTo(Book o) {
		if(author.compareTo(o.getAuthor()) == 0) {
			return name.compareTo(o.getName());
		}
		return author.compareTo(o.getAuthor());
	}
	
	public Object clone() throws CloneNotSupportedException {
		Book b = (Book) super.clone();
		return b;
	}
    
    public String toString() {
    	return "book name: " + name + "\nbook author: " + author;
    }
}
