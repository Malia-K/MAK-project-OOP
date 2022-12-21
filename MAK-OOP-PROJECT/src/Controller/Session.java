package Controller;

import java.io.*;

import Model.*;

public class Session {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public Session() {}
	
	public User verify(String login, String password) {   	
	    for(User u : Database.getUsers()) {
	   		if(u.getLogin().equals(login) && u.getPassword().equals(password)) {
	   			return u;
	   		}
	   	}
    return null;
   	}
	
	public UserControl login() throws IOException, InterruptedException {
	    System.out.print("Enter your login: ");
	   	String login = br.readLine();
	   	System.out.print("Enter your password: ");
	   	String password = br.readLine();
	
	   	User user = verify(login, password);
	   	UserControl control = createControl(user);
	    	
	    if(control == null) {
	   		String error = "";
    		error += Format.formatDiv("a" + "-".repeat(44) + "c" +"\n");
	    	error += Format.formatRow("| Wrong login or password! Please try again: |\n");
	    	error += Format.formatDiv("g" + "-".repeat(44) + "i" +"\n");
	   		System.err.println(error);
	    		
	   		Thread.sleep(100);
	   		login();
	   	}
	    
	    System.out.print(Format.formatDiv( "-".repeat(45) + '\n'));
   		System.out.println("        Welcome " + user.getFirstName() + " " + user.getLastName() + "!");
   		return control;
	}
	
	public static UserControl createControl(User user) {
		UserControl uc = null;
		if(user == null) return uc;
		else if(user instanceof Student) {
			uc = new StudentControl(user);
		}
		else if(user instanceof Admin) {
			uc = new AdminControl(user);
		}
		else if(user instanceof Manager) {
			uc = new ManagerControl(user);
		}
		else if(user instanceof Teacher) {
			uc = new TeacherControl(user);
		}
		else if(user instanceof Librarian) {
			uc = new LibrarianControl(user);
		}
		return uc;
	}
	
	public void session() throws IOException, InterruptedException {
		UserControl currentUser = login();
		
		currentUser.viewMainPage();
    }
}