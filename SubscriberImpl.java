package publisher_subscriber.subscriber;
import publisher_subscriber.service.service;

public class SubscriberImpl extends Subscriber {

	//Add subscriber with PubSubService for a topic
		public void Subscribe(String topic, service pubSubService){
			pubSubService.addSubscriber(topic, this);
		}
		
		//Unsubscribe subscriber with PubSubService for a topic
		public void unSubscribe(String topic, service pubSubService){
			pubSubService.removeSubscriber(topic, this);
		}

		//Request specifically for messages related to topic from PubSubService
		public void getMessagesForSubscriberOfTopic(String topic, service pubSubService) {
			pubSubService.getMessagesForSubscriberOfTopic(topic, this);
			
		}	

}
