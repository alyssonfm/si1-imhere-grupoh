package Tests;

import java.util.ArrayList;
import java.util.List;
import easyaccept.EasyAcceptFacade;

public class ImHereSystemTestClient {

	public static void main(String[] args) throws Exception {

		List<String> arquivos = new ArrayList<String>();

		arquivos.add("test/us1.txt");
		arquivos.add("test/us2.txt");
		arquivos.add("test/us3.txt");
		arquivos.add("test/us4.txt");
		arquivos.add("test/us5.txt");
		arquivos.add("test/us6.txt");
		arquivos.add("test/us7_1.txt");
		arquivos.add("test/us7_2.txt");
		arquivos.add("test/us7_3.txt");

		ImHereSystemFacade sistemaFachada = new ImHereSystemFacade();

		EasyAcceptFacade eaFacade = new EasyAcceptFacade(sistemaFachada, arquivos);
		eaFacade.executeTests();

		System.out.println(eaFacade.getCompleteResults());

	}

}