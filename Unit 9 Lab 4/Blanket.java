public class Blanket {

    private String size;
    private String color;
    private String material;
    public double price;

    public Blanket() {
        size = "Twin";
        color = "white";
        material = "cotton";
        price = 30;
    }

    public void setSize(String s) {
        this.size = s;
        switch (s) {
            case "Double":
                price += 10;
                break;
            case "Queen":
                price += 25;
                break;
            case "King":
                price += 40;
                break;
            default:
                size = "Twin";
                color = "white";
                material = "cotton";
                price = 30;
        }
    }

    public void setMaterial(String m) {
        this.material = m;
        switch (m) {
            case "wool":
                price += 20;
                break;
            case "cashmere":
                price += 45;
                break;
            default:
                size = "Twin";
                color = "white";
                material = "cotton";
                price = 30;
        }
    }

    public void setColor(String c) {
        color = c;
    }

    public String toString() {
        return (
            "Blanket Size=" +
            size +
            ", color=" +
            color +
            ", material=" +
            material +
            ", price=" +
            price
        );
    }
}
/*
Create a class named Blanket with fields for a blanket’s size, color, material, and price(make this field
public). Include a constructor that sets default values for the fields Twin for size, white for color, cotton for
material, and 30 for price. Include a set method for each of the first three fields. The method that sets size adds
10 to the base price for a double blanket, 25 for a queen blanket, and 40 for a king. The method that sets the
material adds 20 to the price for wool and 45 to the price for cashmere. In other words, the price for a king-sized
cashmere blanket is 115. Whenever the size or material is invalid, reset the blanket to the default values. Include
a toString() method that returns a description of the blanket.
*/
