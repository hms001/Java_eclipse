package lab3;

import java.io.*;

public class PasswordLibrary {

	public static void main(String[] args) {
		
		String fileName= "PasswordLib.dat";
		File file = new File(fileName);
		String[] pwds = new String[13];
		String pwd = null;		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for(int i=0 ; i<pwds.length; i++) {
				pwds[i] = br.readLine();
			}			
			br.close();
		}catch(FileNotFoundException e) {
			System.out.println("Error: File not found");
		}catch(IOException e) {
			System.out.println("Error: Unable to read file");
		}
		 
		for(int i=0; i<pwds.length; i++) {
			try {
				int digit = 0;
				int letter = 0;
				int special = 0;
				pwd = pwds[i];	//assign each password
				for(int j=0; j<pwd.length(); j++) {
					char check = pwd.charAt(j);	//assign each character of password
					
					if(Character.isDigit(check)) {	
						digit++;	//increase count if password includes a number			
					}
					
					if(Character.isLetter(check)) {	
						letter++;	//increase count if password includes a letter				
					}
					//ASCII table special character no.
					if(check>=33&&check<=47||check>=58&&check<=64) { 
						special++;	//increase count if password includes a special character
					}					
				}				
			//check password is more than 8 character			
			if(pwd.length() < 8) {					
				throw new EightDigitsException(pwd);
			}
			//check password has a number
			if(digit<1) {
				throw new NumberException(pwd);
			}
			//check password has a letter
			if(letter<1) {
				throw new LetterException(pwd);
			}
			//check password has a special character
			if(special<1) {
				throw new SpecialCharException(pwd);
			}
			System.out.println(pwd);
			}catch(EightDigitsException e) {
				System.out.println("Error: Password length should have at least 8 characters");
			}catch(NumberException e) {
				System.out.println("Error: Password should have at least 1 number");
			}catch(LetterException e) {
				System.out.println("Error: Password should have at least 1 letter");
			}catch(SpecialCharException e) {
				System.out.println("Error: Password should have at least 1 special character");
			}
		}		
	}
}

class EightDigitsException extends Exception{
	
	String input;
	
	EightDigitsException(String input){
		this.input = input;
	}

	@Override
	public String toString() {
		return "EightDigitsException [password is only " + input.length() + " digits long";
	}		
}

class NumberException extends Exception{
	
	String input;
	
	NumberException(String input){
		this.input = input;
	}

	@Override
	public String toString() {
		return "NumberException [password should include at least a number]";
	}		
}

class LetterException extends Exception{
	
	String input;
	
	LetterException(String input){
		this.input = input;
	}

	@Override
	public String toString() {
		return "LetterException [password should include at least a letter]" ;
	}	
}

class SpecialCharException extends Exception{
	
	String input;
	
	SpecialCharException(String input){
		this.input = input;
	}

	@Override
	public String toString() {
		return "SpecialCharException [password should include at least 1 special character";
	}	
	
}
