package Controller;
import Model.Admin;
import Model.User;
public class AdminControl extends EmployeeControl {
	public AdminControl() {}
	
	public AdminControl(User u) {
		super(u);
	}
	
    public Admin getAdmin() {
        return (Admin) this.getUser();
    }
    

    public void manageUsers() {
    	
    }

}
