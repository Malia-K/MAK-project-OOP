package Controller;

import Model.Employee;
import Model.User;

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
    	

    }

}
