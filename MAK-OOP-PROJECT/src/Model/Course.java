package MAK-project21;


/**
* @generated
*/
public class Course {
    
    /**
    * @generated
    */
    private String id;
    
    /**
    * @generated
    */
    private String name;
    
    /**
    * @generated
    */
    private int credits ;
    
    /**
    * @generated
    */
    private Faculty faculty;
    
    /**
    * @generated
    */
    private  formula;
    
    /**
    * @generated
    */
    private Course prerequisite;
    
    
    /**
    * @generated
    */
    private Database database;
    
    

    /**
    * @generated
    */
    private String getId() {
        return this.id;
    }
    
    /**
    * @generated
    */
    private String setId(String id) {
        this.id = id;
    }
    
    
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
    private int getCredits () {
        return this.credits ;
    }
    
    /**
    * @generated
    */
    private int setCredits (Integer credits ) {
        this.credits  = credits ;
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
    private  getFormula() {
        return this.formula;
    }
    
    /**
    * @generated
    */
    private  setFormula(invalid formula) {
        this.formula = formula;
    }
    
    
    /**
    * @generated
    */
    private Course getPrerequisite() {
        return this.prerequisite;
    }
    
    /**
    * @generated
    */
    private Course setPrerequisite(Course prerequisite) {
        this.prerequisite = prerequisite;
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
    
    
    
}
