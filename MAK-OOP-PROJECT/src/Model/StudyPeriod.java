package Model;

import enums.Semester;

import java.io.Serializable;
import java.time.LocalDate;

public class StudyPeriod implements Serializable, Comparable<StudyPeriod>, Cloneable {
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
	
	public int compareTo(StudyPeriod o) {
		if(year == o.getYear()) {
			return semester.compareTo(o.getSemester());
		}
		if(year > o.getYear()) return 1;
		return -1;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		
		StudyPeriod sp = (StudyPeriod) o;
		return year == sp.getYear() && semester.equals(sp.getSemester());
	}
	
	public Object clone() throws CloneNotSupportedException {
		StudyPeriod sp = (StudyPeriod) super.clone();
		return sp;
	}
	
	public String toString() {
		return year + " " + semester;
	}
}