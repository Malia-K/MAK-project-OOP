package Controller;

import Model.User;

public class UserControl{
 	
	private User user;
	
	
	public UserControl () {}
	public UserControl(User u) {
		this.user = u;
	}
	
     
    public User getUser() {
    	return this.user;
    
    }
     
     
    public void login() {
    	System.out.println("Enter your login: ");
    	
    	System.out.println("Enter your password: ");
    	String login = " ", password = " ";
    	
    	boolean isVerified = verify(login, password);
    	
    	if(isVerified) {
    		viewNews();
    		
    	}else {
    		System.out.println("Wrong login or password! Please try again.");
    		login();
    	}
     	
    }
    

     
    public void changePassword() {
    	System.out.println("Enter your current password: ");
    	
    	System.out.println("Enter your new password: ");
    	
     	
    }

    public boolean verify(String login, String password) {
        return true;
    }
     
    public void saveLogs() {}
     
     
    public void session() {
    	System.out.println("-".repeat(30));
    	System.out.println("  Welcome to MAK University!  ");
    	System.out.println("-".repeat(30));
     	login();
    }
     
     

   
    public void viewBooks() {
    	
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
     
     
     
