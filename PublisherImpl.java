package publisher_subscriber.publisher;
import publisher_subscriber.Notification;
import publisher_subscriber.service.service;

public class PublisherImpl implements Publisher {

	
	public void Notify(Notification id, service pubSubService) {		
		pubSubService.addMessageToQueue(id);

}
}
