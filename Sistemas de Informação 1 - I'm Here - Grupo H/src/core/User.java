package core;

import java.util.List;


public class User implements UserIntarface{
	private String userName;
	private String name;
	private String email;
	private String password;
	private String phone;
	private String id;
	private List <UserIntarface> amigos;
	private Local localizacao;  //Entra a parte do GeoIp ou GPS...
	private List <MesageInterface> mensagens;
	
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
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
		amigos.add(amigo);
	}
	
	public void removeAmigo(UserIntarface amigo){
		amigos.remove(amigo);
	}
	
	public void addMensagem (MesageInterface msg){
		mensagens.add(msg);
	}
	
	public void removeMensagem(MesageInterface msg){
		mensagens.remove(msg);
	}
}
