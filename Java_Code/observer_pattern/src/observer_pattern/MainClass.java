package observer_pattern;

import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		Subject mSubject = new Subject();
		ArrayList<Subscriber> subscribers = new ArrayList<>(); 
		
		subscribers.add(new Subscriber("room1", "A", mSubject));
		subscribers.add(new Subscriber("room1", "B", mSubject));
		
		subscribers.add(new Subscriber("room2", "C", mSubject));
		subscribers.add(new Subscriber("room2", "D", mSubject));
		
		mSubject.sendBroadMessages();
		System.out.println();
		
		mSubject.sendMultiMessage("room1", "A", "Hi~ I'm A");
		System.out.println();
		mSubject.sendMultiMessage("room2", "C", "Hi~ I'm C");
	}
}
