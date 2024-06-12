package publisher_subscriber.service;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import publisher_subscriber.Notification;
import publisher_subscriber.subscriber.Subscriber;

public class service {
	Map<String, Set<Subscriber>> TopicSet = new HashMap<String, Set<Subscriber>>();
 
	Queue<Notification> notifQueue = new LinkedList<Notification>();

	public void addMessageToQueue(Notification topic){
		notifQueue.add(topic);
	}
 
	public void addSubscriber(String topic, Subscriber subscriber){
 
		if(TopicSet.containsKey(topic)){
			Set<Subscriber> subscribers = TopicSet.get(topic);
			subscribers.add(subscriber);
			TopicSet.put(topic, subscribers);
		}else{
			Set<Subscriber> subscribers = new HashSet<Subscriber>();
			subscribers.add(subscriber);
			TopicSet.put(topic, subscribers);
		}		
	}
	public void removeSubscriber(String topic, Subscriber subscriber){
 
		if(TopicSet.containsKey(topic)){
			Set<Subscriber> subscribers = TopicSet.get(topic);
			subscribers.remove(subscriber);
			TopicSet.put(topic, subscribers);
		}
	}

	public void notifytoall(){
		if(notifQueue.isEmpty()){
			System.out.println("No messages from publishers to display");
		}else{
			while(!notifQueue.isEmpty()){
				Notification message = notifQueue.remove();
				String topic = message.getTopic();
 
				Set<Subscriber> subscribersOfTopic = TopicSet.get(topic);
 
				for(Subscriber subscriber : subscribersOfTopic){

					List<Notification> subscriberMessages = subscriber.getSubscriberMessages();
					subscriberMessages.add(message);
					subscriber.setSubscriberMessages(subscriberMessages);
				}			
			}
		}
	}
 
	public void getMessagesForSubscriberOfTopic(String topic, Subscriber subscriber) {
		if(notifQueue.isEmpty()){
			System.out.println("No messages from publishers to display");
		}else{
			while(!notifQueue.isEmpty()){
				Notification message = notifQueue.remove();
 
				if(message.getTopic().equalsIgnoreCase(topic)){
 
					Set<Subscriber> subscribersOfTopic = TopicSet.get(topic);
 
					for(Subscriber _subscriber : subscribersOfTopic){
						if(_subscriber.equals(subscriber)){
							List<Notification> subscriberMessages = subscriber.getSubscriberMessages();
							subscriberMessages.add(message);
							subscriber.setSubscriberMessages(subscriberMessages);
						}
					}
				}
			}
		}
	} 
}