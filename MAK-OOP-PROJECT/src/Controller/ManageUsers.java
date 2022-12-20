package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

import Model.*;

public  class ManageUsers {
	protected Admin activeAdmin;
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public ManageUsers() {}
	
	public ManageUsers(Admin a) {
		activeAdmin = a;
	}

//	
//	private User createStudent() throws IOException {
//		Vector <String> arr = par(br.readLine());
//		if(!arr.isEmpty() && arr.size() == 3) {
//			Student s = new Student(arr.get(0), arr.get(1), arr.get(2));
//			return s;
//		}
//		return null;
//	}
//	
//	private User createManager() {
//		Manager m = new Manager();
//		return m;
//	}
//	
//	private User createLibrarian() {
//		Librarian l = new Librarian();
//		return l;
//	}
//	
//	private User createResearcher() {
//		return null;
//	}
//	
//	public void createUser() throws NumberFormatException, IOException {
//		gui();
//		
//		int action = Integer.parseInt(br.readLine());
//		if(action == 0) return;
//			System.out.println("Please, add following information:\n\tFirst Name\n\tLast Name\n\tGender\n\tBirth Date");
//			User newUser = new User();
//		if(action <= 4) {
//			newUser = createEmployee(action);
//		}
//		else if(action == 5) {
//			newUser = createStudent();
//		}
//		else if(action == 6) {
//			newUser = createResearcher();
//		}
//		if(newUser != null) 
//			Database.addUser(newUser);
//		
////		System.out.println(Database.getUsers());
//	}
}

