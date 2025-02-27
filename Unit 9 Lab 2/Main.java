public class Main {
	public static void main(String[] args) {
		// College
		CollegeCourse ENG = new CollegeCourse("STEM", 1352, 21);
		LabCourse PHY = new LabCourse("Science", 2736, 15);
		ENG.display();
		PHY.display();
		
		// Rocks
		Rock unknown = new Rock();
		System.out.println(unknown.description);
		Rock granite = new IgneousRock(1244, 500.5);
		System.out.println(
				granite.getDescription() + "   " + 
				granite.getSampleNumber() + "   " + 
				granite.getWeight());
		Rock limestone = new SedimentaryRock(6645, 450.2);
		System.out.println(
				limestone.getDescription() + "   " + 
				limestone.getSampleNumber() + "   " + 
				limestone.getWeight());
		Rock marble = new MetamorphicRock(2251, 71.0);
		System.out.println(
				marble.getDescription() + "   " + 
				marble.getSampleNumber() + "   " + 
				marble.getWeight());
		
		// College Applications
		Person[] people = new Person[2];
		people[0] = new Person();
		people[1] = new Person();
		people[0].setPerson("John", "Doe", "5555 Upper Ln.", 30011, 2220401234L);
		people[1].setPerson("Joe", "Man", "2414 Upper Ln.", 30011, 2220292454L);
		people[0].display();
		people[1].display();
		
		CollegeEmployee[] employees = new CollegeEmployee[2];
		employees[0] = new CollegeEmployee("Jacob", "Renold", "3431 Auburn Rd.", 30071, 4701028999L, 5, 500, "Tech");
		employees[1] = new CollegeEmployee("Ava", "Mitchell", "1243 Big Lane", 21405, 3774187289L, 1270957, 500, "Accounting");
		employees[0].display();
		employees[1].display();

		Faculty[] faculty = new Faculty[2];
		faculty[0] = new Faculty("Jacob", "Renold", "3431 Auburn Rd.", 30071, 4701028999L, 5, 500, "Tech", false);
		faculty[1] = new Faculty("Ava", "Mitchell", "1243 Big Lane", 21405, 3774187289L, 1270957, 500, "Accounting", true);
		faculty[0].display();
		faculty[1].display();

		Student[] students = new Student[2];
		students[0] = new Student("Jacob", "Renold", "3431 Auburn Rd.", 30071, 4701028999L, "Biology", 4.5);
		students[1] = new Student("Ava", "Mitchell", "1243 Big Lane", 21405, 3774187289L, "Physics", 2.8);
		students[0].display();
		students[1].display();
	}
}
