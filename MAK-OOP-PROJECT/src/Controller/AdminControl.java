package Controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Model.Admin;
import Model.Database;
import Model.User;
public class AdminControl extends EmployeeControl {
	/*
	 * 
	 * Describes the functionality and actions of the admin
	 * 
	 */
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public AdminControl() {}
	
	public AdminControl(User u) {
		super(u);
	}
	
    public Admin getAdmin() {
        return (Admin) this.getUser();
    }
    
    public void deleteUser() throws IOException {
    	System.out.println("Please, give the ID of user that you want to delete");
		String id = br.readLine();
		if(id.length() == 0) {
			System.out.println("The input is empty, please try again");
			deleteUser();
			return;
		}
		for(User u: Database.getUsers()) {
			if(u.getId().equals(id)) {
				Database.getUsers().remove(u);
				System.out.println("User " + id + " deleted");
				return;
			}
		}
		System.out.println("User " + id + " wasn't found");
    }
    
    public void manageUsers() throws NumberFormatException, IOException {
    	System.out.println("Choose action:\n\t0. Return to menu\n\t1. Add User\n\t2. Update User\n\t3. Delete User");
    	try {
    		int action = Integer.parseInt(br.readLine());
	    	if(action == 0) {
//	    		(new UserControl(getAdmin())).viewMainPage();
	    		return;
	    	}
	    	else if(action == 1) {
	    		(new AddUsers(getAdmin())).createUser();
	    	}
	    	else if(action == 2) {}
	    	else if(action == 3) {
	    		deleteUser();
	    	}
	    	else {
	    		System.err.println("Sorry, this option doesn't exist\nPlease, try again!");
	    		manageUsers();
	    	}
			Database.databaseSave();
    	} catch (NumberFormatException nfe) {
			System.err.println("Invalid input, please, try again!");
			manageUsers();
		}
    }

}