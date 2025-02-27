public class CollegeCourse {
	private String department;
	private int courseNumber;
	private int credits;
	public int fee;
	
	public CollegeCourse() {
		department = "";
		courseNumber = -1;
		credits = -1;
		fee = -1;
	}
	public CollegeCourse(String department, int courseNumber, int credits) {
		this.department = department;
		this.courseNumber = courseNumber;
		this.credits = credits;
		this.fee = 120 * credits;
	}
	
	public void display() {
		System.out.println(department + " " + courseNumber + " - Credits: " + credits + " - Fee: " + fee);
	}
	
	// Getters
	public String getDepartment() {
		return department;
	}
	public int getCourseNumber() {
		return courseNumber;
	}
	public int getCredits() {
		return credits;
	}
	
	// Setters
	public void setDepartment(String x) {
		this.department = x;
	}
	public void setCourseNumber(int x) {
		courseNumber = x;
	}
	public void setCredits(int x) {
		credits = x;
		fee = 120 * credits;
	}
}
