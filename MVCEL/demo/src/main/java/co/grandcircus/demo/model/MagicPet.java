package co.grandcircus.demo.model;

import java.util.ArrayList;

public class MagicPet {
	private String name;
	private String type;
	private ArrayList<String> powers;
	private Boolean good_boy;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MagicPet(String name, String type, ArrayList<String> powers, Boolean good_boy, int age) {
		super();
		this.name = name;
		this.type = type;
		this.powers = powers;
		this.good_boy = good_boy;
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ArrayList<String> getPowers() {
		return powers;
	}
	public void setPowers(ArrayList<String> powers) {
		this.powers = powers;
	}
	public Boolean getGood_boy() {
		return good_boy;
	}
	public void setGood_boy(Boolean good_boy) {
		this.good_boy = good_boy;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
