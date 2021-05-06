package javaGame;

public interface OptionsForUser {	// Oyun için default, zorunlu olmasý gereken fonksiyonlar
	
	public void registertoGame(String firstName, String lastName, String nationalId, String bornYear, int money);
	
	public void updateFirstName(String firstName);
	public void updateLastName(String lastName);
	public void updateNationalId(String nationalId);
	public void updateBornYear(String bornYear);
	
	public void deleteAccount();
}
