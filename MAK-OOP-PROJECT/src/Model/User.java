package Model;

import java.io.Serializable;
import enums.*;
import java.sql.Date;

public class User implements Comparable<User>, Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
    private String firstName;
    private String lastName;
    private Gender gender;
    private Date birthDate;
    private String id;
    private String login;
    private String phoneNumber;
    private String password;
    private String personalMail;
    private String corporativeMail;
    
    public User() {}
    
    public User(String firstName, String lastName, Gender gender, Date birthDate, String id, String login) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.id = id;
		this.login = login;
	}
    
    public User(String firstName, String lastName, Gender gender, Date birthDate, String id, String login, String phoneNumber,
			String password, String personalMail, String corporativeMail) {
		this(firstName, lastName, gender, birthDate, id, login);
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.personalMail = personalMail;
		this.corporativeMail = corporativeMail;
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

	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
