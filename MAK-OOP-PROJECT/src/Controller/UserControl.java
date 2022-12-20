package Controller;

import Model.*;


import java.io.*;
import java.time.LocalDateTime;


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
    

     
    public void changePassword() throws IOException, InterruptedException {
    	System.out.println("   Enter your current password: ");
    	
    	System.out.println("   Enter your new password: ");
    	
    	login();
    	
     	
    }

    public User verify(String login, String password) {   	
    	for(User u : Database.getInstance().getUsers()) {
    		if(u.getLogin().equals(login) && u.getPassword().equals(password)) {
    			return u;
    		}
    	}
    	return null;
    }
     
    public void saveLogs() {}
    
    
    
	/**
	* this is a method to execute users session in uni system
	*/
    public void session() throws IOException, InterruptedException {
//    	ManagerControl mc = new ManagerControl();
//    	
//    	mc.viewAllTeachers();
    	
    	String header = "";
    	
    	header += formatDiv("a" + "-".repeat(43) + "c" +"\n");
    	header += formatRow("|        Welcome to MAK University!         |\n");
    	header += formatDiv("g" +"-".repeat(43) + "i"+ '\n');
    	System.out.print(header);
     	login();
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



    public void viewBooks() {
        for(Book b: Database.getInstance().getLibrary()) {
          System.out.println(b);
        }
      }
      
      public void viewNews() throws IOException {
        String header = "";
        
        header += formatDiv("a" + "-".repeat(43) + "c" +"\n");
        header += formatRow("|" + " ".repeat(19) + "News" + " ".repeat(19) + " |\n");
        header += formatDiv("g" +"-".repeat(43) + "i"+ '\n');
        System.out.print(header);



       try {
	       for(New nw : Database.getInstance().getNews()) {
	    	   nw.printNew();
	       }
       } catch(NullPointerException npe) {
    	   System.out.println("  No news yet..");
       }
        
        
        viewRegisterPage();
      }
      
      public static String formatRow(String str){
          return str.replace('|', '\u2502');
      }
      
      public static String formatDiv(String str){
          return str.replace('a', '\u250c')
                  .replace('b', '\u252c')
                  .replace('c', '\u2510')
                  .replace('d', '\u251c')
                  .replace('e', '\u253c')
                  .replace('f', '\u2524')
                  .replace('g', '\u2514')
                  .replace('h', '\u2534')
                  .replace('i', '\u2518')
                  .replace('-', '\u2500');
      }

}
     
     
     
