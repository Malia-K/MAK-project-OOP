package Model;

import java.io.Serializable;
import enums.*;
import java.time.LocalDate;

public  class User implements Comparable<User>, Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate birthDate;
    private String password;
    private LocalDate enrolled;
    private String id;
    private String login;
    
    public User() {}
    
    public User(String firstName, String lastName, Gender gender, String birthDate, String password, String enrolled, String id, String login) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.gender = gender;
    	this.birthDate = LocalDate.parse(birthDate);
    	this.password = password;
    	this.enrolled = LocalDate.parse(enrolled);
    	this.id = id + String.format("%02d", this.enrolled.getYear() % 100) + firstName.toUpperCase().charAt(0) + lastName.toUpperCase().charAt(0) + String.format("%04d", (Database.getUsers().size() + 1) % 1000);
    	this.login = login;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender g) {
		gender = g;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public void setBirthDate(String birthDate) {
		setBirthDate(LocalDate.parse(birthDate));
	}
	
	public LocalDate getEnrolledDate() {
		return enrolled;
	}

	public String getId() {
		return id;
	}

	public String getLogin() {
		return login;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void viewMainPage() {
	    String header = "";
	      
	      header += formatDiv("a" + "-".repeat(43) + "c" +"\n");
	      header += formatRow("|"+ " ".repeat(16) +  "Operations:" + " ".repeat(16) + "|\n");
	      header += formatDiv("g" +"-".repeat(43) + "i"+ '\n');
	      System.out.print(header);
	      System.out.print(  " 1.  News \n"
	               + " 2.  User's information \n"
	               + " 3.  Library \n");
	  }
	  
	  
	  
	   public static String formatRow(String str){
	        return str.replace('|', '\u2502');
	    }

	    public static String formatDiv(String str){
	        return str.replace('a', '\u250c')
	                .replace('b', '\u252c')
	                .replace('c', '\u2510')
	                .replace('d', '\u251c')
	                .replace('e', '\u253c')
	                .replace('f', '\u2524')
	                .replace('g', '\u2514')
	                .replace('h', '\u2534')
	                .replace('i', '\u2518')
	                .replace('-', '\u2500');
	    }

	public int compareTo(User o) {
		if(lastName.compareTo(o.getLastName()) == 0) {
			return firstName.compareTo(o.getFirstName());
		}
		return lastName.compareTo(o.getLastName());
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		User u = (User) o;
		
		return gender == u.getGender() && firstName.equals(u.getFirstName()) && lastName.equals(u.getLastName()) 
				&& birthDate.equals(u.getBirthDate()) && enrolled.equals(u.getEnrolledDate());
	}
	
	public String toString() {
		return "name: " + firstName + "\nlast name: " + lastName + 
				"\ngender: " + gender + "\nbirth date: " + birthDate + 
				"\nenrolled date: " + enrolled + "\nid: " + id + 
				"\nlogin: " + login;
	}
}
	

