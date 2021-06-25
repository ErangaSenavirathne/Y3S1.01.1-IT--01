package group01.user;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Seller {

	private int id;
	private String name;
	private int age;
	private String dob;
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", age=" + age + ", dob=" + dob + "]";
	}
	
}
