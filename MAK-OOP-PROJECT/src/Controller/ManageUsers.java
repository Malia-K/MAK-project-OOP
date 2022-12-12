package Controller;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;

import Model.*;

public class ManageUsers {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
	

	
	private Vector <String> par(String param) throws IOException {
		StringTokenizer st = new StringTokenizer(param," "); 
		Vector <String> arr = new Vector <String>();
		while(st.hasMoreTokens())
			arr.add(st.nextToken());
		return arr;
	}
	
	private User createAdmin() throws IOException {
		Vector <String> arr = par(br.readLine());
		if(!arr.isEmpty() && arr.size() == 3) {
			Admin a = new Admin(arr.get(0), arr.get(1), arr.get(2));
			return a;
		}
		return null;
	}
	
	private User createEmployee(int n) throws IOException {
		System.out.println("\tExperience");
		if(n == 1) return createAdmin();
		if(n == 2) return createTeacher();
		if(n == 3) return createManager();
		return createLibrarian();
	}
	
	private User createTeacher() {
		Teacher t = new Teacher();
		return t;
}
	
	private User createStudent() throws IOException {
		Vector <String> arr = par(br.readLine());
		if(!arr.isEmpty() && arr.size() == 3) {
			Student s = new Student(arr.get(0), arr.get(1), arr.get(2));
			return s;
		}
		return null;
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
	
	public void createUser() throws NumberFormatException, IOException {
		gui();
		
		int action = Integer.parseInt(br.readLine());
		if(action == 0) return;
		System.out.println("Please, add following information:\n\tFirst Name\n\tLast Name\n\tGender\n\tBirth Date");
		User newUser = new User();
		if(action <= 4) {
			newUser = createEmployee(action);
		}
		else if(action == 5) {
			newUser = createStudent();
		}
		else if(action == 6) {
			newUser = createResearcher();
		}
		if(newUser != null) Database.addUser(newUser);
//		System.out.println(Database.getUsers());
	}
}