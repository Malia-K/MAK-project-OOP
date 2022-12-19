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
		
		AddUsers m = new AddUsers();
		int num = 10;
//		String formatted = String.format("%04d", num);
//		System.out.println(formatted);
		
		User k = new User("Karina", "Zhykbayeva", Gender.FEMALE, "2004-06-17", "abcd", "2021-09-01", "S", "S_Karina_Zhykbayeva");
		
		System.out.println(k.getId());
		
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
		
		AdminControl ac = new AdminControl();
//		for(int i = 0; i < 10; i++) {
//			ac.manageUsers();
//		}
//		ac.manageUsers();
		
//		LocalDate d = LocalDate.of(2022, 12, 12);
//		System.out.println(d.getYear() % 100);
//		Collections.sort(Database.getInstance().getUsers());
//		Database.databaseSave();
		for(User u: Database.getInstance().getUsers()) {
			System.out.println(u + "\n");
		}
	}
}
