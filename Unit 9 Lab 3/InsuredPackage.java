public class InsuredPackage extends Package {

    public InsuredPackage(int weight, String shippingMethod) {
        super(weight, shippingMethod);
        calculateCost(weight, shippingMethod);
    }

    @Override
    public void calculateCost(int weight, String shippingMethod) {
        super.calculateCost(weight, shippingMethod);
        if (weight <= 1.00) {
            setCost(getCost() + 2.45);
        } else if (weight <= 3.00) {
            setCost(getCost() + 3.95);
        } else {
            setCost(getCost() + 5.55);
        }
    }
}
