package Tests;
public class ImHereSystemFacade {

	public void zerarSistema() {

	}

	public void criarUsuario(String userName, String nome, String email,
			String senha, String telefone) {

	}

	public String getUsuarioPorNome(String nome, String id) {
		return null;
	}

	public void atualizarUsuario(String id, String atributo, String valor) {

	}

	public void encerrarSistema() {

	}

	public void obterLocalizacao(String usuario) {

	}

	public void removerUsuario(String id) {

	}

	public String getAtributoUsuario(String id, String atributo) {
		return null;
	}

	public String estaConectado(String usuario) {
		return null;
	}

	public String login(String userName, String senha, String ip) {
		return null;
	}

	public void logout(String id) {

	}

	public String cadastrarUsuario(String userName, String nome, String email,
			String senha, String telefone, String ip) {
		return null;
	}

	public void getLocalizadores() {

	}

	public void setLocalizacao(String usuario, String latitude, String longitude) {

	}

	public String getLocalizacao(String usuario) {
		return null;
	}

	public void initMensageiro(String sistema) {

	}

	public void setDiretorioGabaritos(String valor) {

	}

	public void enviarConvite(String de, String para) {

	}

	public void confirmarCompartilhamento(String de, String com, String modo) {

	}

	public void recusarCompartilhamento(String de, String com) {

	}

	public String getAmigos(String usuario) {
		return null;
	}

	public void possoVerLocalizacao(String usuario, String amigo) {

	}

	public void setCompartilhamento(String usuario, String amigo, String modo) {

	}

	public void removerAmigo(String usuario, String amigo) {

	}

	public String getLocalizacaoAmigo(String usuario, String amigo) {
		return null;
	}

	public String enviarEmail(String de, String para, String assunto, String msg) {
		return null;
	}

	public String enviarSMS(String de, String para, String msg) {
		return null;
	}
	
	public void setPortChat(String port) {
		
	}
	
	public void initChat(String usuario1, String usuario2) {
		
	}
	
	public void enviarMensagem(String para, String msg) {
		
	}
	
	public String receberMensagem(String de) {
		return null;
	}
	
	public void encerrarChat(String usuario1, String usuario2) {
		
	}
}
