package Controller;

import Model.*;

public class EmployeeControl extends UserControl {
	public EmployeeControl() {}
	
	public EmployeeControl(User u) {
		super(u);
	}

    public Employee getEmployee() {
    	return (Employee) super.getUser();
    }
    
    
    public void manageMessage() {
    	MessageControl mc = new MessageControl();
    	System.out.println("Messages: ");
    	System.out.println("1. Send Message \n"
    					 + "2. Update Message \n"
    			         + "3. Delete Message \n");
    	
    	System.out.println("Inbox : ");
    	viewMessage();
    }
    
    
    public void viewMessage() {
    	
    }

}
