public class ElectricBlanket extends Blanket {

    private int numHeatSettings;
    private boolean autoShutoff;

    public ElectricBlanket() {
        super();
        numHeatSettings = 1;
        autoShutoff = false;
    }

    public int getNumHeatSettings() {
        return numHeatSettings;
    }

    public boolean getAutoShutoff() {
        return autoShutoff;
    }

    public void setNumHeatSettings(int n) {
        if (n < 1 || n > 5) {
            numHeatSettings = 1;
        } else {
            numHeatSettings = n;
        }
    }

    public void setAutoShutoff(boolean yn) {
        autoShutoff = yn;
        if (yn) {
            price += 6;
        }
    }

    public String toString() {
        return (
            "Electric " +
            super.toString() +
            ", # Of Heat Settings=" +
            numHeatSettings +
            ", Can Auto Shutoff=" +
            autoShutoff
        );
    }
}
/*
Create a child class named ElectricBlanket that
extends Blanket and includes two additional fields: one for the number of heat settings and one for whether the
electric blanket has an automatic shutoff feature. Default values are one heat setting and no automatic shutoff.
Include get and set methods for those fields. Do not allow the number of settings to be fewer than one or more
than five; if it is, use the default setting of one. Add a 6 to the price of the blanket if it has an automatic shutoff
feature. Also include a toString() method that calls the parent class toString() method and combines the
returned value with data about the new fields to return a complete description of the features.
*/
