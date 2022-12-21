package Controller;
import java.io.BufferedReader;


import java.io.IOException;
import java.io.InputStreamReader;

import Model.Admin;
import Model.Database;
import Model.User;

/**
	 * 
	 * Describes the functionality and actions of the admin.
	 * 
	 */
public class AdminControl extends EmployeeControl {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	/**
	 * 
	 * Default constructor.
	 * 
	 */
	public AdminControl() {}
	
	/**
	 * 
	 * Class constructor.
	 * @param u
	 */
	public AdminControl(User u) {
		super(u);
	}
	/**
	 * 
	 * Returns the admin.
	 * @return
	 */
    public Admin getAdmin() {
        return (Admin) this.getUser();
    }
    
    /**
     * 
     * Method for deleting users from the system.
     * @throws IOException
     */
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
    /**
     * 
     * A method that describes all possible manipulations on the user that the admin can do (delete, add, etc.).
     * @throws NumberFormatException
     * @throws IOException
     */
    public void manageUsers() throws NumberFormatException, IOException {
    	System.out.println("Choose action:\n\t0. Return to menu\n\t1. Add User\n\t2. Delete User");
    	try {
    		int action = Integer.parseInt(br.readLine());
	    	if(action == 0) {
//	    		(new UserControl(getAdmin())).viewMainPage();
	    		return;
	    	}
	    	else if(action == 1) {
	    		(new AddUsers(getAdmin())).createUser();
	    	}
	    	else if(action == 2) {
	    		deleteUser();
	    	}
	    	else {
	    		System.err.println("Sorry, this option doesn't exist\nPlease, try again!");
	    	}
			Database.databaseSave();
    	} catch (NumberFormatException nfe) {
			System.err.println("Invalid input, please, try again!");
		}
		manageUsers();
    }

}