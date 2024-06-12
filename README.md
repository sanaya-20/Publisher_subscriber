# PubSub System

This project implements a simple Pub/Sub (Publisher/Subscriber) system in Java. The Pub/Sub system allows publishers to publish messages to specific topics, and subscribers to subscribe to those topics and receive the messages. This project demonstrates the basic concepts of the Pub/Sub architecture, including publishing messages, subscribing to topics, and broadcasting messages to all relevant subscribers.

## Project Structure

The project consists of the following main components:

- **Publisher**: Publishes messages to the PubSubService.
- **Subscriber**: Subscribes to topics and receives messages from the PubSubService.
- **PubSubService**: Manages subscriptions and message broadcasting.
- **Notification**: Represents the messages that will be published and subscribed to, containing a topic and a content.
- **DriverClass**: Demonstrates the usage of the PubSub system.

### Publisher

The `Publisher` interface defines the method for publishing messages. The `PublisherImpl` class implements this interface.

- `Publisher.java`
- `PublisherImpl.java`

### Subscriber

The `Subscriber` abstract class defines methods for subscribing and unsubscribing to topics, and for receiving messages. The `SubscriberImpl` class extends this abstract class and provides concrete implementations of the methods.

- `Subscriber.java`
- `SubscriberImpl.java`

### PubSubService

The `PubSubService` class manages the subscriptions and message broadcasting. It stores the messages in a queue and distributes them to the appropriate subscribers.

- `service.java`

### Notification

The `Notification` class represents the messages that are published and subscribed to. It contains a topic and a payload.

- `Notification.java`

### DriverClass

The `DriverClass` demonstrates the usage of the PubSub system. It sets up publishers, subscribers, and publishes messages to the PubSubService.



## I have taken examples of Topics of Fruits, Animals and Subjects with various notifications and messages related to it. 
