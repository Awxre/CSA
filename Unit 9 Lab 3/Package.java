public class Package {

    private int weight;
    private String shippingMethod; // Air, Truck, or Mail
    private double cost;

    public Package(int weight, String shippingMethod) {
        this.weight = weight;
        this.shippingMethod = shippingMethod;
        calculateCost(weight, shippingMethod);
    }

    public int getWeight() {
        return weight;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public double getCost() {
        return cost;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public void calculateCost(int weight, String shippingMethod) {
        switch (shippingMethod) {
            case "Air":
                if (weight <= 8) {
                    cost = 2.0;
                } else if (weight <= 16) {
                    cost = 3.0;
                } else {
                    cost = 4.5;
                }
                break;
            case "Truck":
                if (weight <= 8) {
                    cost = 1.5;
                } else if (weight <= 16) {
                    cost = 2.35;
                } else {
                    cost = 3.25;
                }
                break;
            case "Mail":
                if (weight <= 8) {
                    cost = 0.5;
                } else if (weight <= 16) {
                    cost = 1.5;
                } else {
                    cost = 2.15;
                }
                break;
        }
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void display() {
        System.out.println("Weight: " + weight + " lbs");
        System.out.println("Shipping Method: " + shippingMethod);
        System.out.println("Cost: $" + cost);
    }
}
