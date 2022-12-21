package Model;

import java.time.LocalDateTime;

import enums.*;

public class Lesson {
    private OpenCourse course;
    private Days day;
    private LocalDateTime startTime;
    private String room;
    private Format format;
    private LessonType lessonType;
    private LocalDateTime finishTime;

    public OpenCourse getCourse() {
        return this.course;
    }

    public void setCourse(OpenCourse course) {
        this.course = course;
    }
    
    public Days getDay() {
        return this.day;
    }

    public void setDay(Days day) {
        this.day = day;
    }
    
    public LocalDateTime getStartTime() {
        return this.startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
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
    
    public LocalDateTime getFinishTime() {
        return this.finishTime;
    }
    
    public void setFinishTime(LocalDateTime finishTime) {
        this.finishTime = finishTime;
    }  
}
