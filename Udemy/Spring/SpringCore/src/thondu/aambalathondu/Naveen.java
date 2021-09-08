package thondu.aambalathondu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import thondu.bae.Arjun;
import thondu.bae.Sangeetha;

public class Naveen {

	private String name;
	private Integer age;

	@Autowired
	private Sangeetha sangeetha;
	@Autowired
	private Arjun arjun;

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

		baeList.add(sangeetha);
		baeList.add(arjun);

		System.out.println(name + " has " + baeList.size() + " baes!");
		System.out.print("They are " + sangeetha.getName() + " and " + arjun.getName());
		System.out.println();
	}

}
