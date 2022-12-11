package MAK-project21;


/**
* @generated
*/
public class RegisteredCourse extends Course {
    
    /**
    * @generated
    */
    private Course course;
    
    /**
    * @generated
    */
    private Vector <Teacher> teachers;
    
    /**
    * @generated
    */
    private Mark mark;
    
    /**
    * @generated
    */
    private Semester Semester;
    
    /**
    * @generated
    */
    private Date year;
    
    
    /**
    * @generated
    */
    private Mark mark2;
    
    /**
    * @generated
    */
    private Set<Lesson> lesson;
    
    /**
    * @generated
    */
    private Transcript transcript;
    
    /**
    * @generated
    */
    private Time time;
    
    

    /**
    * @generated
    */
    private Course getCourse() {
        return this.course;
    }
    
    /**
    * @generated
    */
    private Course setCourse(Course course) {
        this.course = course;
    }
    
    
    /**
    * @generated
    */
    private Vector <Teacher> getTeachers() {
        return this.teachers;
    }
    
    /**
    * @generated
    */
    private Vector <Teacher> setTeachers(Vector <Teacher> teachers) {
        this.teachers = teachers;
    }
    
    
    /**
    * @generated
    */
    private Mark getMark() {
        return this.mark;
    }
    
    /**
    * @generated
    */
    private Mark setMark(Mark mark) {
        this.mark = mark;
    }
    
    
    /**
    * @generated
    */
    private Semester getSemester() {
        return this.Semester;
    }
    
    /**
    * @generated
    */
    private Semester setSemester(Semester Semester) {
        this.Semester = Semester;
    }
    
    
    /**
    * @generated
    */
    private Date getYear() {
        return this.year;
    }
    
    /**
    * @generated
    */
    private Date setYear(Date year) {
        this.year = year;
    }
    
    
    
    /**
    * @generated
    */
    public Transcript getTranscript() {
        return this.transcript;
    }
    
    /**
    * @generated
    */
    public Transcript setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }
    
    
    /**
    * @generated
    */
    public Mark getMark2() {
        return this.mark2;
    }
    
    /**
    * @generated
    */
    public Mark setMark2(Mark mark2) {
        this.mark2 = mark2;
    }
    
    
    /**
    * @generated
    */
    public Time getTime() {
        return this.time;
    }
    
    /**
    * @generated
    */
    public Time setTime(Time time) {
        this.time = time;
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
