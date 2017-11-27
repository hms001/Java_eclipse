/*Creating java program to read in two integer numbers from the console and 
  display a random integer number generated between these two numbers*/

import java.util.*;
public class Ques8 {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		Random generator = new Random();
		
		System.out.println("Enter Number Range");
		System.out.print("First number: ");
		int first = myScanner.nextInt();				
		System.out.print("Second number: ");				
		int second = myScanner.nextInt();
		
		/*generate a random number in the range between first and 
		second number (inclusive first < second)*/
		int result = generator.nextInt(second-first+1)+ first;	
		System.out.println("Random Number: " + result);
		

	}

}
