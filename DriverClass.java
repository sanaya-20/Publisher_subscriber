package publisher_subscriber;

import publisher_subscriber.publisher.Publisher;
import publisher_subscriber.publisher.PublisherImpl;
import publisher_subscriber.service.service;
import publisher_subscriber.subscriber.Subscriber;
import publisher_subscriber.subscriber.SubscriberImpl;

public class DriverClass {
	public static void main(String[] args) {

		Publisher fruitPublisher = new PublisherImpl();
		Publisher AnimalPublisher = new PublisherImpl();
		
		Subscriber fruitSubscriber = new SubscriberImpl();
		Subscriber SubscribertoAll = new SubscriberImpl();
		Subscriber AnimalSubscriber = new SubscriberImpl();
		Subscriber SubjectsSubscriber = new SubscriberImpl();
		
		service pubSubService = new service();
	
		Notification FruitsMsg = new Notification("Fruits", "Apple, Mango");
		Notification AnimalsMsg = new Notification("Animals", "Cat is my favourite animal!");
		Notification SubjectsMsg = new Notification("Subjects", "I hate Math really.");
		
		fruitPublisher.Notify(FruitsMsg, pubSubService);
		fruitPublisher.Notify(AnimalsMsg, pubSubService);
		fruitPublisher.Notify(SubjectsMsg, pubSubService);
		
		Notification FruitsMsg2 = new Notification("Fruits", "Do you know different fruits?");
		Notification AnimalsMsg2 = new Notification("Animals", "Dogs are nice too!");
		
		AnimalPublisher.Notify(FruitsMsg2, pubSubService);
		AnimalPublisher.Notify(AnimalsMsg2, pubSubService);
		
		fruitSubscriber.Subscribe("Fruits",pubSubService);		
		AnimalSubscriber.Subscribe("Animals",pubSubService);   
		SubscribertoAll.Subscribe("Animals", pubSubService);	
		SubjectsSubscriber.Subscribe("Subjects", pubSubService);
		
		pubSubService.notifytoall();
		
		System.out.println("Messages of Fruits Subscriber are: ");
		fruitSubscriber.printMessages();
		
		System.out.println("\nMessages of Animals Subscriber are: ");
		AnimalSubscriber.printMessages();
		
		System.out.println("\nMessages of All Subscribers are: ");
		SubscribertoAll.printMessages();
		
		//After broadcast the messagesQueue will be empty, so publishing new messages to server
		System.out.println("\nPublishing 2 more Messages...");
		Notification MsgNew = new Notification("Fruits", "Healthy!");
		Notification MsgNew2 = new Notification("Subjects", "Computer Science is blooming");
		
		fruitPublisher.Notify(MsgNew, pubSubService);
		fruitPublisher.Notify(MsgNew2, pubSubService);
		
		fruitSubscriber.getMessagesForSubscriberOfTopic("Fruits", pubSubService);
		System.out.println("\nMessages of Fruits Subscriber now are: ");
		fruitSubscriber.printMessages();		
	}
}