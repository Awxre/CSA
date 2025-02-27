public class Person {
	private String fName;
	private String lName;
	private String address;
	private int zipCode;
	private long phoneNumber;
	
	public Person() {
		// No args
	}
	public Person(String fName, String lName, String address, int zip, long phoneNumber) {
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.zipCode = zip;
		this.phoneNumber = phoneNumber;
	}
	public void setPerson(String fName, String lName, String address, int zip, long phoneNumber) {
		// Lab PDF said to have a method to set everything
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.zipCode = zip;
		this.phoneNumber = phoneNumber;
	}
	public void display() {
		System.out.println(fName +" "+ lName +" - "+ address +" "+ zipCode +" - "+ phoneNumber);
	}
	

}
