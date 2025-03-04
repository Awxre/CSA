public class Main {

    public static void main(String[] args) {
        // create a blanket of each type and demonstrates how the methods work
        Blanket b = new Blanket();
        b.setSize("King");
        b.setMaterial("cashmere");
        b.setColor("Dark Blue");
        System.out.println(b);
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
    }
}
