package Wether_Monitoring;

public interface Subject {
	
	public void registerObserver ( Observer o);
	public void removeObserver (Observer o);
	public void notifyObservers();
}
