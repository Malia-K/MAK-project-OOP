package Controller;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.Vector;

import Model.*;
import enums.Gender;
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
		
		User k = new User("Karina", "Zhykbayeva", Gender.FEMALE, "2004-06-17", "abcd", "2021-09-01", "S", "S_Karina_Zhykbayeva");
		
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
		Employee send = new Employee("Trustworth", "Gay", Gender.MALE, "2000-10-10", "", "2020-08-12", "", "", 2);
		Employee get = new Employee("Pakita", "Shamoi", Gender.FEMALE, "1986-08-12", "", "2007-08-12", "", "", 12);
		
		Message me = new Message(send, "One more strange text that i would like to write since you haven't answered for previous one. I now it may be strange and yet i won't give up and keep going to write you until i get proper answer", get);
		
		me.setTopic("You will like it maybe or not well at least i tries");
		
		System.out.println(me);
		
		
		AdminControl ac = new AdminControl();
//		for(int i = 0; i < 10; i++) {
//			ac.manageUsers();
//		}
//		ac.manageUsers();
		
//		LocalDate d = LocalDate.of(2022, 12, 12);
//		System.out.println(d.getYear() % 100);
//		Collections.sort(Database.getInstance().getUsers());
//		Database.databaseSave();
//		for(User u: Database.getInstance().getUsers()) {
//			System.out.println(u + "\n");
//		}
	}
}
