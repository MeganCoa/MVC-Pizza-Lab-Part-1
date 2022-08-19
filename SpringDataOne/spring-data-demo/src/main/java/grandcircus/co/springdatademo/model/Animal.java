package grandcircus.co.springdatademo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("animals") // Or whatever collection name you want
public class Animal {
	@Id
	private String Id;
	private String name;
	private String power;
	private int age;
	private Boolean isGoodBoy;
	
	public Animal() {
		
	}
	public Animal(String id, String name, String power, int age, Boolean isGoodBoy) {
		Id = id;
		this.name = name;
		this.power = power;
		this.age = age;
		this.isGoodBoy = isGoodBoy;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Boolean getIsGoodBoy() {
		return isGoodBoy;
	}
	public void setIsGoodBoy(Boolean isGoodBoy) {
		this.isGoodBoy = isGoodBoy;
	}
	

}
