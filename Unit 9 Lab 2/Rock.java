public class Rock {
	private int sampleNumber;
	public String description;
	private double weight;
	
	public Rock() {
		description = "Unclassified";
	}
	public int getSampleNumber() {
		return sampleNumber;
	}
	public double getWeight() {
		return weight;
	}
	public String getDescription() {
		return description;
	}
	public void setWeight(double x) {
		weight = x;
	}
	public void setSampleNumber(int x) {
		sampleNumber = x;
	}
}
