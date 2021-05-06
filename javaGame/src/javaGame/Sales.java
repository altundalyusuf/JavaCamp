package javaGame;

public class Sales implements SalesInterface {
	
	private int unitPrice;
	
	public Sales(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
		
	}

	


	
}
