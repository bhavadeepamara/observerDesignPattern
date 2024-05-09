package classes;

import interfaces.Observer;

public class IphoneObserver implements Observer{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void update() {
		System.out.println("Hey! "+this.name+" Get your stunning new i phone");
	}
	
	
}
