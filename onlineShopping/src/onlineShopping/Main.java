package onlineShopping;



import onlineShopping.business.abstracts.UserService;
import onlineShopping.business.concretes.UserManager;
import onlineShopping.core.concretes.GoogleEnterenceAdapter;
import onlineShopping.dataAccess.concretes.UserDataConnection;
import onlineShopping.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService a = new UserManager(new UserDataConnection(),new GoogleEnterenceAdapter());
		User user = new User("yusuf", "adac", "yusuf@gmail.com", "22241241");	
		User user2 = new User("Ali","Bfg","yusuf@gmail.com","22241241");
		a.registration(user);
		System.out.println();
		a.registration(user2);
		System.out.println();
		a.registerWithGoogle(user2);
		System.out.println();
		a.signIn(user,"yusuf@gmail.com","22241241");
		
				
		
	}

}
