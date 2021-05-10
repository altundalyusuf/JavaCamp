package onlineShopping.dataAccess.abstracts;

import java.util.List;

import onlineShopping.entities.concretes.User;

public interface UserDao {
	
	public void  addEmail(User user);
	public void deleteEmail(User user);
	public List<String> showEmailList();
	
}
