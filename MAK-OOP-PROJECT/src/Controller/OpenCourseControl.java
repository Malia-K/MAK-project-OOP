package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import Model.*;
import enums.Semester;

public class OpenCourseControl {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  StringTokenizer st;
  private Manager activeManager;
  
  public OpenCourseControl() {}
  
  public OpenCourseControl(Manager m) {
    activeManager = m;
  }
  
  private boolean goBack(String input) throws IOException {
    if(input.equals("0")) {
      (new ManagerControl(activeManager)).manageCourses();
      return true;
    }
    return false;
  }
  
  public void createOpenCourse() throws IOException {
    System.out.println("Print 0 to go back\n\nTo add course add following information separated by space:"
        + "\n\tcourse id\n\tstudy year\n\tstudy semester\n\tlector and practice teacher ids");
    String input;
    try {
      input = br.readLine();
      if(goBack(input)) {
        return;
      }
      
      StringTokenizer st = new StringTokenizer(input, " ");
      String courseId = st.nextToken();
      Course course = null;
      for(Course c: Database.getCourses()) {
        if(c.getId().equals(courseId)) {
          course = c;
          break;
        }
      }
      
      if(course == null) {
        System.out.println("Such course doesn't exists, try again");
        createOpenCourse();
        return;
      }
      
      int year = Integer.parseInt(st.nextToken());
      Semester semester = Semester.valueOf(st.nextToken().toUpperCase());
      
      Teacher[] teaches = new Teacher[2];
      
      String teachId = st.nextToken();
      String teach2Id = (st.hasMoreTokens()) ? st.nextToken() : teachId;
      
      for(Teacher t: Database.getTeachers()) {
        if(t.getId().equals(teachId)) {
          teaches[0] = t;
        }
        if(t.getId().equals(teach2Id)) {
          teaches[1] = t;
        }
      }
      if(teaches[0] == null || teaches[1] == null) {
        System.out.println("Such teacher doesn't exists, try again");
        createOpenCourse();
        return;
      }
      OpenCourse newCourse = new OpenCourse(course, new StudyPeriod(semester, year), teaches);
      if(!Database.getOpenCourses().contains(newCourse)) {
        Database.getOpenCourses().add(newCourse);
        System.out.println("New course was added");
      }
      else {
        System.out.println("Course already exists");
      }
      return;
    }  catch(NumberFormatException nfe) {
      System.out.println("Not an integer! Please, try again");
    }catch(IllegalArgumentException iae) {
      System.out.println("Format is not the same! Please, try again");
      }
    catch(NoSuchElementException nsee) {
      System.out.println("You forgot some inputs! Please, try again!");
    }
  }
  
  public void deleteOpenCourse() throws IOException {
    System.out.println("Print 0 to go back\n\nPlease, give the group ID of course that you want to delete");
    String id = br.readLine();
    if(id.length() == 0) {
      System.out.println("The input is empty, please try again");
      deleteOpenCourse();
      return;
    }
    if(goBack(id)) {
      return;
    }
    for(OpenCourse c: Database.getOpenCourses()) {
      if(c.getGroupId().equals(id)) {
        Database.getOpenCourses().remove(c);
        System.out.println("Course " + id + " not available to registration anymore");
        return;
      }
    }
    System.out.println("Course " + id + " wasn't found");
  }
}