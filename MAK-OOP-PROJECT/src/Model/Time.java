
public class Time {
    
    /**
    * @generated
    */
    private int minute;
    
    /**
    * @generated
    */
    private int hour;
    
    
    /**
    * @generated
    */
    private Set<Lesson> lessons;
    
    /**
    * @generated
    */
    private RegisteredCourse regCourse;
    
    

    /**
    * @generated
    */
    private int getMinute() {
        return this.minute;
    }
    
    /**
    * @generated
    */
    private int setMinute(Integer minute) {
        this.minute = minute;
    }
    
    
    /**
    * @generated
    */
    private int getHour() {
        return this.hour;
    }
    
    /**
    * @generated
    */
    private int setHour(Integer hour) {
        this.hour = hour;
    }
    
    
    
    /**
    * @generated
    */
    public RegisteredCourse get() {
        return this.;
    }
    
    /**
    * @generated
    */
    public RegisteredCourse set(RegisteredCourse ) {
        this. = ;
    }
    
    
    /**
    * @generated
    */
    public Set<Lesson> get() {
        if (this. == null) {
            this. = new HashSet<Lesson>();
        }
        return this.;
    }
    
    /**
    * @generated
    */
    public Set<Lesson> set(Lesson ) {
        this. = ;
    }
    
    
    
}
