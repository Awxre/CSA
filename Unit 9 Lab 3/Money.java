public class Money {
	private double amount;
	private String type;

	public Money(double amount) {
		this.amount = amount;
	}
	
	public Money(double amount, String type) {
		this.amount = amount;
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}
	
	public String toString() {
		return type;
	}
}
