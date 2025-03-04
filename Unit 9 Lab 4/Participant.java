public class Participant {

    private String name;
    private int age;
    private String address;

    public Participant(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String toString() {
        return "Name: " + name + "    Age: " + age + "    Address: " + address;
    }

    public boolean equals(Participant p) {
        if (
            this.name == p.name &&
            this.age == p.age &&
            this.address == p.address
        ) {
            return true;
        } else {
            return false;
        }
    }
}
/*
A certain district holds a mini-Olympics each summer. Create a class called Participant with fields for name,
age, and street address. Include a constructor that assigns parameter values to each field and a toString()
method that returns a String containing all the values. Also include an equals() method that determines
two Participants are equal if they have the same values in all three fields.
*/
