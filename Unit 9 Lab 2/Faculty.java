public class Faculty extends CollegeEmployee {
	private boolean tenured;
	
	public Faculty(String fName, String lName, String address, int zip, long phoneNumber, int SSID, int salary,
			String department, boolean isTenured) {
		super(fName, lName, address, zip, phoneNumber, SSID, salary, department);
		tenured = isTenured;
	}
	public void display() {
		super.display();
		System.out.println("    Tenured: " + tenured);
	}
	public void setTenured(boolean x) {
		tenured = x;
	}

}
