package onlineShopping.business.concretes;


import java.util.Scanner;
import java.util.regex.Pattern;

import onlineShopping.business.abstracts.UserService;
import onlineShopping.core.abstracts.GoogleEnterenceAdapterService;
import onlineShopping.dataAccess.abstracts.UserDao;
import onlineShopping.entities.concretes.User;

public class UserManager  implements UserService {
	
	UserDao userDao;
	GoogleEnterenceAdapterService googleEnterenceAdapterService;
	
	
	public UserManager(UserDao userDao,GoogleEnterenceAdapterService googleEnterenceAdapterService) {
		super();
		this.userDao = userDao;
		this.googleEnterenceAdapterService = googleEnterenceAdapterService;
	}

	@Override
	public boolean registration(User user) {
		
		boolean registrationSuccessCheck = false;
		boolean click = true;
		
		if(user.getPassword().length() < 6) {
			System.out.println("Your password can not be less than 6 characters.");
			return false;
		}
		if(user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Your first name and last name can not be less than 2 characters. ");
			return false;
		}
		if(!eMailValidation(user)) {
			System.out.println("Your e-mail is incorrect.");
			return false;
		}
		
		if(!emailCheck(user)) {
			System.out.println("Dear "+ user.getFirstName() + " this e-mail is in use.");
			return false;
		}
		
		
		registrationSuccessCheck = true;
		userDao.addEmail(user);
		System.out.println("Your registration has been successfully done. Check your mail for the confirmation link.");
		eMailRegistrationCheck(click);
		return true;
		
	}
	
	public void registerWithGoogle( User user) {
		if(eMailValidation(user)) {
			googleEnterenceAdapterService.enterWithGoogle();
		}
		else {
			System.out.println("This is not your google e-mail.");
		}
		
	}
	
	public void signIn(User user, String email, String password) {			
		if(user.geteMail().equals(email) && user.getPassword().equals(password)) {	
			System.out.println("You've signed in.");
		}
		else {
			System.out.println("You've entered wrong informations.");
		}
	}
	
	public boolean eMailValidation(User user) {
		final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		
		Pattern pattern = Pattern.compile(EMAIL_PATTERN,
		Pattern.CASE_INSENSITIVE);
		return pattern.matcher(user.geteMail()).find();
		
		
	}
	
	public boolean emailCheck(User user) {	
		
		for (String mail : userDao.showEmailList() ) {
			if(mail.equals(user.geteMail())) {
				return false;
			}
		}
		return true;
	}
	
	public void eMailRegistrationCheck(boolean click) {
		
		if(click == true) {
			System.out.println("You've confirmed your e-mail. Your registration is done.");
		}
		
		else {
			System.out.println("You did not confirmed your e-mail yet.");
		}
		
	}

}
