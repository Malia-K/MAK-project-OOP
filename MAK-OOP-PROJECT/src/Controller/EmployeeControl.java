package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;
import java.util.stream.Collectors;

import Model.*;

public class EmployeeControl extends UserControl {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	public EmployeeControl() {}
	
	public EmployeeControl(User u) {
		super(u);
	}

    public Employee getEmployee() {
    	return (Employee) super.getUser();
    }
    
    
    public void manageMessage() {
    	System.out.println("Messages: ");
    	System.out.println("0. Go back\n" 
    					 + "1. Send Message \n"
    					 + "2. Check messages\n"
    			         + "3. Delete Message \n");
    	try {
			int action = Integer.parseInt(br.readLine());
			if(action < 0 || action > 3) {
				System.out.println("Such action doesn't exists, try again");
				manageMessage();
				return;
			}
			if(action == 0) return;
			else if(action == 1) {
				(new MessageControl(getEmployee())).sendMessage();
			}
			else if(action == 2) {
				viewMessage();
			}
			else if(action == 3) {
				(new MessageControl(getEmployee())).deleteMessage();
			}
		} catch (NumberFormatException | IOException e) {
			System.out.println("incorrect input");
			manageMessage();
			return;
		}
    }
    
    public void viewMessage() {
    	(new MessageControl(getEmployee())).viewChats();
    	
    	
    }

}
