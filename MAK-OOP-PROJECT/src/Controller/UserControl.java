package Controller;

import Model.*;


import java.io.*;
import java.time.LocalDateTime;
import java.util.Vector;
import java.util.stream.Collectors;


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
      
    public void changePassword() throws IOException, InterruptedException {
//    	System.out.println("   Enter your current password: ");
//    	
//    	System.out.println("   Enter your new password: ");     	
    }

    public User verify(String login, String password) {   	
    	for(User u : Database.getUsers()) {
    		if(u.getLogin().equals(login) && u.getPassword().equals(Integer.toString(User.hashCode(password)))) {
    			return u;
    		}
    	}
    	return null;
    }
     
    public void saveLogs() {}
    
    public void viewBooks() {
        for(Book b: Database.getLibrary()) {
          System.out.println(b);
        }
      }
      
    public void viewNews() throws IOException {
    	Vector <New> allNews = (Vector <New>) Database.getNews().stream().sorted().collect(Collectors.toCollection(Vector::new));
        int i = 0;
        boolean run = true;
        while(run) {
        	for(int j = 0; j < 5; j++) {
        		if(i < allNews.size()) {
        			System.out.println(allNews.get(i) + "\n");
        		}
        		else {
        			System.out.println("No more news\nPrint anything to go back");
        			break;
        		}
        		i++;
        	}
        	if(i < allNews.size()) System.out.println("\"n\" to watch next or \"b\" to go back");
        	String act = br.readLine();
        	if(i >= allNews.size() || act.equals("b")) {
        		run = false;
        	}
        }
        return;
    }
    
    public void operation() throws InterruptedException  {
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
			}
		} catch (IOException e) {
			System.out.println("Smth went wrong! Please, try again!");
			operation();
		}
    	return;
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
  	    if(user instanceof User) {
  	    	operation();
  	    }
//  	    viewMainPage();
  	  }
}
     
     
     