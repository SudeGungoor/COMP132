package shopping;

import bookstore.Purchase;
import bookstore.ShoppingCart;

public class Customer {
	private String userName;
	private String userSurname;
	private Purchase[] purchaseHistory;
	int purchaseCount=0;
	
// Constructor with two arguments
	public Customer(String userName, String userSurname) {
		this.userName = userName;
		this.userSurname = userSurname;
		purchaseHistory = new Purchase[2];
	}
// Getters and Setters for all non-array fields
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSurname() {
		return userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

	public int getPurchaseCount() {
		return purchaseCount;
	}

	public void setPurchaseCount(int purchaseCount) {
		this.purchaseCount = purchaseCount;
	}
	
	
	public boolean placePurchase (ShoppingCart current) {
		if (purchaseCount>1) {
			System.out.println("We cannot process your purchase for now! Please try again later");
			return false;
		}
		Purchase sc = (Purchase) current;
		purchaseHistory[purchaseCount] =  sc;
		purchaseCount++;
		return true;
	}
	
	public double getTotalAmountSpent() {
		int total = 0;
		for(Purchase p : purchaseHistory)
			if(p != null)
				total+=p.getTotalPaymenet();
		return total;
		
	}
// toString
	public String toString() {
	  String res = " ";
	  for (Purchase pu : purchaseHistory){
		  if(pu != null){
			  res += pu.toString();

		  }
		 
	  }
		return res; 
	}
	

}
