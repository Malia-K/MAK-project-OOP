package Controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.Date;
import java.util.Vector;

import Model.*;
import enums.Faculty;
import enums.Gender;
import enums.Semester;
import enums.TeacherType;
public class testAdmin {
	public static void main(String[] args) throws Exception {
//		InputStreamReader r=new InputStreamReader(System.in);    
////	    BufferedReader br=new BufferedReader(r);            
////	    System.out.println("Enter your name");    
////	    String name=br.readLine();    
////	    System.out.println("Welcome "+name);  
////		Admin main = new Admin();
//		
////		AddUsers m = new AddUsers();
//		int num = 10;
////		String formatted = String.format("%04d", num);
////		System.out.println(formatted);
//		
////		User k = new User("Karina", "Zhykbayeva", Gender.FEMALE, "2004-06-17", "abcd", "2021-09-01", "S", "S_Karina_Zhykbayeva");
////		
////		Database.getInstance();
////		System.out.println(k.getId());
//		
////		System.out.println(k.compareTo(Database.getInstance().getUsers().get(0)));
////		System.out.println(Database.getInstance().getUsers().get(0));
//		
////		for(User u: v) {
////			System.out.println(u);
////		}
////		System.out.println(Database.getInstance().getUsers());
//////		Database.readDatabase();
////		for(int i = 0; i < 1; i++) {
////			m.createUser();
////		}
//////		//		
//////		System.out.println(Database.getUsers());
////		Database.getInstance().getLogs().add("User added");5
////		Database.getInstance().databaseSave();
////		Database.getInstance().readDatabase();
////		
////		System.out.println(LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES).toString().replace('T', ' '));
////		System.out.println("=".repeat(10) + " ".repeat(4) + "some new title" + " ".repeat(4) + "=".repeat(10) + "\n" + Format.formatRow("|\n"));
////		while(!Database.getInstance().getUsers().isEmpty()) {
////			Database.getInstance().getUsers().remove(0);
////			Database.databaseSave();
////		}
//		Employee send = new Employee("Trustworth", "Gay", Gender.MALE, "2000-10-10", "", "2020-08-12", "", "", 2);
//		Employee get = new Employee("Pakita", "Shamoi", Gender.FEMALE, "1986-08-12", "", "2007-08-12", "", "", 12);
//		
//		Message me = new Message(send, "One more strange text that i would like to write since you haven't answered for previous one. I now it may be strange and yet i won't give up and keep going to write you until i get proper answer", get);
//		Database.getInstance().set();
//		Database.getInstance().getMessages().add(me);
//		Database.databaseSave();		me.setTopic("You will like it maybe or not well at least i tries");


//		
//		User u1 = send;
//		User u2 = (User) u1.clone();
//		
//		u2.setBirthDate("2022-08-12");
//		
//		System.out.println(u1.getBirthDate() + " " + u2.getBirthDate());
////		Message me = new Message(send, "One more strange text that i would like to write since you haven't answered for previous one. I now it may be strange and yet i won't give up and keep going to write you until i get proper answer", get);
////		Database.getInstance().set();
////		Database.getInstance().getMessages().add(me);
////		Database.databaseSave();
////		me.setTopic("You will like it maybe or not well at least i tries");
////		
////		System.out.println(me);
//		
////		Database.getInstance().addUser(get);
////		Database.getInstance().addUser(send);
////		Database.databaseSave();
////		AdminControl ac = new AdminControl();
////		for(int i = 0; i < 10; i++) {
////			ac.manageUsers();
////		}
////		ac.manageUsers();
////		Database.getInstance().getOpenCourses().clear();
//////		
////		Course c1 = new Course("s", "s", 2, Faculty.DEF, "2/1");
////		Course c2 = new Course("sr", "s", 2, Faculty.DEF, "2/2");
////		Course c3 = new Course("skl", "ssd", 3, Faculty.DEF, "2/1");
////		
////		c2.addPrerequisite(c1);
////		Course c4 = (Course) c2.clone();
////		c4.addPrerequisite(c3);
////		
////		System.out.println(c2 + " " + c4);
////		Teacher t = new Teacher("asd", "fsdf", Gender.FEMALE, "2222-12-31", "sda", "2222-10-12", "", 5, Faculty.DEF, TeacherType.LECTOR);
////		
////		StudyPeriod p = new StudyPeriod();
////		OpenCourse oc1 = new OpenCourse(c1, p);
////		oc1.addTeacher(t);
////		OpenCourse oc2 = new OpenCourse(c2, p);
////		OpenCourse oc3 = new OpenCourse(c3, p);
////		
////		oc3.addTeacher(t);
////		
////		Vector <Course> c = new Vector<Course>();
////		for(int i = 0; i < 5; i++) {
////			c.add(new Course());
////		}
//		
////		c.get(0).setId("hebv");
////		c.get(1).setId("2nhebv");
////		c.get(2).setId("asvhebv");
////		c.get(3).setId("fbhebv");
////		c.get(4).setId("v");
//////		
////		Collections.sort(c);
////		for(Course co: c) {
////			System.out.println(co.getId());
////		}
////		Database.getInstance().getOpenCourses().add(oc1);
////		Database.databaseSave();
////		Database.getInstance().getOpenCourses().add(oc2);
////		Database.databaseSave();
////		Database.getInstance().getOpenCourses().add(oc3);
////		Database.databaseSave();
////		System.out.println("oello".compareTo("o"));
////		System.out.println(Database.getInstance().getOpenCourses());
////		
////		System.out.println(t.getCourses());
//		
////		New news = new New("one more big title to check if it's okay gjbn vjser klse buh", new User(), "hello everyone today we are gonna try to make it all in time even though we don't have enough time to make it all woooooork let's see what we will get after all hello miras how you doing ");
////		StudyPeriod s = new StudyPeriod();
////		StudyPeriod s1 = (StudyPeriod) s.clone();
////		
////		s.setSemester(Semester.SPRING);
////		s1.setYear(2021);
////		
////		System.out.println(s + " " + s1);
//		
////		System.out.println(new StudyPeriod());
////		LocalDate d = LocalDate.of(2022, 12, 12);
////		System.out.println(d.getYear() % 100);
////		Collections.sort(Database.getInstance().getUsers());
////		Database.databaseSave();
////		for(Message u: Database.getInstance().getMessages()) {
////			System.out.println(u + "\n");
////		}
//		Database.getMessages().clear();
//		Employee e1 = new Employee("d", "d", Gender.FEMALE, "2000-01-01", "dfsd",  "2000-01-01", "dfs", "fdfs", 5);
//		Employee e2 = new Employee("as", "gs", Gender.FEMALE, "2000-01-01", "dfsd",  "2000-01-01", "dfs", "fdfs", 5);
//		Employee e3 = new Employee("bdfbv", "df", Gender.MALE, "2000-01-01", "dfsd",  "2010-01-01", "dfs", "fdfs", 3);
//		
//		Database.getEmployees().add(e3);
//		Database.getEmployees().add(e2);
//		Database.getEmployees().add(e1);
//		
//		
//		Message m1 = new Message(e1, "dfsdf", e2);
//		Message m2 = new Message(e1, "cgha", e3);
//		Message m3 = new Message(e1, "dfnjka", e3);
//		Message m4 = new Message(e2, "bsjeknsha", e3);
//		
//		Database.getMessages().add(m4);
//
//		Database.getMessages().add(m1);
//
//		Database.getMessages().add(m2);
//
//		Database.getMessages().add(m3);
//		
//
////		Database.databaseSave();
//		
//		MessageControl mc = new MessageControl(e1);
//		
//		mc.viewChats();
//		
//		EmployeeControl ec = new EmployeeControl(e1);
//		
////		ec.viewMessage();
		AdminControl ac = new AdminControl();
		ac.manageUsers();
		System.out.println(Database.getUsers());
		(new Session()).session();
	}
}
