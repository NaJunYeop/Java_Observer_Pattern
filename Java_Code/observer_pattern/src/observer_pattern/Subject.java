package observer_pattern;

import java.util.ArrayList;

public class Subject implements Publisher {

	private ArrayList<Observer> observers;
	private String room_id;
	private String user_name;
	private String message;
	
	public Subject() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void add(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void delete(Observer observer) {
		// TODO Auto-generated method stub
		int index = observers.indexOf(observer);
		observers.remove(index);
	}

	@Override
	public void notifyBroadObservers() {
		// TODO Auto-generated method stub
		for (Observer observer : observers) {
			observer.update(room_id, user_name, message);
		}
	}
	
	@Override
	public void notifyMultiObservers() {
		// TODO Auto-generated method stub
		for (Observer observer : observers) {
			if (observer.getRoomId().equals(room_id)) {
				observer.update(room_id, user_name, message);
			}
		}
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		
	}
	
	public void sendBroadMessages() {
		this.room_id = "System";
		this.user_name = "Supervisor";
		this.message = "BroadCasting";
		notifyBroadObservers();
	}
	
	public void sendMultiMessage(String room_id, String user_name, String message) {
		this.room_id = room_id;
		this.user_name = user_name;
		this.message = message;
		notifyMultiObservers();
	}
	
	public String getUserName() {
		return user_name;
	}
	
	public String getMessage() {
		return message;
	}
}
