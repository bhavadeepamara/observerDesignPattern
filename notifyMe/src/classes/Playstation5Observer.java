package classes;

import interfaces.Observer;

public class Playstation5Observer implements Observer{
	private String name;

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void update() {
		System.out.println("Hey "+this.name+" ! its time to catch your brand new playstation");
	}

}
