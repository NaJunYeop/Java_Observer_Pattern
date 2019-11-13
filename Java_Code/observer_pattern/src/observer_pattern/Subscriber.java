package observer_pattern;

public class Subscriber implements Observer {
	private String room_id;
	private String user_name;
	private Publisher publisher;
	
	public Subscriber(String room_id, String user_name, Publisher publisher) {
		this.room_id = room_id;
		this.user_name = user_name;
		this.publisher = publisher;
		publisher.add(this);
	}
	@Override
	public void update(String room_id, String user_name, String message) {
		// TODO Auto-generated method stub
		display(room_id, user_name, message);
	}

	@Override
	public String getRoomId() {
		// TODO Auto-generated method stub
		return room_id;
	}
	
	public void display(String room_id, String user_name, String message) {
		System.out.println("[ " + room_id + " ] " + user_name + "(" + this.user_name + ") : " + message);
	}

}
