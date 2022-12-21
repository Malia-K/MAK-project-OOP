package Controller;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Model.*;
import enums.Degree;
import enums.Faculty;
import enums.Gender;
import enums.ManagerType;
import enums.TeacherType;

public class AddUsers{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String s = new String();
	StringTokenizer st;
	Admin activeAdmin;
	
	public AddUsers() {}
	
	public AddUsers(Admin a) {
		activeAdmin = a;
	}
	
	private void gui() {
		for(int i = 0; i < 70; i++)  s += "_";
		
		System.out.println(s + "\nPlease, choose what kind of user you want to create:\n" + s + "\n\t0. Go back");
		System.out.println("\t1. Admin" + "\n\t2. Teacher" + "\n\t3. Manager" + "\n\t4. Librarian" + "\n\t5. Student\n" + s);
	}
	
	private boolean goBack(String input) throws IOException {
		if(input.equals("0")) {
			return true;
		}
		return false;
	}

	private User create(int act) throws IOException {
		System.out.println("Please, add following information in one line separated by space\n" + s 
				+ "\nCommon information:\n\tFirst Name\n\tLast Name\n\tGender: male/female\n\t"
				+ "Birth Date: YYYY-MM-DD\n\tPassword\n\tEnrolled: YYYY-MM-DD\n" + s);
		try {
			String input = br.readLine();
			if(goBack(input)) {
				createUser();
				return null;
			}
			st = new StringTokenizer(input, " ");
			String firstName = st.nextToken();
			String lastName = st.nextToken();
			Gender gender = Gender.valueOf(st.nextToken().toUpperCase());	
			String birthDate = st.nextToken();
			String password = st.nextToken();
			String enrolled = st.nextToken();
			
			if(!Format.checkDateFormat(birthDate) || !Format.checkDateFormat(enrolled)) {
				System.out.println("Date format is not correct, please, try again!");
				return create(act);
			}
			String login = "_" + firstName.toLowerCase().charAt(0) + "_" + lastName.toLowerCase();
			
			if(act <= 4) return createEmployee(act, firstName, lastName, gender, birthDate, password, enrolled, login);
			return createStudent(firstName, lastName, gender, birthDate, password, enrolled, login);
		}  catch(IllegalArgumentException iae) {
			System.out.println("Format is not the same! Please, try again");
		}catch(NoSuchElementException nsee) {
			System.out.println("You forgot some inputs! Please, try again!");
		}
		return create(act);
	}
	
	private User createEmployee(int n, String firstName, String lastName, Gender gender, String birthDate, String password, String enrolled, String login) throws IOException {
		System.out.println("\nEmployee information:\n\tExperience\n" + s);
		try {
			int experience = Integer.parseInt(br.readLine());
			if(n == 1) return createAdmin(firstName, lastName, gender, birthDate, password, enrolled, experience, login);
			if(n == 2) return createTeacher(firstName, lastName, gender, birthDate, password, enrolled, experience, login);	
			if(n == 3) return createManager(firstName, lastName, gender, birthDate, password, enrolled, experience, login);
			return createLibrarian(firstName, lastName, gender, birthDate, password, enrolled, experience, login);
		}
		catch(NumberFormatException nfe) {
			System.out.println("format is incorrect");
		}
		
		return createEmployee(n, firstName, lastName, gender, birthDate, password, enrolled, login);
	}
	
	private User createAdmin(String firstName, String lastName, Gender gender, String birthDate, String password, String enrolled, int experience, String login) throws IOException {
		return (new Admin(firstName, lastName, gender, birthDate, password, enrolled, login, experience));
	}
	
	private User createTeacher(String firstName, String lastName, Gender gender, String birthDate, String password, String enrolled, int experience, String login) throws IOException {
		System.out.println("\nStudent information:\n\tFaculty: FIT, KBS, FGE, KMA, SECAEN, SCE, RECMC, ISE, DEF, FEOGI\n\tTeacher Type: tutor, lector, senior_lector, professor\n" + s);
		try {
			st = new StringTokenizer(br.readLine(), " ");
			String faculty = st.nextToken();
			String teacherType = st.nextToken();
			
			return new Teacher(firstName, lastName, gender, birthDate, password, enrolled, login, experience, Faculty.valueOf(faculty.toUpperCase()), TeacherType.valueOf(teacherType.toUpperCase()));	
		}
		catch(IllegalArgumentException iae) {
			System.out.println("Format is not the same! Please, try again");
			}
		catch(NoSuchElementException nsee) {
			System.out.println("You forgot some inputs! Please, try again!");
		} 
		
		return createTeacher(firstName, lastName, gender, birthDate, password, enrolled, experience, login);	
	}
	
	private User createStudent(String firstName, String lastName, Gender gender, String birthDate, String password, String enrolled, String login) throws IOException {
		System.out.println("\nStudent information:\n\tFaculty: FIT, KBS, FGE, KMA, SECAEN, SCE, RECMC, ISE, DEF, FEOGI\n\tDegree: BACHELOR/MASTER/PHD\n\tYear of study\n" + s);
		try {
			st = new StringTokenizer(br.readLine(), " ");
			String faculty = st.nextToken();
			String degree = st.nextToken();
			int yearOfStudy = Integer.parseInt(st.nextToken());
			
			return new Student(firstName, lastName, gender, birthDate, password, enrolled, login, Faculty.valueOf(faculty.toUpperCase()), Degree.valueOf(degree.toUpperCase()), yearOfStudy);	
		}
		catch(NumberFormatException nfe) {
			System.out.println("Not an integer! Please, try again");
		}
		catch(IllegalArgumentException iae) {
			System.out.println("Format is not the same! Please, try again");
			}
		catch(NoSuchElementException nsee) {
			System.out.println("You forgot some inputs! Please, try again!");
			}
		return createStudent(firstName, lastName, gender, birthDate, password, enrolled, login);
	}
	
	private User createManager(String firstName, String lastName, Gender gender, String birthDate, String password, String enrolled, int experience, String login) throws IOException {
		System.out.println("Manager information:\n" + s + "\n\tChoose manager's type:\n"
				+"\tRector\n\tDeputy_Rector\n\tOR\n\tDean\n\tDeputy_Dean\n" + s);
		try {
			String type = br.readLine();
			return (new Manager(firstName, lastName, gender, birthDate, password, enrolled, login, experience, ManagerType.valueOf(type.toUpperCase())));
		}
		catch(IllegalArgumentException iae) {
			System.out.println("You forgot some inputs! Please, try again!");
		}
		return createManager(firstName, lastName, gender, birthDate, password, enrolled, experience, login);
	}
	
	private User createLibrarian(String firstName, String lastName, Gender gender, String birthDate, String password, String enrolled, int experience, String login) {
		return (new Librarian(firstName, lastName, gender, birthDate, password, enrolled, login, experience));
	}
	
	private User createResearcher() {
		return null;
	}
	
	public void createUser() throws NumberFormatException, IOException {
		gui();
		try{
			int action = Integer.parseInt(br.readLine());
			if(action == 0) {
				new AdminControl(activeAdmin).manageUsers();
				return;
			}
			if(action < 0 || action > 5) {
				System.err.println("Sorry, this option doesn't exist\nPlease, try again!");
				createUser();
				return;
			}
			User newUser = create(action);
			if(newUser != null && !Database.getUsers().contains(newUser)) {
				Database.addUser(newUser);
			}
		} catch (NumberFormatException nfe) {
			System.err.println("Invalid input, please, try again!");
			createUser();
		}
	}
}