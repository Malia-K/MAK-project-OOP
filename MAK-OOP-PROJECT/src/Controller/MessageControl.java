package Controller;

import Model.Employee;

public class MessageControl {
	private Employee sender;
	
	public MessageControl() {}
	
	public MessageControl(Employee sender) {
		this.sender = sender;
	}

	public Employee getSender() {
		return sender;
	}
	
	public void sendMessage() {
		
	}
	
	public void deleteMessage() {}

}
