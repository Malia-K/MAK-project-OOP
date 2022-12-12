package Model;

import java.util.Vector;

public class Database {
	static private Vector <User> users;
    static private Vector <Book> library;
    static private Vector <Course> courses;
    static private Vector <Organization> organizations;
    static private Vector <String> logs;
    static private Vector <Report> reports;
   
    
    static{
      users = new Vector <User>();
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
}