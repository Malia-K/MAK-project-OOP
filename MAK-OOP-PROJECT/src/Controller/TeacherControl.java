package MAK-project21;


/**
* @generated
*/
public class TeacherControl extends EmployeeControl implements canViewCourses, canMakeRequest, viewCourseData, hasSchedule, canMakeReport {
    
    /**
    * @generated
    */
    private Teacher teacher;
    
    
    /**
    * @generated
    */
    private CourseFilesControl courseFilesControl;
    
    

    /**
    * @generated
    */
    public Teacher getTeacher() {
        return this.teacher;
    }
    
    /**
    * @generated
    */
    public Teacher setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    
    
    /**
    * @generated
    */
    public CourseFilesControl getCourseFilesControl() {
        return this.courseFilesControl;
    }
    
    /**
    * @generated
    */
    public CourseFilesControl setCourseFilesControl(CourseFilesControl courseFilesControl) {
        this.courseFilesControl = courseFilesControl;
    }
    
    
    

    //                          Operations                                  
    
    
}
