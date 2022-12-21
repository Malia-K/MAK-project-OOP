package Model;

import java.io.*;
import java.util.Vector;

/**
	 * 
	 * The class contains all the data used in the system
	 * 
	 */
public final class Database implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private static Database instance;
	
	private Vector <User> users;
    private Vector <Book> library;
    private Vector <Course> courses;
    private Vector <Organization> organizations;
    private Vector <String> logs;
    private Vector <Report> reports;
    private Vector <New> news;
    private Vector <Message> messages;
    private Vector <OpenCourse> openCourses;
    
    static {
    	if(new File(Connect.getInstance().getPath()).exists()) {
    		try {
				instance = readDatabase();
			} catch (Exception e) {
				e.printStackTrace();
			}
    	} else instance = new Database();
    }
    
    {
    	users = new Vector <User>();
    	library = new Vector <Book>();
    	courses = new Vector <Course>();
    	organizations = new Vector <Organization>();
    	logs = new Vector <String>();
    	reports = new Vector <Report>();
    	news = new Vector<New>();
    	messages = new Vector<Message>();
    	openCourses = new Vector <OpenCourse>();
    }
    
    private Database() {}
    
    
 /**
	  * 
	  * returns instance of class Database
	  * 
	  */
    public static Database getInstance() {
    	return instance;
    }
    
/**
	 * 
	 * returns vector of all users
	 * 
	 */
    public static Vector <User> getUsers(){
    	return instance.users;
    }
    
/**
	 * 
	 * returns vector of all students
	 * 
	 */
    public static Vector <Student> getStudents() {
    	Vector <Student> students = new Vector <Student>();
    	for(User u: instance.users) {
    		if(u instanceof Student) {
    			Student s = (Student) u;
    			students.add(s);
    		}
    	}
    	return students;
    }
    
  /**
	   * 
	   * returns vector of all admins
	   * 
	   */
    public static Vector <Admin> getAdmins(){
    	Vector <Admin> admins = new Vector <Admin>();
    	for(User u: instance.users) {
    		if(u instanceof Admin) {
    			Admin a = (Admin) u;
    			admins.add(a);
    		}
    	}
    	return admins;
    }
    
/**
	 * 
	 * returns vector of all librarians
	 * 
	 */
    public static Vector <Librarian> getLibrarians(){
    	Vector <Librarian> librarians = new Vector <Librarian>();
    	for(User u: instance.users) {
    		if(u instanceof Librarian) {
    			Librarian l = (Librarian) u;
    			librarians.add(l);
    		}
    	}
    	return librarians;
    }
      
    
/**
	 * 
	 * returns vector of all managers
	 * 
	 */
    public static Vector <Manager> getManagers(){
    	Vector <Manager> managers = new Vector <Manager>();
    	for(User u: instance.users) {
    		if(u instanceof Manager) {
    			Manager m = (Manager) u;
    			managers.add(m);
    		}
    	}
    	return managers;
    }
    
    
/**
	 * 
	 * returns vector of all teachers
	 * 
	 */
    public static Vector <Teacher> getTeachers(){
    	Vector <Teacher> teachers = new Vector <Teacher>();
    	for(User u: instance.users) {
    		if(u instanceof Teacher) {
    			Teacher t = (Teacher) u;
    			teachers.add(t);
    		}
    	}
    	return teachers;
    }

/**
	 * 
	 * returns vector of all books
	 * 
	 */
	public static Vector<Book> getLibrary() {
		return instance.library;
	}

/**
	 * 
	 * returns vector of all courses
	 * 
	 */
	public static Vector<Course> getCourses() {
		return instance.courses;
	}
	
/**
	 * 
	 * returns vector of all organizations
	 * 
	 */
	public static Vector<Organization> getOrganizations() {
		return instance.organizations;
	}

/**
	 * 
	 * returns vector of all logs
	 * 
	 */
	public static Vector<String> getLogs() {
		return instance.logs;
	}
	
/**
	 * 
	 * returns vector of all reports
	 * 
	 */
	public static Vector<Report> getReports() {
		return instance.reports;
	}

/**
	 * 
	 * returns vector of all news
	 * 
	 */
	public static Vector <New> getNews() {
		return instance.news;
	}
	
/**
	 * 
	 * returns vector of all messages
	 * 
	 */
	public static Vector <Message> getMessages() {
		return instance.messages;
	}
	
/**
	 * 
	 * returns vector of all open courses
	 * 
	 */
	public static Vector <OpenCourse> getOpenCourses() {
		return instance.openCourses;
	}
	
/**
	 * 
	 * adds news to database
	 * 
	 */
	public static void addNews(New n) {
		getInstance().news.add(n);
	}
	
/**
	 * 
	 * add user to database
	 * 
	 */
    public static void addUser(User u) {
    	getInstance().users.add(u);
    }

/**
	 * 
	 * method that saves database instance to the file
	 * @throws IOException
	 */
    public static void databaseSave() throws IOException {
    	FileOutputStream fos = new FileOutputStream(Connect.getInstance().getPath());
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(instance);
		
		fos.close();
		oos.close();
    }
    
    
/**
	 * 
	 * reads saved data from the file and returns it to database
	 * @throws Exception
	 */
    public static Database readDatabase() throws Exception{
		FileInputStream fis = new FileInputStream(Connect.getInstance().getPath());
		ObjectInputStream ois = new ObjectInputStream(fis);
		return (Database)ois.readObject();
	}
}
