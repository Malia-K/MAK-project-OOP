
public class Schedule {
    
    /**
    * @generated
    */
    private Vector <Lesson> classes;
    
    
    /**
    * @generated
    */
    private Set<Lesson> lesson;
    
    /**
    * @generated
    */
    private Set<Student> student;
    
    /**
    * @generated
    */
    private Set<Teacher> teacher;
    
    

    /**
    * @generated
    */
    private Vector <Lesson> getClasses() {
        return this.classes;
    }
    
    /**
    * @generated
    */
    private Vector <Lesson> setClasses(Vector <Lesson> classes) {
        this.classes = classes;
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
    public Set<Lesson> getLesson() {
        if (this.lesson == null) {
            this.lesson = new HashSet<Lesson>();
        }
        return this.lesson;
    }
    
    /**
    * @generated
    */
    public Set<Lesson> setLesson(Lesson lesson) {
        this.lesson = lesson;
    }
    
    
    
}
