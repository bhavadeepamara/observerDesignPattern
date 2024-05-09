package classes;

import java.util.ArrayList;
import java.util.List;

import interfaces.Observable;
import interfaces.Observer;

public class Plastation5Observable implements Observable{

	List<Playstation5Observer> Playstation5Observers =new ArrayList<>();
	public int stock;
	@Override
	public void setObserver(Observer Observer) {
		this.Playstation5Observers.add((Playstation5Observer) Observer);
	}

	@Override
	public void notifyme() {
		for(Playstation5Observer ob:Playstation5Observers) {
			ob.update();
		}
	}

	@Override
	public void removeObserver(Observer Observer) {
		Playstation5Observers.remove(Observer);
	}

	@Override
	public void setdata(int stock) {
		this.stock+=stock;
		notifyme();
	}

}
