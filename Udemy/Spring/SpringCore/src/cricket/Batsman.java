package cricket;

public class Batsman {

	private String batsmanName;
	private int runs;
	private double average;

	public Batsman() {
		super();
	}

	public Batsman(String batsmanName, int runs, double average) {
		super();
		this.batsmanName = batsmanName;
		this.runs = runs;
		this.average = average;

		System.out.println("Batsman [batsmanName=" + batsmanName + ", runs=" + runs + ", average=" + average + "]");
	}

	public String getBatsmanName() {
		return batsmanName;
	}

	public void setBatsmanName(String batsmanName) {
		this.batsmanName = batsmanName;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public String display() {
		return "Batsman [batsmanName=" + batsmanName + ", runs=" + runs + ", average=" + average + "]";
	}

}
