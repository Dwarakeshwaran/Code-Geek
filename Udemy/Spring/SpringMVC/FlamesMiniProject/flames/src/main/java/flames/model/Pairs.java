package flames.model;

import org.springframework.stereotype.Component;

@Component
public class Pairs {

	private int id;
	private String userName;
	private String crushName;
	private String flames;

	public Pairs() {
		super();
	}

	public Pairs(int id, String userName, String crushName, String flames) {
		super();
		this.id = id;
		this.userName = userName;
		this.crushName = crushName;
		this.flames = flames;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getFlames() {
		return flames;
	}

	public void setFlames(String flames) {
		this.flames = flames;
	}

}
