package Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;

public class Database implements Serializable{
	private static final long serialVersionUID = 1L;
	static private Vector <User> users;
    static private Vector <Book> library;
    static private Vector <Course> courses;
    static private Vector <Organization> organizations;
    static private Vector <String> logs;
    static private Vector <Report> reports;
   
    
    static{
    	if(new File("database.ser").exists()) {
    		try {
    			users = readDatabase();
    		} catch (Exception e) {
				e.printStackTrace();
    		}
    	}
    	else users = new Vector <User>();
      library = new Vector <Book>();
      courses = new Vector <Course>();
      organizations = new Vector <Organization>();
      logs = new Vector <String>();
      reports = new Vector <Report>();
      
    }
    
    public Database() {}
    
    public static Vector <User> getUsers(){
      return users;
    }
    
    public static Vector <Student> getStudents() {
      Vector <Student> students = new Vector <Student>();
      for(User u: users) {
        if(u instanceof Student) {
          Student s = (Student) u;
          students.add(s);
        }
      }
      return students;
    }
    
    public static Vector <Employee> getEmployees(){
      Vector <Employee> employees = new Vector <Employee>();
      for(User u: users) {
        if(u instanceof Employee) {
          Employee e = (Employee) u;
          employees.add(e);
        }
      }
      return employees;
    }
    
    public static Vector <Admin> getAdmins(){
      Vector <Admin> admins = new Vector <Admin>();
      for(User u: users) {
        if(u instanceof Admin) {
          Admin a = (Admin) u;
          admins.add(a);
        }
      }
      return admins;
    }
    
    public static Vector <Librarian> getLibrarians(){
      Vector <Librarian> librarians = new Vector <Librarian>();
      for(User u: users) {
        if(u instanceof Librarian) {
          Librarian l = (Librarian) u;
          librarians.add(l);
        }
      }
      return librarians;
    }
      
    public static Vector <Manager> getManagers(){
      Vector <Manager> managers = new Vector <Manager>();
      for(User u: users) {
        if(u instanceof Manager) {
          Manager m = (Manager) u;
          managers.add(m);
        }
      }
      return managers;
    }
    
    public static Vector <Teacher> getTeachers(){
      Vector <Teacher> teachers = new Vector <Teacher>();
      for(User u: users) {
        if(u instanceof Teacher) {
          Teacher t = (Teacher) u;
          teachers.add(t);
        }
      }
      return teachers;
    }

    public static void addUser(User u) {
    	users.add(u);
    }
    
    public static void databaseSave() throws IOException {
    	FileOutputStream fos = new FileOutputStream("C:\\Users\\Karina\\OOP\\MAK-project-OOP\\MAK-OOP-PROJECT\\src\\Model\\text.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(users);
		
		fos.close();
		oos.close();
    }
    
    static Vector<User> readDatabase() throws Exception{
		FileInputStream fis = new FileInputStream("C:\\Users\\Karina\\OOP\\MAK-project-OOP\\MAK-OOP-PROJECT\\src\\Model\\text.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		Vector<User> database = (Vector<User>)ois.readObject();
		fis.close();
		ois.close();
		return database;
	}
}