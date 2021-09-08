package thondu.aambalathondu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import thondu.bae.Bhuvana;
import thondu.bae.Mythili;

public class Dinesh {

	private String name;
	private Integer age;

	@Autowired
	private Mythili mythili;
	@Autowired
	private Bhuvana bhuvana;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void getThonduInfo() {
		System.out.println("Thondu " + name + " is " + age + " Years old");
	}

	public void getBaeInfo() {

		List<Object> baeList = new ArrayList<>();

		baeList.add(mythili);
		baeList.add(bhuvana);

		System.out.println(name + " has " + baeList.size() + " baes!");
		System.out.print("They are " + mythili.getName() + " and " + bhuvana.getName());
		System.out.println();

	}

}
