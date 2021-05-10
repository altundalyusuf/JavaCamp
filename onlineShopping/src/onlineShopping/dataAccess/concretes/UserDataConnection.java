package onlineShopping.dataAccess.concretes;


import java.util.ArrayList;
import java.util.List;

import onlineShopping.dataAccess.abstracts.UserDao;
import onlineShopping.entities.concretes.User;


public class UserDataConnection implements UserDao {
	
	public List<String> eMailList = new ArrayList<String>();

	@Override
	public void addEmail(User user) {
		String mailKeeper = user.geteMail();
		eMailList.add(mailKeeper);		
	}

	@Override
	public void deleteEmail(User user) {
		String mailKeeper = user.geteMail();
		eMailList.remove(mailKeeper);
	}

	@Override
	public List<String> showEmailList() {
		return eMailList;
		
	}
	
}
