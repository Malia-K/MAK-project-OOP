package Model;

import java.io.Serializable;
import java.sql.Date;

public class User implements Comparable<User>, Serializable, Researcher, Cloneable {

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
    
    private String getFirstName() {
        return this.firstName;
    }
    
    /**
    * @generated
    */
    private String setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    
    /**
    * @generated
    */
    public String getFirstName() {
        return this.firstName;
    }
    
    /**
    * @generated
    */
    public String setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    
    /**
    * @generated
    */
    private String getLastName() {
        return this.lastName;
    }
    
    /**
    * @generated
    */
    private String setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    /**
    * @generated
    */
    public String getLastName() {
        return this.lastName;
    }
    
    /**
    * @generated
    */
    public String setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    

    private Date getBirthDate() {
        return this.birthDate;
    }

    private Date setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    

    public Date getBirthDate () {
        return this.birthDate ;
    }
    

    private String getId() {
        return this.id;
    }
    
    /**
    * @generated
    */
    private String setId(String id) {
        this.id = id;
    }
    
    
    /**
    * @generated
    */
    public String getId() {
        return this.id;
    }
    
    /**
    * @generated
    */
    public String setId(String id) {
        this.id = id;
    }
    
    
    /**
    * @generated
    */
    private String getLogin() {
        return this.login;
    }
    
    /**
    * @generated
    */
    private String setLogin(String login) {
        this.login = login;
    }
    
    
    /**
    * @generated
    */
    public String getLogin() {
        return this.login;
    }
    
    /**
    * @generated
    */
    public String setLogin(String login) {
        this.login = login;
    }
    
    
    /**
    * @generated
    */
    private String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    /**
    * @generated
    */
    private String setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    /**
    * @generated
    */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    /**
    * @generated
    */
    public String setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    /**
    * @generated
    */
    private String getPassword() {
        return this.password;
    }
    
    /**
    * @generated
    */
    private String setPassword(String password) {
        this.password = password;
    }
    
    
    /**
    * @generated
    */
    public String getPassword() {
        return this.password;
    }
    
    /**
    * @generated
    */
    public String setPassword(String password) {
        this.password = password;
    }
    
    
    /**
    * @generated
    */
    public String getPersonalMail() {
        return this.personalMail;
    }
    
    /**
    * @generated
    */
    public String setPersonalMail(String personalMail) {
        this.personalMail = personalMail;
    }
    
    
    /**
    * @generated
    */
    private String getPersonalMail() {
        return this.personalMail;
    }
    
    /**
    * @generated
    */
    private String setPersonalMail(String personalMail) {
        this.personalMail = personalMail;
    }
    
    
    /**
    * @generated
    */
    public String getCorporativeMail() {
        return this.corporativeMail;
    }
    
    /**
    * @generated
    */
    public String setCorporativeMail(String corporativeMail) {
        this.corporativeMail = corporativeMail;
    }
    
    
    /**
    * @generated
    */
    private String getCorporativeMail() {
        return this.corporativeMail;
    }
    
    /**
    * @generated
    */
    private String setCorporativeMail(String corporativeMail) {
        this.corporativeMail = corporativeMail;
    }
    
    
    
    /**
    * @generated
    */
    public Database getDatabase() {
        return this.database;
    }
    
    /**
    * @generated
    */
    public Database setDatabase(Database database) {
        this.database = database;
    }


	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return 0;
	}
    
    
    
}
