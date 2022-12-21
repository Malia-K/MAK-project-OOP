package Model;

import java.io.*;
import java.util.Vector;

/**
	 * 
	 * The class contains all the data used in the system.
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
	  * Returns instance of class Database.
	  * 
	  */
    public static Database getInstance() {
    	return instance;
    }
    
/**
	 * 
	 * Returns vector of all users.
	 * 
	 */
    public static Vector <User> getUsers(){
    	return instance.users;
    }
    
/**
	 * 
	 * Returns vector of all students.
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
	   * Returns vector of all admins.
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
	 * Returns vector of all librarians.
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
	 * Returns vector of all managers.
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
	 * Returns vector of all teachers.
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
	 * Returns vector of all books.
	 * 
	 */
	public static Vector<Book> getLibrary() {
		return instance.library;
	}

/**
	 * 
	 * Returns vector of all courses.
	 * 
	 */
	public static Vector<Course> getCourses() {
		return instance.courses;
	}
	
/**
	 * 
	 * Returns vector of all organizations.
	 * 
	 */
	public static Vector<Organization> getOrganizations() {
		return instance.organizations;
	}

/**
	 * 
	 * Returns vector of all logs.
	 * 
	 */
	public static Vector<String> getLogs() {
		return instance.logs;
	}
	
/**
	 * 
	 * Returns vector of all reports.
	 * 
	 */
	public static Vector<Report> getReports() {
		return instance.reports;
	}

/**
	 * 
	 * Returns vector of all news.
	 * 
	 */
	public static Vector <New> getNews() {
		return instance.news;
	}
	
/**
	 * 
	 * Returns vector of all messages.
	 * 
	 */
	public static Vector <Message> getMessages() {
		return instance.messages;
	}
	
/**
	 * 
	 * Returns vector of all open courses.
	 * 
	 */
	public static Vector <OpenCourse> getOpenCourses() {
		return instance.openCourses;
	}
	
/**
	 * 
	 * Adds news to database.
	 * 
	 */
	public static void addNews(New n) {
		getInstance().news.add(n);
	}
	
/**
	 * 
	 * Adds user to database.
	 * 
	 */
    public static void addUser(User u) {
    	getInstance().users.add(u);
    }

/**
	 * 
	 * Method that saves database instance to the file.
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
	 * Reads saved data from the file and returns it to database.
	 * @throws Exception
	 */
    public static Database readDatabase() throws Exception{
		FileInputStream fis = new FileInputStream(Connect.getInstance().getPath());
		ObjectInputStream ois = new ObjectInputStream(fis);
		return (Database)ois.readObject();
	}
}