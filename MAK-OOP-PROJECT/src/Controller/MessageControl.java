package Controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;
import java.util.stream.Collectors;

import Model.Database;
import Model.Employee;
import Model.Message;

public class MessageControl {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Employee sender;
	
	public MessageControl() {}
	
	public MessageControl(Employee sender) {
		this.sender = sender;
	}

	public Employee getSender() {
		return sender;
	}
	
	public Vector <Employee> getChats() {
		Vector <Employee> recipients = new Vector<Employee>();
		for(Message m: (Vector <Message>) Database.getMessages().stream().filter(m -> m.getSender().equals(sender)).collect(Collectors.toCollection(Vector::new))) {
			if(!recipients.contains(m.getRecipient())) {
				recipients.add(m.getRecipient());
			}
		}
		return recipients;
	}
	
	public void viewChats() {
    	System.out.println("Inbox:");
		for(Employee e: getChats()) {
			System.out.println("\t* " + e.getFirstName() + " " + e.getLastName());
		}
	}
	
	public Vector <Message> getChatMessage(Employee recipient) {
		Vector <Message> dialog = new Vector <Message>();
		for(Message m: (Vector <Message>)Database.getMessages().stream().filter(s -> s.getSender().equals(sender) && s.getRecipient().equals(recipient)).collect(Collectors.toCollection(Vector::new))) {
    		dialog.add(m);
    	}
		return dialog;
	}
	
	public void sendMessage() {
		
	}
	
	public void deleteMessage() {
		System.out.println("Choose from which chat you want to delete message\n");
		
		for(Employee e: getChats()) {
			System.out.println("* " + e.getFirstName() + " " + e.getLastName());
		}
	}

}
