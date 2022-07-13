package bookstore;

public class Purchase extends ShoppingCart {
	private String purchaseDate;
	private String shippingDate;
	private int deliveryLength;
	
// Constructor
	public Purchase (String purchaseDate, String shippingDate, int deliveryLength ) {
		setPurchaseDate(purchaseDate);
		setShippingDate(shippingDate);
		setDeliveryLength(deliveryLength);
	}
	
	

	//Getter and Setter methods
	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getShippingDate() {
		return shippingDate;
	}

	public void setShippingDate(String shippingDate) {
		this.shippingDate = shippingDate;
	}

	public int getDeliveryLength() {
		return deliveryLength;
	}

	public void setDeliveryLength(int deliveryLength) {
		if (deliveryLength>0) {
		this.deliveryLength = deliveryLength;
		}
	}
	
// Other methods
	
	public double getTotalPaymenet() {
		double totalPayment=0;
		for (int i=0; i< getNumEntriesInCart(); i++) {
			totalPayment += getContents()[i].getPrice();
		}
		return totalPayment;
		
	}
	
// toString method
	public String toString() {
		String res = super.toString() +
				"Purchase date:  " + this.purchaseDate + "\n" +
				" Shipping date:  " + this.shippingDate+ "\n" +
				"Estimated Delivery length in day " + this.deliveryLength + "\n";
		return res;
	}
}
