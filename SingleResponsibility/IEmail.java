package SingleResponsibility;

public interface IEmail {
	public void setSender(String sender);
	public void setReceiver(String receiver);
	public void setContent(Content content);
}