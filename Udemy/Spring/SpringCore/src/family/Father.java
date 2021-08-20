package family;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Father {

	private String name;
	private int age;

	@Autowired
	@Qualifier(value = "marco")
	private Son son;

	public Father() {

	}

	public Father(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String displayFatherInfo() {
		return "Father [name=" + name + ", age=" + age + "] And his Son is " + son.getName() + " of Age "
				+ son.getAge();
	}

}
