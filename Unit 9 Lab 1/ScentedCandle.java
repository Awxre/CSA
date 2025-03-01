public class ScentedCandle extends Candle{
    private String scent;

    String getScent() {
        return scent;
    }
    void setScent(String x) {
        scent = x;
    }
    @Override void setHeight(double inches) {
        super.setHeight(inches);
        price = 3 * inches;
    }
}
