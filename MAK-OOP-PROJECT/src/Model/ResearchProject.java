package MAK-project21;


/**
* @generated
*/
public class ResearchProject {
    
    /**
    * @generated
    */
    private String topic;
    
    /**
    * @generated
    */
    private String description;
    
    /**
    * @generated
    */
    private Vector <Researcher> members;
    
    
    /**
    * @generated
    */
    private Researcher researcher;
    
    /**
    * @generated
    */
    private Set<Researcher> researcher;
    
    

    /**
    * @generated
    */
    private String getTopic() {
        return this.topic;
    }
    
    /**
    * @generated
    */
    private String setTopic(String topic) {
        this.topic = topic;
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
    private Vector <Researcher> getMembers() {
        return this.members;
    }
    
    /**
    * @generated
    */
    private Vector <Researcher> setMembers(Vector <Researcher> members) {
        this.members = members;
    }
    
    
    
    /**
    * @generated
    */
    public Set<Researcher> getResearcher() {
        if (this.researcher == null) {
            this.researcher = new HashSet<Researcher>();
        }
        return this.researcher;
    }
    
    /**
    * @generated
    */
    public Set<Researcher> setResearcher(Researcher researcher) {
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
