package Controller;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.Vector;

import Model.*;
import enums.Faculty;
import enums.Gender;
import enums.TeacherType;
public class testAdmin {
	public static void main(String[] args) throws Exception {
//		InputStreamReader r=new InputStreamReader(System.in);    
//	    BufferedReader br=new BufferedReader(r);            
//	    System.out.println("Enter your name");    
//	    String name=br.readLine();    
//	    System.out.println("Welcome "+name);  
//		Admin main = new Admin();
		
//		AddUsers m = new AddUsers();
		int num = 10;
//		String formatted = String.format("%04d", num);
//		System.out.println(formatted);
		
//		User k = new User("Karina", "Zhykbayeva", Gender.FEMALE, "2004-06-17", "abcd", "2021-09-01", "S", "S_Karina_Zhykbayeva");
//		
//		Database.getInstance();
//		System.out.println(k.getId());
		
//		System.out.println(k.compareTo(Database.getInstance().getUsers().get(0)));
//		System.out.println(Database.getInstance().getUsers().get(0));
		
//		for(User u: v) {
//			System.out.println(u);
//		}
//		System.out.println(Database.getInstance().getUsers());
////		Database.readDatabase();
//		for(int i = 0; i < 1; i++) {
//			m.createUser();
//		}
////		//		
////		System.out.println(Database.getUsers());
//		Database.getInstance().getLogs().add("User added");5
//		Database.getInstance().databaseSave();
//		Database.getInstance().readDatabase();
//		
//		while(!Database.getInstance().getUsers().isEmpty()) {
//			Database.getInstance().getUsers().remove(0);
//			Database.databaseSave();
//		}
//		Employee send = new Employee("Trustworth", "Gay", Gender.MALE, "2000-10-10", "", "2020-08-12", "", "", 2);
//		Employee get = new Employee("Pakita", "Shamoi", Gender.FEMALE, "1986-08-12", "", "2007-08-12", "", "", 12);
//		
//		Message me = new Message(send, "One more strange text that i would like to write since you haven't answered for previous one. I now it may be strange and yet i won't give up and keep going to write you until i get proper answer", get);
//		Database.getInstance().set();
//		Database.getInstance().getMessages().add(me);
		Database.databaseSave();
//		me.setTopic("You will like it maybe or not well at least i tries");
//		
//		System.out.println(me);
		
//		Database.getInstance().addUser(get);
//		Database.getInstance().addUser(send);
//		Database.databaseSave();
//		AdminControl ac = new AdminControl();
//		for(int i = 0; i < 10; i++) {
//			ac.manageUsers();
//		}
//		ac.manageUsers();
		Database.getInstance().getOpenCourses().clear();
//		
		Course c1 = new Course("s", "s", 2, Faculty.DEF, "2/1");
		Course c2 = new Course("sr", "s", 2, Faculty.DEF, "2/2");
		Course c3 = new Course("s", "ssd", 3, Faculty.DEF, "2/1");
		
		Teacher t = new Teacher("asd", "fsdf", Gender.FEMALE, "2222-12-31", "sda", "2222-10-12", "", 5, Faculty.DEF, TeacherType.LECTOR);
		
		StudyPeriod p = new StudyPeriod();
		OpenCourse oc1 = new OpenCourse(c1, p);
		oc1.addTeacher(t);
		OpenCourse oc2 = new OpenCourse(c2, p);
		OpenCourse oc3 = new OpenCourse(c3, p);
		
		oc3.addTeacher(t);
		
		Database.getInstance().getOpenCourses().add(oc1);
		Database.databaseSave();
		Database.getInstance().getOpenCourses().add(oc2);
		Database.databaseSave();
		Database.getInstance().getOpenCourses().add(oc3);
		Database.databaseSave();
		
//		System.out.println(Database.getInstance().getOpenCourses());
//		
		System.out.println(t.getCourses());
		
//		LocalDate d = LocalDate.of(2022, 12, 12);
//		System.out.println(d.getYear() % 100);
//		Collections.sort(Database.getInstance().getUsers());
//		Database.databaseSave();
//		for(Message u: Database.getInstance().getMessages()) {
//			System.out.println(u + "\n");
//		}
	}
}
