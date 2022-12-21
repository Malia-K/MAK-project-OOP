package Model;

import java.io.*;
import java.util.Vector;

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
    
    public static Database getInstance() {
    	return instance;
    }
    
    public static Vector <User> getUsers(){
    	return instance.users;
    }
    
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
    
    public static Vector <Employee> getEmployees(){
    	Vector <Employee> employees = new Vector <Employee>();
    	for(User u: instance.users) {
    		if(u instanceof Employee) {
    			Employee e = (Employee) u;
    			employees.add(e);
    		}
    	}
    	return employees;
    }
    
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

	public static Vector<Book> getLibrary() {
		return instance.library;
	}


	public static Vector<Course> getCourses() {
		return instance.courses;
	}

	public static Vector<Organization> getOrganizations() {
		return instance.organizations;
	}

	public static Vector<String> getLogs() {
		return instance.logs;
	}

	public static Vector<Report> getReports() {
		return instance.reports;
	}

    
	public static Vector <New> getNews() {
		return instance.news;
	}
	
	public static Vector <Message> getMessages() {
		return instance.messages;
	}

	public static Vector <OpenCourse> getOpenCourses() {
		return instance.openCourses;
	}
	
	public static void addNews(New n) {
		getInstance().news.add(n);
	}
	
    public static void addUser(User u) {
    	getInstance().users.add(u);
    }

    public static void databaseSave() throws IOException {
    	FileOutputStream fos = new FileOutputStream(Connect.getInstance().getPath());
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(instance);
		
		fos.close();
		oos.close();
    }
    
    public static Database readDatabase() throws Exception{
		FileInputStream fis = new FileInputStream(Connect.getInstance().getPath());
		ObjectInputStream ois = new ObjectInputStream(fis);
		return (Database)ois.readObject();
	}

}
