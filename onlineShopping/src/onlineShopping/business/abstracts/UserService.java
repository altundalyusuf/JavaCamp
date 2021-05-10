package onlineShopping.business.abstracts;


import onlineShopping.entities.concretes.User;

public interface UserService {
	public boolean registration(User user);
	public void registerWithGoogle(User user);
	public void signIn(User user, String email, String password);
}
