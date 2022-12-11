
public class Student extends User {
    
    /**
    * @generated
    */
    private Faculty faculty;
    
    /**
    * @generated
    */
    private Degree degree ;
    
    /**
    * @generated
    */
    private int yearOfStudy;
    
    /**
    * @generated
    */
    private Faculty faculty;
    
    /**
    * @generated
    */
    private Degree degree;
    
    /**
    * @generated
    */
    private int yearOfStudy;
    
    /**
    * @generated
    */
    private Organization organization;
    
    /**
    * @generated
    */
    private int creditsTaken;
    
    /**
    * @generated
    */
    private int maxAllowedCredits;
    
    /**
    * @generated
    */
    private Vector <Schedule> schedules;
    
    /**
    * @generated
    */
    private Vector<Transcript> transcript;
    
    
    /**
    * @generated
    */
    private Set<Transcript> transcript;
    
    /**
    * @generated
    */
    private Database database;
    
    /**
    * @generated
    */
    private Organization organization;
    
    /**
    * @generated
    */
    private Schedule schedule;
    
    
    /**
     * @generated
     */
    public Student(int maxAllowedCredits) {
        this.maxAllowedCredits = maxAllowedCredits;
    }
    

    /**
    * @generated
    */
    public Faculty getFaculty() {
        return this.faculty;
    }
    
    /**
    * @generated
    */
    public Faculty setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
    
    
    /**
    * @generated
    */
    public Degree getDegree () {
        return this.degree ;
    }
    
    /**
    * @generated
    */
    public Degree setDegree (Degree degree ) {
        this.degree  = degree ;
    }
    
    
    /**
    * @generated
    */
    public int getYearOfStudy() {
        return this.yearOfStudy;
    }
    
    /**
    * @generated
    */
    public int setYearOfStudy(Integer yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
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
    private Degree getDegree() {
        return this.degree;
    }
    
    /**
    * @generated
    */
    private Degree setDegree(Degree degree) {
        this.degree = degree;
    }
    
    
    /**
    * @generated
    */
    private int getYearOfStudy() {
        return this.yearOfStudy;
    }
    
    /**
    * @generated
    */
    private int setYearOfStudy(Integer yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
    
    
    /**
    * @generated
    */
    private Organization getOrganization() {
        return this.organization;
    }
    
    /**
    * @generated
    */
    private Organization setOrganization(Organization organization) {
        this.organization = organization;
    }
    
    
    /**
    * @generated
    */
    private int getCreditsTaken() {
        return this.creditsTaken;
    }
    
    /**
    * @generated
    */
    private int setCreditsTaken(Integer creditsTaken) {
        this.creditsTaken = creditsTaken;
    }
    
    
    /**
    * @generated
    */
    public int getMaxAllowedCredits() {
        return this.maxAllowedCredits;
    }
    
    /**
    * @generated
    */
    private Vector <Schedule> getSchedules() {
        return this.schedules;
    }
    
    /**
    * @generated
    */
    private Vector <Schedule> setSchedules(Vector <Schedule> schedules) {
        this.schedules = schedules;
    }
    
    
    /**
    * @generated
    */
    private Vector<Transcript> getTranscript() {
        return this.transcript;
    }
    
    /**
    * @generated
    */
    private Vector<Transcript> setTranscript(Vector<Transcript> transcript) {
        this.transcript = transcript;
    }
    
    
    
    /**
    * @generated
    */
    public Schedule getSchedule() {
        return this.schedule;
    }
    
    /**
    * @generated
    */
    public Schedule setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
    
    
    /**
    * @generated
    */
    public Set<Transcript> getTranscript() {
        if (this.transcript == null) {
            this.transcript = new HashSet<Transcript>();
        }
        return this.transcript;
    }
    
    /**
    * @generated
    */
    public Set<Transcript> setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }
    
    
    /**
    * @generated
    */
    public Database getDatabase() {
        return this.database;
    }
    
    /**
    * @generated
    */
    public Database setDatabase(Database database) {
        this.database = database;
    }
    
    
    /**
    * @generated
    */
    public Organization getOrganization() {
        return this.organization;
    }
    
    /**
    * @generated
    */
    public Organization setOrganization(Organization organization) {
        this.organization = organization;
    }
    
    
    
}
