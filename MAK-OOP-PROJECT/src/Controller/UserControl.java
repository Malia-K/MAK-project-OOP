package Controller;

import Model.*;


import java.io.*;
import java.time.LocalDateTime;
import java.util.Vector;
import java.util.stream.Collectors;


public class UserControl{
	/*
	 * 
	 * Describes the functionality and actions of an ordinary user
	 * 
	 */
	private User user;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public UserControl () {}
	
	public UserControl(User u) {
		this.user = u;
	}
	
    public User getUser() {
    	return this.user;
    }
<<<<<<< HEAD
    
	private boolean goBack(String input) throws IOException {
		if(input.equals("0")) {
			return true;
		}
		return false;
	}
     
    public void login() throws IOException, InterruptedException {
//    	for(User a : Database.getInstance().getUsers()) {
//    		System.out.println(a.getLogin() + " " + a.getPassword());
//    	}
    	System.out.print("  Enter your login: ");
    	String login = br.readLine();
    	System.out.print("  Enter your password: ");
    	String password = br.readLine();
    	

    	
    	user = verify(login, password);
    	
    	if(user != null) {
    		System.out.print(formatDiv( "-".repeat(45) + '\n'));
    		System.out.println("        Welcome " + user.getFirstName() + " " + user.getLastName() + "!");
    		viewNews();
    		
    	}else{
    		String error = "";
    		error += formatDiv("a" + "-".repeat(44) + "c" +"\n");
    		error += formatRow("| Wrong login or password! Please try again: |\n");
    		error += formatDiv("g" + "-".repeat(44) + "i" +"\n");
    		System.err.println(error);
    		
    		Thread.sleep(100);
    		login();
    	}
     	
    }
=======
>>>>>>> branch 'newNewBranch' of https://github.com/Malia-K/MAK-project-OOP.git
    
    
      
    public void changePassword() throws IOException, InterruptedException {
    	System.out.println("   Enter your current password: ");
    	
    	System.out.println("   Enter your new password: ");     	
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
    
<<<<<<< HEAD
    
    
	/**
	* this is a method to execute users session in uni system
	*/
    public void session() throws IOException, InterruptedException {
    	ManagerControl mc = new ManagerControl();
    	mc.viewAllOrganizations();
//    	
//    	String header = "";
//    	
//    	header += formatDiv("a" + "-".repeat(43) + "c" +"\n");
//    	header += formatRow("|        Welcome to MAK University!         |\n");
//    	header += formatDiv("g" +"-".repeat(43) + "i"+ '\n');
//    	System.out.print(header);
//     	login();
    }
     
     

    public void viewRegisterPage() throws IOException {
    	System.out.println("\n Enter 'M' to jump to main page: ");
    	String command = br.readLine();
    	
	   	if(command.equals("m") || command.equals("M")) {
	   		while(true) {
	   			user.viewMainPage();
	   			
	   			
		   		System.out.print(" Enter the operation number:");
		   		int action = Integer.parseInt(br.readLine());
		   		if(action == 1) {
		   			this.viewNews();
		   		}else if(action == 2) {
		   			System.out.println(this);
		   		}else if(action == 3) {
		   			this.viewBooks();
		   		}
	   		}	
	    }

    }



=======
>>>>>>> branch 'newNewBranch' of https://github.com/Malia-K/MAK-project-OOP.git
    public void viewBooks() {
        for(Book b: Database.getLibrary()) {
          System.out.println(b);
        }
      }
      
    public void viewNews() throws IOException {
    	String header = "";
	        
    	header += Format.formatDiv("a" + "-".repeat(43) + "c" +"\n");
	    header += Format.formatRow("|" + " ".repeat(19) + "News" + " ".repeat(19) + " |\n");
	    header += Format.formatDiv("g" +"-".repeat(43) + "i"+ '\n');
	    System.out.print(header);
	
        for(New news: (Vector <New>) Database.getNews().stream().sorted().collect(Collectors.toCollection(Vector::new))) {
	      	System.out.println(news + "\n\n");
        }
    }
      
      public void viewMainPage() throws InterruptedException {
  	    String header = "";
  	    
  	    header += Format.formatDiv("a" + "-".repeat(43) + "c" +"\n");
  	    header += Format.formatRow("|"+ " ".repeat(16) +  "Menu:" + " ".repeat(22) + "|\n");
  	    header += Format.formatDiv("g" +"-".repeat(43) + "i"+ '\n');
  	    System.out.print(header);
  	    System.out.print(" 0. Log out"
  	    		   + " 1.  News \n"
  	               + " 2.  User's information \n"
  	               + " 3.  Library \n");
  	    try {
			int action = br.read();
			if(action == 0) {
				(new Session()).session();
				return;
			}
			else if(action == 1) {
				viewNews();
			}
			else if(action == 2) {
				System.out.println
			}
		} catch (IOException e) {
			System.out.println("Smth went wrong! Please, try again!");
			viewMainPage();
		}
  	  }
}
     
     
     
