package Controller;

import Model.*;

public class ManageUsers {
	public ManageUsers() {}
	
	private void gui() {
		String s = new String();
		
		for(int i = 0; i < 50; i++) {
			s += "_";
		}
		System.out.println(s);
		
		System.out.println("Please, choose what kind of user you want to create:"
				+ "\n\t1. Admin" + "\n\t2. Teacher" + "\n\t3. Manager" + "\n\t4. Librarian"
				+ "\n\t5. Student" + "\n\t6. Researcher" + "\nChoose number or print 0 if you want to leave:");
	}
	
	private User createEmployee(int n) {
		System.out.println("\tExperience");
		if(n == 1) return createAdmin();
		return null;
	}
	
	private User createAdmin() {
		Admin a = new Admin();
		return a;
	}
	
	private User createTeacher() {
		Teacher t = new Teacher();

	}
	
	private User createStudent() {
		
	}
	
	private User createManager() {
		
	}
	
	private User createLibrarian() {
		
	}
	
	private User createResearcher() {
		
	}
	
	
	public void createUser() {
		gui();
		
		int action = 1;
		if(action == 0) return;
		System.out.println("Please, add following information:\n\tFirst Name\n\tLast Name\n\tGender\n\tBirth Date");
		if(action <= 4) {
			createEmployee(action);
		}
		else if(action == 5) {
			createStudent();
		}
		else if(action == 6) {
			createResearcher();
		}
	}
}