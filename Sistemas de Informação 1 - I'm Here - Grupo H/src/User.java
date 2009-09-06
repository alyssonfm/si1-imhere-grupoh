import java.util.List;

public class User implements InterfaceUser{
	private String userName;
	private String name;
	private String email;
	private String senha;
	private String telefone;
	private String id;
	private List <InterfaceUser> amigos;
	private Local localizacao;  //Entra a parte do GeoIp ou GPS...
	private List <Mesage> mensagens;
	
	public User (String userName, String name, String email,
			String senha, String telefone) {
		
		this.userName = userName;
		this.name = name;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
		
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

	//Precisa disso?
	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}
	
	public void addAmigo(InterfaceUser amigo){
		amigos.add(amigo);
	}
	
	public void removeAmigo(InterfaceUser amigo){
		amigos.remove(amigo);
	}
	
	public void addMensagem (Mesage msg){
		mensagens.add(msg);
	}
	
	public void removeMensagem(Mesage msg){
		mensagens.remove(msg);
	}
}
