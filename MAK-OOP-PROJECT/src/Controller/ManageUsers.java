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
		if(n == 2) return createTeacher();
		if(n == 3) return createManager();
		return createLibrarian();
	}
	
	private User createAdmin() {
		Admin a = new Admin();
		return a;
	}
	
	private User createTeacher() {
		Teacher t = new Teacher();
		return t;
}
	
	private User createStudent() {
		Student s = new Student();
		return s;
	}
	
	private User createManager() {
		Manager m = new Manager();
		return m;
	}
	
	private User createLibrarian() {
		Librarian l = new Librarian();
		return l;
	}
	
	private User createResearcher() {
		return null;
	}
	
	public void createUser() {
		gui();
		
		int action = 1;
		if(action == 0) return;
		System.out.println("Please, add following information:\n\tFirst Name\n\tLast Name\n\tGender\n\tBirth Date");
		User newUser;
		if(action <= 4) {
			newUser = createEmployee(action);
		}
		else if(action == 5) {
			newUser = createStudent();
		}
		else if(action == 6) {
			newUser = createResearcher();
		}
		
	}
}