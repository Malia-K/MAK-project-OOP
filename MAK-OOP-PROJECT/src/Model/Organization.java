package MAK-project21;


/**
* @generated
*/
public class Organization {
    
    /**
    * @generated
    */
    private String name;
    
    /**
    * @generated
    */
    private String description;
    
    /**
    * @generated
    */
    private Student head;
    
    /**
    * @generated
    */
    private Vector<Student> members;
    
    /**
    * @generated
    */
    private Date dateOfCreation;
    
    /**
    * @generated
    */
    private Faculty faculty;
    
    
    /**
    * @generated
    */
    private Set<Student> student;
    
    

    /**
    * @generated
    */
    private String getName() {
        return this.name;
    }
    
    /**
    * @generated
    */
    private String setName(String name) {
        this.name = name;
    }
    
    
    /**
    * @generated
    */
    private String getDescription() {
        return this.description;
    }
    
    /**
    * @generated
    */
    private String setDescription(String description) {
        this.description = description;
    }
    
    
    /**
    * @generated
    */
    private Student getHead() {
        return this.head;
    }
    
    /**
    * @generated
    */
    private Student setHead(Student head) {
        this.head = head;
    }
    
    
    /**
    * @generated
    */
    private Vector<Student> getMembers() {
        return this.members;
    }
    
    /**
    * @generated
    */
    private Vector<Student> setMembers(Vector<Student> members) {
        this.members = members;
    }
    
    
    /**
    * @generated
    */
    private Date getDateOfCreation() {
        return this.dateOfCreation;
    }
    
    /**
    * @generated
    */
    private Date setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }
    
    
    /**
    * @generated
    */
    private Faculty getFaculty() {
        return this.faculty;
    }
    
    /**
    * @generated
    */
    private Faculty setFaculty(Faculty faculty) {
        this.faculty = faculty;
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
    
    
    
}
