package Model;

import enums.Semester;

import java.io.Serializable;
import java.time.LocalDate;

public class StudyPeriod implements Serializable {
	private static final long serialVersionUID = 1L;
	private Semester semester;
	private int year;
	
	public StudyPeriod() {
		setSemester(Semester.FALL);
		setYear(LocalDate.now().getYear());
	}
	
	public StudyPeriod(Semester semester) {
		this();
		this.setSemester(semester);
	}
	
	public StudyPeriod(Semester semester, int year) {
		this(semester);
		this.setYear(year);
	}

	public Semester getSemester() {
		return semester;
	}

	public void setSemester(Semester semester) {
		this.semester = semester;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		return year + " " + semester;
	}
}