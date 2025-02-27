public class CollegeEmployee extends Person {
	private int SSID;
	private int salary;
	private String department;

	public CollegeEmployee(String fName, String lName, String address, int zip, long phoneNumber, int SSID, int salary, String department) {
		super(fName, lName, address, zip, phoneNumber);
		this.SSID = SSID;
		this.salary = salary;
		this.department = department;
	}
	public void display() {
		super.display();
		System.out.println("    SSID: " + SSID + " - $" + salary + " - " + department);
	}
	public void setSSID(int x) {
		SSID = x;
	}
	public void setSalary(int dollars) {
		salary = dollars;
	}
	public void setDepartment(String x) {
		department = x;
	}
}