package Model;

import java.io.Serializable;
import enums.*;
import java.time.LocalDate;
import java.util.Objects;

/**
	 * 
	 * Class describing the most primitive user.
	 * 
	 */

public  class User implements Comparable<User>, Serializable, Cloneable {
	/*
	 * 
	 * Class describing the most primitive user.
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate birthDate;
    private String password;
    private LocalDate enrolled;
    private String id;
    private String login;
    
    /**
     * 
     * Default constructor.
     * 
     */
    public User() {}
    

    /**
     * 
     * Class constructor.
     * @param firstName
     * @param lastName
     * @param gender
     * @param birthDate
     * @param password
     * @param enrolled
     * @param id
     * @param login
     */
    public User(String firstName, String lastName, Gender gender, String birthDate, String password, String enrolled, String id, String login) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.gender = gender;
    	this.birthDate = LocalDate.parse(birthDate);
    	this.password = Integer.toString(hashCode(password));
    	this.enrolled = LocalDate.parse(enrolled);
    	this.id = id + String.format("%02d", this.enrolled.getYear() % 100) + firstName.toUpperCase().charAt(0) + lastName.toUpperCase().charAt(0) + String.format("%04d", (Database.getUsers().size() + 1) % 1000);
    	this.login = login;
    }
    
    /**
     * 
     * Returns the user's first name.
     * @return
     */

	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * 
	 * Sets the user's first name.
	 * @param firstName
	 */
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	/**
	 * 
	 * Returns the user's last name.
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}
	
	
	/**
	 * 
	 * Sets the user's last name. 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * 
	 * Returns the user's gender.
	 * @return
	 */
	public Gender getGender() {
		return gender;
	}
	
	/**
	 * 
	 * Sets the user's gender.
	 * @param g
	 */
	public void setGender(Gender g) {
		gender = g;
	}

	/**
	 * 
	 * Returns the user's birth date.
	 * @return
	 */
	public LocalDate getBirthDate() {
		return birthDate;
	}	
	
	/**
	 * 
	 * Sets the user's birth date. 
	 * @param birthDate
	 */
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	/**
	 * 
	 * Accepts a string to set the birth date.
	 * @param birthDate
	 */
	public void setBirthDate(String birthDate) {
		setBirthDate(LocalDate.parse(birthDate));
	}
	
	/**
	 * 
	 * Returns the user's enrolled date.
	 * @return
	 */
	public LocalDate getEnrolledDate() {
		return enrolled;
	}
	
	/**
	 * 
	 * Returns the user's ID.
	 * @return
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * 
	 * Returns the user's login.
	 * @return
	 */
	public String getLogin() {
		return login;
	}
	
	/**
	 * 
	 * Returns the user's password.
	 * @return
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * 
	 * Sets the user's password.
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = Integer.toString(hashCode(password));
	}
	
	/**
	 * 
	 * Simple comparison of users by last name and first name.
	 * 
	 */

	public int compareTo(User o) {
		if(lastName.compareTo(o.getLastName()) == 0) {
			return firstName.compareTo(o.getFirstName());
		}
		return lastName.compareTo(o.getLastName());
	}
	
	
	/**
	 * 
	 * Create an user's clone.
	 * 
	 */
	public Object clone() throws CloneNotSupportedException {
		User u = (User) super.clone();
		u.gender = (Gender)this.gender;
		return u;
	}
	
	/**
	 * 
	 * Comparisons of two users in every possible parameters.
	 * 
	 */
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		User u = (User) o;
		
		return gender == u.getGender() && firstName.equals(u.getFirstName()) && lastName.equals(u.getLastName()) 
				&& birthDate.equals(u.getBirthDate()) && enrolled.equals(u.getEnrolledDate());
	}

	
	/**
	 * 
	 * Password hashing.
	 * @param password
	 * @return
	 */
	public static int hashCode(String password) {
		return Objects.hash(password);
	}
	
	
	/**
	 * 
	 * ToString method to display all user's parameters correctly.
	 * 
	 */
	public String toString() {
		return "Name: " + firstName + "\nLast name: " + lastName + 
				"\nGender: " + gender + "\nBirth date: " + birthDate + 
				"\nEnrolled date: " + enrolled + "\nID: " + id + 
				"\nLogin: " + login;
	}
	

}
	

