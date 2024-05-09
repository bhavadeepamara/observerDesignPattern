package classes;

public class Mainrun {
	
	public static void main(String[] args) {
		IphoneObserver IphoneObserver1 =new IphoneObserver();
		IphoneObserver IphoneObserver2 =new IphoneObserver();
		Playstation5Observer Playstation5Observer1=new Playstation5Observer();
		Playstation5Observer Playstation5Observer2=new Playstation5Observer();
		
		IphoneObserver1.setName("BHAVA");
		IphoneObserver2.setName("KOHLI");
		Playstation5Observer1.setName("JACKS");
		Playstation5Observer2.setName("MAXI");
		
		Plastation5Observable plastation5Observable = new Plastation5Observable();
		
		plastation5Observable.setObserver(Playstation5Observer1);
		plastation5Observable.setObserver(Playstation5Observer2);
		plastation5Observable.setdata(20);
		
		IphoneObservable iphoneObservable = new IphoneObservable();
		
		iphoneObservable.setObserver(IphoneObserver1);
		iphoneObservable.setObserver(IphoneObserver2);
		iphoneObservable.setdata(30);
		
		
	}
}
