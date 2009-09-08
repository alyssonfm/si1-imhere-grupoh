import java.util.List;


public class Mesage implements MesageInterface{
	private String sender;
	private List <String> receiver;
	private String title;
	private String mesage;
	
	public Mesage(String sender, String receiver, String mesage, String title) {
		this.sender = sender;
		this.addReceiver(receiver);
		this.mesage = mesage;
		this.title = title;
		
	}
	
	public void addReceiver(String receiver) {
		this.receiver.add(receiver);
	}

	public List<String> getReceiver() {
		return receiver;
	}
	public void setReceiver(List<String> receiver) {
		this.receiver = receiver;
	}
	public String getMesage() {
		return mesage;
	}
	public void setMesage(String mesage) {
		this.mesage = mesage;
	}
	public String getSender() {
		return sender;
	}
	public String getTitle() {
		return title;
	}
	
	
	
	
	
}
