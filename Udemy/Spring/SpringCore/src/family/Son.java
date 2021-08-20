package family;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Son {
	
	private String name;
	private int age;
	
	@Autowired
	@Qualifier(value = "roger")
	private Father father;
	
	public Father getFather() {
		return father;
	}

	public void setFather(Father father) {
		this.father = father;
	}

	public Son() {
		
	}
	
	public Son(String name, int age) {
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

	public String displaySonInfo() {
		return "Son [name=" + name + ", age=" + age + "] and His father is " + 
				father.getName() + " of Age " + father.getAge();
	}

}
