package MAK-project21;


/**
* @generated
*/
public class ResearchPaper {
    
    /**
    * @generated
    */
    private Researcher author;
    
    /**
    * @generated
    */
    private String title;
    
    /**
    * @generated
    */
    private Date publichedDate;
    
    /**
    * @generated
    */
    private String annotation;
    
    
    /**
    * @generated
    */
    private Set<Researcher> researcher;
    
    

    /**
    * @generated
    */
    private Researcher getAuthor() {
        return this.author;
    }
    
    /**
    * @generated
    */
    private Researcher setAuthor(Researcher author) {
        this.author = author;
    }
    
    
    /**
    * @generated
    */
    private String getTitle() {
        return this.title;
    }
    
    /**
    * @generated
    */
    private String setTitle(String title) {
        this.title = title;
    }
    
    
    /**
    * @generated
    */
    private Date getPublichedDate() {
        return this.publichedDate;
    }
    
    /**
    * @generated
    */
    private Date setPublichedDate(Date publichedDate) {
        this.publichedDate = publichedDate;
    }
    
    
    /**
    * @generated
    */
    private String getAnnotation() {
        return this.annotation;
    }
    
    /**
    * @generated
    */
    private String setAnnotation(String annotation) {
        this.annotation = annotation;
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
    
    
    
}
