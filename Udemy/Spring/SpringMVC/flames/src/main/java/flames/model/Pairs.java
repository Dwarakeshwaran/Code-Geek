package flames.model;

import org.springframework.stereotype.Component;

@Component
public class Pairs {

	private String userName;
	private String crushName;

	public Pairs() {
		super();
	}

	public Pairs(String userName, String crushName) {
		super();
		this.userName = userName;
		this.crushName = crushName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

}
