package Model;

import enums.*;

public class Lesson {
    private RegisteredCourse course;
    private Days day;
    private Time startTime;
    private String room;
    private Format format;
    private LessonType lessonType;
    private Time finishTime;

    public RegisteredCourse getCourse() {
        return this.course;
    }

    public void setCourse(RegisteredCourse course) {
        this.course = course;
    }
    
    public Days getDay() {
        return this.day;
    }

    public void setDay(Days day) {
        this.day = day;
    }
    
    public Time getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }
    
    public String getRoom() {
        return this.room;
    }
    
    public void setRoom(String room) {
        this.room = room;
    }
    
    public Format getFormat() {
        return this.format;
    }
    
    public void setFormat(Format format) {
        this.format = format;
    }
    
    public LessonType getLessonType() {
        return this.lessonType;
    }
    
    public void setLessonType(LessonType lessonType) {
        this.lessonType = lessonType;
    }
    
    public Time getFinishTime() {
        return this.finishTime;
    }
    
    public void setFinishTime(Time finishTime) {
        this.finishTime = finishTime;
    }  
}
