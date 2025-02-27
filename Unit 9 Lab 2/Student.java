public class Student extends Person {
	private String major;
	private double GPA;
	
	public Student(String fName, String lName, String address, int zip, long phoneNumber, String major, double GPA) {
		super(fName, lName, address, zip, phoneNumber);
		this.major = major;
		this.GPA = GPA;
	}
	public void display() {
		super.display();
		System.out.println("    Major: " + major + " - GPA: " + GPA);
	}
	public void setMajor(String x) {
		major = x;
	}
	public void setGPA(double x) {
		GPA = x;
	}
}
