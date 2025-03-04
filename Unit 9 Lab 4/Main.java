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
    }
}
