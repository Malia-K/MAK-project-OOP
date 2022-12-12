package Controller;

import Model.*;

import java.io.*;
import java.util.StringTokenizer;

public class UserControl{
	private User user;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public UserControl () {}
	
	public UserControl(User u) {
		this.user = u;
	}
	
     
    public User getUser() {
    	return this.user;
    }
     
     
    public void login() throws IOException {
    	System.out.print("Enter your login: ");
    	String login = br.readLine();
    	System.out.print("Enter your password: ");
    	String password = br.readLine();
    	if(login.equals("Admin123") && password.equals("Admin123")) {
        	System.out.println("\n" + "-".repeat(30));
    		System.out.println("Welcome to Admin Page!");
        	System.out.println("-".repeat(30));
    		ManageUsers m = new ManageUsers();
    		m.createUser();
    	}
    	
    	user = verify(login, password);
    	
    	if(user != null) {
    		System.out.println("Welcome " + user.getFirstName() + " " + user.getLastName());
    		viewNews();
    		
    	}else {
    		System.out.println("Wrong login or password! Please try again.");
    		login();
    	}
     	
    }
    

     
    public void changePassword() throws IOException {
    	System.out.println("Enter your current password: ");
    	
    	System.out.println("Enter your new password: ");
    	
    	login();
    	
     	
    }

    public User verify(String login, String password) {   	
    	for(User u : Database.getUsers()) {
    		if(u.getLogin().equals(login) && u.getPassword().equals(password)) {
    			return u;
    		}
    	}
    	return null;
    }
     
    public void saveLogs() {}
     
     
    public void session() throws IOException {
    	System.out.println("-".repeat(30));
    	System.out.println("  Welcome to MAK University!  ");
    	System.out.println("-".repeat(30));
     	login();
    }
     
     

   
    public void viewBooks() {
    	for(Model.Book b: Model.Database.getLibrary()) {
    		System.out.println(b);
    	}
    }
    
    public void viewNews() {
    	System.out.println("-".repeat(30));
    	System.out.println("             News             ");
    	System.out.println("-".repeat(30));
    	System.out.println("-some interesting news-");
    }
 
    public void viewRegisterPage() {
    	System.out.println("\n Enter 'M' to jump to main page: ");
    	String command = "m";
    	
	   	if(command.equals("m") || command.equals("M")) {
	    		viewMainPage();
	    }
    }
 

    public void viewMainPage() {
    	System.out.println("Operations: ");
    	System.out.println("1. News \n"
    					 + "2. User's information \n"
    					 + "3. Library \n ");

    }
    
}
     
     
     
