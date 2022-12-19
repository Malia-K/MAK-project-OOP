package Model;

import java.util.Vector;

import enums.Gender;

public class Employee extends User {
    private static final long serialVersionUID = 1L; 
	private int experience;
    private Vector<Message> messages;
    
    public Employee() {}
    
    public Employee(String firstName, String lastName, Gender gender, String birthDate, String password, String enrolled, String id, String login, int experience) {
    	super(firstName, lastName, gender, birthDate, password, enrolled, id, login);
    	this.experience = experience;
    }
    
    public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public Vector<Message> getMessages() {
		return messages;
	}
	
	public String toString() {
		return super.toString() + "\nexperience: " + experience;
	}
}
