package publisher_subscriber;

public class Notification {	
	private String topicName;
	private String content;
	
	public Notification(){}	
	public Notification(String topicName, String content) {
		this.topicName = topicName;
		this.content = content;
	}
	public String getTopic() {
		return topicName;
	}
	public void setTopic(String topicName) {
		this.topicName = topicName;
	}
	public String getPayload() {
		return content;
	}
	public void setPayload(String content) {
		this.content = content;
	}
}