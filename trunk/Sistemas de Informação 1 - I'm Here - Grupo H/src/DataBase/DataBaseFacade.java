package DataBase;

import core.UserIntarface;
import core.Position;
import core.MessageInterface;

import java.util.List;

public class DataBaseFacade {
	
	//Save one user in the Data Base (DB)
	public void saveUser(String userName, String name, String email,
			String phone, String id, List <UserIntarface> friends,
			Position localizacao, List<MessageInterface> messages){
		
	}
	
	//Check if one user there is in the DB. It'll be happen in the login
	public void checkUser(String userName, String password){
		
	}
	
}
