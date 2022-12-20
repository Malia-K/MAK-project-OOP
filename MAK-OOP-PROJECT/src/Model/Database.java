package Model;

import java.io.*;
import java.util.Vector;

public final class Database implements Serializable{

	private static final long serialVersionUID = 1L;
	private static Database instance = new Database();
	
	private Vector <User> users;
    private Vector <Book> library;
    private Vector <Course> courses;
    private Vector <Organization> organizations;
    private Vector <String> logs;
    private Vector <Report> reports;
    private Vector <New> news;

    
    {
    	users = new Vector <User>();
    	library = new Vector <Book>();
    	courses = new Vector <Course>();
    	organizations = new Vector <Organization>();
    	logs = new Vector <String>();
    	reports = new Vector <Report>();
    	news = new Vector<New>();
    	
    }
    
    private Database() {}
    
    public static Database getInstance() {
    	try {
			readDatabase();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return instance;
    }
    
    public Vector <User> getUsers(){
    	return instance.users;
    }
    
    public Vector <Student> getStudents() {
    	Vector <Student> students = new Vector <Student>();
    	for(User u: instance.users) {
    		if(u instanceof Student) {
    			Student s = (Student) u;
    			students.add(s);
    		}
    	}
    	return students;
    }
    
    public Vector <Employee> getEmployees(){
    	Vector <Employee> employees = new Vector <Employee>();
    	for(User u: instance.users) {
    		if(u instanceof Employee) {
    			Employee e = (Employee) u;
    			employees.add(e);
    		}
    	}
    	return employees;
    }
    
    public Vector <Admin> getAdmins(){
    	Vector <Admin> admins = new Vector <Admin>();
    	for(User u: instance.users) {
    		if(u instanceof Admin) {
    			Admin a = (Admin) u;
    			admins.add(a);
    		}
    	}
    	return admins;
    }
    
    public Vector <Librarian> getLibrarians(){
    	Vector <Librarian> librarians = new Vector <Librarian>();
    	for(User u: instance.users) {
    		if(u instanceof Librarian) {
    			Librarian l = (Librarian) u;
    			librarians.add(l);
    		}
    	}
    	return librarians;
    }
      
    public Vector <Manager> getManagers(){
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

	public Vector<Book> getLibrary() {
		return instance.library;
	}


	public Vector<Course> getCourses() {
		return instance.courses;
	}

	public Vector<Organization> getOrganizations() {
		return instance.organizations;
	}

	public Vector<String> getLogs() {
		return instance.logs;
	}

	public Vector<Report> getReports() {
		return instance.reports;
	}

    
	public Vector <New> getNews() {
		return instance.news;
	}
	
	public void addNews(New n) {
		news.add(n);
	}
	
    public void addUser(User u) {
    	getInstance().users.add(u);

    }

    public static void databaseSave() throws IOException {
    	FileOutputStream fos = new FileOutputStream(Connect.getInstance());
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(instance);
		
		fos.close();
		oos.close();
    }
    
    public static void readDatabase() throws Exception{
		FileInputStream fis = new FileInputStream(Connect.getInstance());
		ObjectInputStream ois = new ObjectInputStream(fis);
		instance = (Database)ois.readObject();
		fis.close();
		ois.close();
	}
}
