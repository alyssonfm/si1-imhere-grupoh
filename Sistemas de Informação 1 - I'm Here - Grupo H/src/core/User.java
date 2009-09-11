package core;

import java.util.List;


public class User implements UserIntarface{
	private String userName;
	private String name;
	private String email;
	private String password;
	private String phone;
	private String id;
	private List <UserIntarface> friends;
	private Position position;  //Entra a parte do GeoIp ou GPS...
	private List <MessageInterface> messages;
	
	public User (String userName, String name, String email,
			String password, String phone) {
		
		this.userName = userName;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Position getPosition(){
		return position;
	}
	
	public void setPosition(Position position){
		this.position = position;
	}

	public String getSenha() {
		return password;
	}

	public void setSenha(String senha) {
		this.password = senha;
	}

	public String getTelefone() {
		return phone;
	}

	public void setTelefone(String telefone) {
		this.phone = telefone;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}

	public String getId() {
		return this.id;
	}
	
	public void addAmigo(UserIntarface amigo){
		friends.add(amigo);
	}
	
	public void removeAmigo(UserIntarface amigo){
		friends.remove(amigo);
	}
	
	public void addMensagem (MessageInterface msg){
		messages.add(msg);
	}
	
	public void removeMensagem(MessageInterface msg){
		messages.remove(msg);
	}
}
