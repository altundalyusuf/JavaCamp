package adaptors;

import java.rmi.RemoteException;

import abstractFolder.*;
import entitiy.*;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapStub;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		
		boolean result=false;
		try {
			result=client.TCKimlikNoDogrula(
						Long.valueOf(customer.nationalityId), 
						customer.firstName, 
						customer.lastName, 
						customer.dateOfBirth.getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
		
		
	}

}
