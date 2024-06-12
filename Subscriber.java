package publisher_subscriber.subscriber;

import java.util.ArrayList;
import java.util.List;

import publisher_subscriber.Notification;
import publisher_subscriber.service.service;


public abstract class Subscriber {

	//store all messages received by the subscriber
		private List<Notification> subscriberMessages = new ArrayList<Notification>();
		
		public List<Notification> getSubscriberMessages() {
			return subscriberMessages;
		}
		public void setSubscriberMessages(List<Notification> subscriberMessages) {
			this.subscriberMessages = subscriberMessages;
		}
		
		//Add subscriber with PubSubService for a topic
		public abstract void Subscribe(String topic, service pubSubService);
		
		//Unsubscribe subscriber with PubSubService for a topic
		public abstract void unSubscribe(String topic, service pubSubService);
		
		//Request specifically for messages related to topic from PubSubService
		public abstract void getMessagesForSubscriberOfTopic(String topic, service pubSubService);
		
		//Print all messages received by the subscriber 
		public void printMessages(){
			for(Notification message : subscriberMessages){
				System.out.println("Message Topic -> "+ message.getTopic() + " : " + message.getPayload());
			}
		}
	}
