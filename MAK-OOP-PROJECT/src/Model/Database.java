package MAK-project21;


/**
* @generated
*/
public class Database {
    
    /**
    * @generated
    */
    private Vector <User> Users;
    
    /**
    * @generated
    */
    private Vector <Employee> Employees;
    
    /**
    * @generated
    */
    private Vector <Student> Students;
    
    /**
    * @generated
    */
    private Vector <Manager> Managers;
    
    /**
    * @generated
    */
    private Vector <Admin> Admins;
    
    /**
    * @generated
    */
    private Vector <Librarian> Librarians;
    
    /**
    * @generated
    */
    private Vector <Teacher> Teachers;
    
    /**
    * @generated
    */
    private Vector <Book> Library;
    
    /**
    * @generated
    */
    private Vector <Course> Courses;
    
    /**
    * @generated
    */
    private Vector<Organization> Organizations;
    
    /**
    * @generated
    */
    private Vector <Research> Researchers;
    
    /**
    * @generated
    */
    private Vector <String> logs;
    
    /**
    * @generated
    */
    private  requests;
    
    /**
    * @generated
    */
    private Vector<Report> reports;
    
    
    /**
    * @generated
    */
    private Researcher researcher;
    
    /**
    * @generated
    */
    private Researcher researcher;
    
    /**
    * @generated
    */
    private Set<Librarian> librarian;
    
    /**
    * @generated
    */
    private Set<Admin> admin;
    
    /**
    * @generated
    */
    private Set<Course> ;
    
    /**
    * @generated
    */
    private Set<Student> student;
    
    /**
    * @generated
    */
    private Set<Book> book;
    
    /**
    * @generated
    */
    private Set<Employee> employee;
    
    /**
    * @generated
    */
    private Set<Manager> manager;
    
    /**
    * @generated
    */
    private Set<User> user;
    
    /**
    * @generated
    */
    private Set<Teacher> teacher;
    
    

    /**
    * @generated
    */
    private Vector <User> getUsers() {
        return this.Users;
    }
    
    /**
    * @generated
    */
    private Vector <User> setUsers(Vector <User> Users) {
        this.Users = Users;
    }
    
    
    /**
    * @generated
    */
    private Vector <Employee> getEmployees() {
        return this.Employees;
    }
    
    /**
    * @generated
    */
    private Vector <Employee> setEmployees(Vector <Employee> Employees) {
        this.Employees = Employees;
    }
    
    
    /**
    * @generated
    */
    private Vector <Student> getStudents() {
        return this.Students;
    }
    
    /**
    * @generated
    */
    private Vector <Student> setStudents(Vector <Student> Students) {
        this.Students = Students;
    }
    
    
    /**
    * @generated
    */
    private Vector <Manager> getManagers() {
        return this.Managers;
    }
    
    /**
    * @generated
    */
    private Vector <Manager> setManagers(Vector <Manager> Managers) {
        this.Managers = Managers;
    }
    
    
    /**
    * @generated
    */
    private Vector <Admin> getAdmins() {
        return this.Admins;
    }
    
    /**
    * @generated
    */
    private Vector <Admin> setAdmins(Vector <Admin> Admins) {
        this.Admins = Admins;
    }
    
    
    /**
    * @generated
    */
    private Vector <Librarian> getLibrarians() {
        return this.Librarians;
    }
    
    /**
    * @generated
    */
    private Vector <Librarian> setLibrarians(Vector <Librarian> Librarians) {
        this.Librarians = Librarians;
    }
    
    
    /**
    * @generated
    */
    private Vector <Teacher> getTeachers() {
        return this.Teachers;
    }
    
    /**
    * @generated
    */
    private Vector <Teacher> setTeachers(Vector <Teacher> Teachers) {
        this.Teachers = Teachers;
    }
    
    
    /**
    * @generated
    */
    private Vector <Book> getLibrary() {
        return this.Library;
    }
    
    /**
    * @generated
    */
    private Vector <Book> setLibrary(Vector <Book> Library) {
        this.Library = Library;
    }
    
    
    /**
    * @generated
    */
    private Vector <Course> getCourses() {
        return this.Courses;
    }
    
    /**
    * @generated
    */
    private Vector <Course> setCourses(Vector <Course> Courses) {
        this.Courses = Courses;
    }
    
    
    /**
    * @generated
    */
    private Vector<Organization> getOrganizations() {
        return this.Organizations;
    }
    
    /**
    * @generated
    */
    private Vector<Organization> setOrganizations(Vector<Organization> Organizations) {
        this.Organizations = Organizations;
    }
    
    
    /**
    * @generated
    */
    private Vector <Research> getResearchers() {
        return this.Researchers;
    }
    
    /**
    * @generated
    */
    private Vector <Research> setResearchers(Vector <Research> Researchers) {
        this.Researchers = Researchers;
    }
    
    
    /**
    * @generated
    */
    private Vector <String> getLogs() {
        return this.logs;
    }
    
    /**
    * @generated
    */
    private Vector <String> setLogs(Vector <String> logs) {
        this.logs = logs;
    }
    
    
    /**
    * @generated
    */
    private  getRequests() {
        return this.requests;
    }
    
    /**
    * @generated
    */
    private  setRequests(invalid requests) {
        this.requests = requests;
    }
    
    
    /**
    * @generated
    */
    private Vector<Report> getReports() {
        return this.reports;
    }
    
    /**
    * @generated
    */
    private Vector<Report> setReports(Vector<Report> reports) {
        this.reports = reports;
    }
    
    
    
    /**
    * @generated
    */
    public Set<Teacher> getTeacher() {
        if (this.teacher == null) {
            this.teacher = new HashSet<Teacher>();
        }
        return this.teacher;
    }
    
    /**
    * @generated
    */
    public Set<Teacher> setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    
    /**
    * @generated
    */
    public Set<User> getUser() {
        if (this.user == null) {
            this.user = new HashSet<User>();
        }
        return this.user;
    }
    
    /**
    * @generated
    */
    public Set<User> setUser(User user) {
        this.user = user;
    }
    
    
    /**
    * @generated
    */
    public Set<Librarian> getLibrarian() {
        if (this.librarian == null) {
            this.librarian = new HashSet<Librarian>();
        }
        return this.librarian;
    }
    
    /**
    * @generated
    */
    public Set<Librarian> setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }
    
    
    /**
    * @generated
    */
    public Set<Book> getBook() {
        if (this.book == null) {
            this.book = new HashSet<Book>();
        }
        return this.book;
    }
    
    /**
    * @generated
    */
    public Set<Book> setBook(Book book) {
        this.book = book;
    }
    
    
    /**
    * @generated
    */
    public Set<Student> getStudent() {
        if (this.student == null) {
            this.student = new HashSet<Student>();
        }
        return this.student;
    }
    
    /**
    * @generated
    */
    public Set<Student> setStudent(Student student) {
        this.student = student;
    }
    
    
    /**
    * @generated
    */
    public Set<Employee> getEmployee() {
        if (this.employee == null) {
            this.employee = new HashSet<Employee>();
        }
        return this.employee;
    }
    
    /**
    * @generated
    */
    public Set<Employee> setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
    /**
    * @generated
    */
    public Set<Admin> getAdmin() {
        if (this.admin == null) {
            this.admin = new HashSet<Admin>();
        }
        return this.admin;
    }
    
    /**
    * @generated
    */
    public Set<Admin> setAdmin(Admin admin) {
        this.admin = admin;
    }
    
    
    /**
    * @generated
    */
    public Set<Manager> getManager() {
        if (this.manager == null) {
            this.manager = new HashSet<Manager>();
        }
        return this.manager;
    }
    
    /**
    * @generated
    */
    public Set<Manager> setManager(Manager manager) {
        this.manager = manager;
    }
    
    
    /**
    * @generated
    */
    public Set<Course> get() {
        if (this. == null) {
            this. = new HashSet<Course>();
        }
        return this.;
    }
    
    /**
    * @generated
    */
    public Set<Course> set(Course ) {
        this. = ;
    }
    
    
    /**
    * @generated
    */
    public Researcher getResearcher() {
        return this.researcher;
    }
    
    /**
    * @generated
    */
    public Researcher setResearcher(Researcher researcher) {
        this.researcher = researcher;
    }
    
    
    /**
    * @generated
    */
    public Researcher getResearcher() {
        return this.researcher;
    }
    
    /**
    * @generated
    */
    public Researcher setResearcher(Researcher researcher) {
        this.researcher = researcher;
    }
    
    
    
}
