package lab4;

public class CreditCard {
	
	private double amount;
	private double balance = 0.0;	
	private String date;
	private String type;
	private String vendor;
	
	
	public CreditCard(String date,String type,String vendor,double amount) {
		this.date = date;
		this.type = type;
		this.vendor = vendor;
		this.amount = amount;		
	}
	
	public String getDate() {
		return date;
	}
	
	public String getType() {
		return type;
	}
	
	public String getVendor() {
		return vendor;
	}
	
	public double getAmount() {
		return amount;
	}	
	
	public double balance() {
		
		if(type.equalsIgnoreCase("CREDIT") ) {
			balance = balance + amount;
		}
		else if(type.equalsIgnoreCase("DEBIT")) {
			balance = balance - amount;
		}
		
		return balance;
	}
	
	public static void finalBalance(double finalBalance) {	//static to access directly
	
		if(finalBalance > 0) {
			
			System.out.printf("\nYou have a balance of $%.2f\n",finalBalance);
			System.out.print("You are charged a 10% fee of ");
			System.out.printf("$%.2f",finalBalance*.10);
			System.out.printf("\nYour new balance is $%.2f\n", finalBalance*1.1);
			System.out.println("\n===");
		}
		else if(finalBalance == 0) {
			System.out.println("Thank you for your payment.\n\n===");			
		}
		else if(finalBalance < 0) {
			System.out.println("Thank you for your payment");
			System.out.println("Overpayment $" + finalBalance + "\n\n===");
		}
	}
	
	public String toString() {
		return ("Date: \t" + date + "\nType: \t" + type +
				"\nVendor: " + vendor + "\namount: $" + amount);
	}

}
