package classes;

import java.util.ArrayList;
import java.util.List;

import interfaces.Observable;
import interfaces.Observer;

public class IphoneObservable implements Observable{

	List<IphoneObserver> IphoneObservers=new ArrayList<>();
	public int stock;
	@Override
	public void setObserver(Observer Observer) {
		IphoneObservers.add((IphoneObserver) Observer);
	}
	@Override
	public void removeObserver(Observer Observer) {
		IphoneObservers.remove(Observer);
	}
	@Override
	public void notifyme() {
		for(IphoneObserver ob:IphoneObservers) {
			ob.update();
		}
	}
	@Override
	public void setdata(int stock) {
		this.stock+=stock;
		notifyme();
	}
	

}
