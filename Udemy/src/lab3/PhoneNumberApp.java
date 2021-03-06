/*
 * read a text file and will retrieve phone number
-valid phone number
-10 digits long
-area code cannot start in 0 or 9
-there cannot be 911 in the phone number
 */

package lab3;

import java.io.*;

public class PhoneNumberApp {
	
	
	public static void main(String[] args) {
		
		String fileName = "PhoneNumber.dat";
		File file = new File(fileName);		
		String[] phoneNums = new String[9];
		String phoneNum = null;
		
		try {
			
			BufferedReader ph = new BufferedReader(new FileReader(file));
			
			for(int i=0; i<phoneNums.length; i++) {
				
				phoneNums[i] = ph.readLine();
			}			
			
			ph.close();
			
		}catch(FileNotFoundException e){
			
			System.out.println("Error: " + file + "file not found");
			
		}catch(IOException e) {
			
			System.out.println("Error: Not able to read " + file);
		}
		
		for(int i=0; i<phoneNums.length; i++) {
			try {
				phoneNum = phoneNums[i];
				
				if(phoneNum.length() != 10) {
					
					throw new TenDigitsException(phoneNum);
				}
				if((phoneNum.substring(0, 1).equals("0"))||(phoneNum.substring(0, 1).equals("9"))) {
					
					throw new AreaCodeException(phoneNum);
				}
				for(int n=0; n<phoneNum.length()-2;n++) {
					
					if(phoneNum.substring(n, n+1).equals("9")) {
						
						if(phoneNum.substring(n+1, n+3).equals("11")) {
							
							throw new EmergencyException(phoneNum);
						}
					}
				}
				
				System.out.println(phoneNum);			
			}catch(TenDigitsException e) {
				
				System.out.println("Error: phone number is more/less than 10 digits");
			
			}catch(AreaCodeException e) {
			
				System.out.println("Error: invalid area code");
			
			}catch(EmergencyException e) {
			
				System.out.println("Error: Invalid emergency 911 sequence found!");
			}
		}		

	}
}

class TenDigitsException extends Exception{
	String num;
	
	TenDigitsException(String num){
		this.num = num;
	}
	
	public String toString() {
		return "Error: More than 10 digits number";
	}
	
}

class AreaCodeException extends Exception{
	String num;
	
	AreaCodeException(String num){
		this.num = num;
	}
	
	public String toString() {
		return "Error: Invalid area code";
	}
}

class EmergencyException extends Exception{
	String num;
	
	EmergencyException(String num){
		this.num = num;
	}
	
	public String toString() {
		return "Error: Invalid 911 sequence found";
	}
}

