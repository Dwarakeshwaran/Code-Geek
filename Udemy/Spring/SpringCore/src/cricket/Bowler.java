package cricket;

public class Bowler {

	private String bowlerName;
	private int wickets;
	private double average;

	private Team bowlerTeam;

	public Bowler(String bowlerName, int wickets, double average, Team bowlerTeam) {
		super();
		this.bowlerName = bowlerName;
		this.wickets = wickets;
		this.average = average;
		this.bowlerTeam = bowlerTeam;

		System.out.println("Bowler [bowlerName=" + bowlerName + ", wickets=" + wickets + ", average=" + average + "]");
	}

	public Team getTeam() {
		return bowlerTeam;
	}

	public void setTeam(Team bowlerTeam) {
		this.bowlerTeam = bowlerTeam;
	}

	public String getBowlerName() {
		return bowlerName;
	}

	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public String displayBowlerInfo() {
		return "Bowler [bowlerName=" + bowlerName + ", wickets=" + wickets + ", average=" + average + "]";
	}

	public void getTeamInfo() {

		System.out.println(this.bowlerName + "'s team is " + bowlerTeam.getCountry() + " which is ranked at No."
				+ bowlerTeam.getRank() + " Position");
	}

}
