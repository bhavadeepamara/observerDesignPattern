package interfaces;

public interface Observable {
	
	public void setObserver(Observer Observer);
	public void removeObserver(Observer Observer);
	public void notifyme();
	public void setdata(int stock);
}
