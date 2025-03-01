public class Candle {
    private String color;
    private double height;
    public double price;

    public Candle() {
        color = "";
        height = 0;
        price = 0;
    }

    // Getters
    String getColor() {
        return color;
    }
    double getHeight() {
        return height;
    }
    double getPrice() {
        return price;
    }
    
    // Setters
    void setColor(String x) {
        color = x;
    }
    void setHeight(double inches) {
        height = inches;
        price = 2 * inches;
    }
}
