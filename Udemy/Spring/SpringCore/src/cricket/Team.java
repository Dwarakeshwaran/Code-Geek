package cricket;

public class Team {

	private String country;
	private int rank;

	public Team() {
		super();
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String displayTeamInfo() {
		return "Team [country=" + country + ", rank=" + rank + "]";
	}

}
