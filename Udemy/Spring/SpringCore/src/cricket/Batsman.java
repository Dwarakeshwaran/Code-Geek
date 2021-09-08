package cricket;

public class Batsman {

	private String batsmanName;
	private int runs;
	private double average;

	private Team batsmanTeam;

	public Batsman() {
		super();
	}

	public Team getBatsmanTeam() {
		return batsmanTeam;
	}

	public void setBatsmanTeam(Team batsmanTeam) {
		this.batsmanTeam = batsmanTeam;
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

	public String displayBatsmanInfo() {
		return "Batsman [batsmanName=" + batsmanName + ", runs=" + runs + ", average=" + average + "]";
	}

	public void getTeamInfo() {

		System.out.println(this.batsmanName + "'s team is " + batsmanTeam.getCountry() + " which is ranked at No."
				+ batsmanTeam.getRank() + " Position");
	}

}
