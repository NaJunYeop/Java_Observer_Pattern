package observer_pattern;

public interface Observer {
	public void update(String room_id, String user_name, String message);
	public String getRoomId();
}
