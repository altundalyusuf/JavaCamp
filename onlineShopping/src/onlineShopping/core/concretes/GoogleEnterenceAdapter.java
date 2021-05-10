package onlineShopping.core.concretes;

import googleServices.GoogleEnterence;
import googleServices.GoogleService;
import onlineShopping.core.abstracts.GoogleEnterenceAdapterService;

public class GoogleEnterenceAdapter implements GoogleEnterenceAdapterService {

		
	@Override
	public void enterWithGoogle() {
		GoogleService google = new GoogleEnterence();
		google.registerWithGoogleAccount();
		
	}
	
}
