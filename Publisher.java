package publisher_subscriber.publisher;
import publisher_subscriber.Notification;
import publisher_subscriber.service.service;

public interface Publisher {

	void Notify(Notification id, service pubsubService);

}
