/*
 * Read a credit card CSV statement
 * Creating a balance variable that calculates the running balance of the user�s account
 * If the field says CREDIT, then add the amount to the balance
 * If the field says DEBIT, then subtract the amount to the balance
 * If the final amount is greater than zero, charge a 10% fee and warn the user
 * If the final amount is zero, thank the user for their payments
 * If the final amount is less than zero, thank the user for their payment and display their overpayment.
 */

package lab4;

import java.io.*;
import java.util.ArrayList;

public class CardStatement {

	public static void main(String[] args) {
		
		String fileName = "CreditStatement.csv";
		File file = new File(fileName);
		ArrayList<CreditCard> card = new ArrayList<CreditCard>();
		String cards;
		double finalBalance = 0.0;	
				
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((cards = br.readLine()) != null) {
				String[] line = cards.split(",");
				String date = line[0];
				String type = line[1];
				String vendor = line[2];
				double amount = Double.parseDouble(line[3]);
				card.add(new CreditCard(date,type,vendor,amount));
			}
			br.close();
		}catch(FileNotFoundException e) {
			System.out.println("Error: unable to find the file");
		}catch(IOException e) {
			System.out.println("Error: unable to read file");
		}
		
		for(CreditCard stmt : card) {
			
			finalBalance = finalBalance + stmt.balance();			
			System.out.printf("%s\t%s\t%s\t$%3.2f\t$%3.2f\n",
					stmt.getDate(),stmt.getType(),stmt.getVendor(),stmt.getAmount(),finalBalance);
									
		}
		CreditCard.finalBalance(finalBalance);
	}

}
