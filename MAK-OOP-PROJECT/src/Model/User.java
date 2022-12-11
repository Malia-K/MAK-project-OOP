package Model;

import java.io.Serializable;
import java.sql.Date;


public class User implements Comparable<User>, Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	//Researcher, 
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String id;
    private String login;
    private String phoneNumber;
    private String password;
    private String personalMail;
    private String corporativeMail;
    private Database database;
    
    

    //constructors
    
    public User() {}
    
    public void s() {
    	
    }
    
    

	public User(String firstName, String lastName, Date birthDate, String id, String login, String phoneNumber,
			String password, String personalMail, String corporativeMail, Database database) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.id = id;
		this.login = login;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.personalMail = personalMail;
		this.corporativeMail = corporativeMail;
		this.database = database;
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



	public Date getBirthDate() {
		return birthDate;
	}



	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getPersonalMail() {
		return personalMail;
	}



	public void setPersonalMail(String personalMail) {
		this.personalMail = personalMail;
	}



	public String getCorporativeMail() {
		return corporativeMail;
	}



	public void setCorporativeMail(String corporativeMail) {
		this.corporativeMail = corporativeMail;
	}



	public Database getDatabase() {
		return database;
	}



	public void setDatabase(Database database) {
		this.database = database;
	}



	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return 0;
	}
    
    
    
}
