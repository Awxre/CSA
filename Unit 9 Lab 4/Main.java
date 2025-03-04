public class Main {

    public static void main(String[] args) {
        // create a blanket of each type and demonstrates how the methods work
        Blanket bl = new Blanket();
        bl.setSize("King");
        bl.setMaterial("cashmere");
        bl.setColor("Dark Blue");
        System.out.println(bl);
        ElectricBlanket eb = new ElectricBlanket();
        eb.setSize("Double");
        eb.setMaterial("wool");
        eb.setColor("Purple");
        eb.setAutoShutoff(true);
        eb.setNumHeatSettings(5);
        System.out.println(eb);

        // In the Main class, create two arrays of
        // at least eight Participants each—one holds Participants in the mini-marathon, and the other holds
        // Participants in the diving competition. Prompt the user for values. After the data values are entered, display
        // values for Participants who are in both events.
        Participant[] miniMarathon = new Participant[8];
        Participant[] diving = new Participant[8];

        miniMarathon[0] = new Participant("Alice Johnson", 25, "123 Maple St.");
        miniMarathon[1] = new Participant("Bob Smith", 30, "456 Oak Ave.");
        miniMarathon[2] = new Participant("Charlie Davis", 22, "789 Pine Rd.");
        miniMarathon[3] = new Participant("Dana Lee", 28, "101 Birch Blvd.");
        miniMarathon[4] = new Participant("Eve Taylor", 27, "202 Cedar Ln.");
        miniMarathon[5] = new Participant("Frank White", 24, "303 Elm Dr.");
        miniMarathon[6] = new Participant("Grace Brown", 26, "404 Willow Way");
        miniMarathon[7] = new Participant("Hank Green", 29, "505 Redwood St.");
        for (Participant p : miniMarathon) {
            System.out.println(p);
        }
        diving[0] = new Participant("Ivy Black", 23, "601 Seaside Blvd.");
        diving[1] = new Participant("Jack Adams", 27, "702 Harbor Rd.");
        diving[2] = new Participant("Katie Hall", 21, "803 Bayview Dr.");
        diving[3] = new Participant("Leo Wilson", 29, "904 Ocean Ave.");
        diving[4] = new Participant("Mia Scott", 25, "1001 Coral St.");
        diving[5] = new Participant("Nate Moore", 32, "1102 Coastal Ln.");
        diving[6] = new Participant("Olivia Clark", 24, "1203 Reef Rd.");
        diving[7] = new Participant("Paul Harris", 26, "1304 Pier St.");
        for (Participant p : diving) {
            System.out.println(p);
        }

        // Create a Building class, and two subclasses, House and School. The Building class contains fields for
        // square footage and stories. The House class contains additional fields for number of bedrooms and baths. The
        // School class contains additional fields for number of classrooms and grade level (for example, elementary or
        // junior high). All the classes contain appropriate get and set methods. In the Main class, create at least one
        // object for each class and test the methods to demonstrate they work

        Building b = new Building();
        b.setSquareFootage(500.5);
        b.setStories(4);

        House h = new House();
        h.setSquareFootage(1500.5);
        h.setStories(2);
        h.setBedrooms(3);
        h.setBathrooms(2);

        School s = new School();
        s.setSquareFootage(2000.5);
        s.setStories(3);
        s.setNumClassrooms(25);
        s.setGradeLevel("Elementary");

        System.out.println(b.getStories() + "   " + b.getSquareFootage());
        System.out.println(h.getBedrooms() + "   " + h.getBathrooms());
        System.out.println(s.getNumClassrooms() + "   " + s.getGradeLevel());
    }
}
