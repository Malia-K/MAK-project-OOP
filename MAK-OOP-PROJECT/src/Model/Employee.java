package Model;

import java.util.Vector;

public class Employee extends User {
    private static final long serialVersionUID = 1L; 
	private int experience;
    private Vector<Message> messages;
    private Database database;
    
    public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public Vector<Message> getMessages() {
		return messages;
	}

	public void setMessages(Vector<Message> messages) {
		this.messages = messages;
	}

}
