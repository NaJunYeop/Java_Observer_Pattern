package observer_pattern;

public interface Publisher {
	public void add(Observer observer);
	public void delete(Observer observer);
	public void notifyBroadObservers();
	public void notifyMultiObservers();
	public void notifyObserver();
}
