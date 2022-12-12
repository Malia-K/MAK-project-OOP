package Controller;
import java.io.*;

import Model.*;
public class testAdmin {
	public static void main(String[] args) throws Exception {
//		InputStreamReader r=new InputStreamReader(System.in);    
//	    BufferedReader br=new BufferedReader(r);            
//	    System.out.println("Enter your name");    
//	    String name=br.readLine();    
//	    System.out.println("Welcome "+name);  
//		Admin main = new Admin();
		
		
		ManageUsers m = new ManageUsers();
		
//		for(int i = 0; i < 5; i++) {
//			m.createUser();
//		}
		
//		System.out.println(Database.getUsers());
//		Database.databaseSave();
		for(User u: Database.getUsers()) {
			System.out.println(u.getPassword());
		}
	}
}
