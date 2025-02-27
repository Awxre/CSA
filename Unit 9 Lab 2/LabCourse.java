public class LabCourse extends CollegeCourse {
	
	// Constructors
	public LabCourse() {
		super();
		this.fee += 50;
	}
	public LabCourse(String department, int courseNumber, int credits) {
		super(department, courseNumber, credits);
		this.fee += 50;
	}
	
	// Override setCredits()
	public void setCredits(int x) {
		super.setCredits(x);
		this.fee += 50;
	}
	
}
