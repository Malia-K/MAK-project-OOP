package Controller;

import Model.User;

public class ManageUsers {
	public ManageUsers() {}
	
	private void gui() {
		String s = new String();
		
		for(int i = 0; i < 50; i++) {
			s += "_";
		}
		System.out.println(s);
		
		System.out.println("Please, choose what kind of user you want to create:"
				+ "\n\t1. Admin" + "\n\t2. Teacher" + "\n\t3. Student" + "\n\t4. Manager"
				+ "\n\t5. Librarian" + "\n\t6. Researcher" + "\nChoose number or print 0 if you want to leave:");
	}
	
	private User createAdmin() {
		System.out.println("Please, add following information:\n\tFirst Name\n\tLast Name\n\tGender\n\tBirth Date\n\tExperience");
		return null;
	}
	
	private void createTeacher() {
		
	}
	
	private void createStudent() {
		
	}
	
	private void createManager() {
		
	}
	
	private void createLibrarian() {
		
	}
	
	private void createResearcher() {
		
	}
	
	
	public void createUser() {
		gui();
		
		int action = 1;
		if(action == 0) return;
		else if(action == 1) {
			createAdmin();
		}
		else if(action == 2) {
			createTeacher();
		}
		else if(action == 3) {
			createStudent();
		}
		else if(action == 4) {
			createManager();
		}
		else if(action == 5) {
			createLibrarian();
		}
		else if(action == 6) {
			createResearcher();
		}
	}
}
