package cricket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bowler {

	private String bowlerName;
	private int wickets;
	private double average;

	private Team team;

	public Bowler(String bowlerName, int wickets, double average) {
		super();
		this.bowlerName = bowlerName;
		this.wickets = wickets;
		this.average = average;
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

		System.out.println(this.bowlerName + "'s team is " + team.getCountry() + " which is ranked at No."
				+ team.getRank() + " Position");
	}

}
