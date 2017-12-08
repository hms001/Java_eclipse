package Algorithm;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int[] nums = {12,15,17,20,28,36,39};
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter the number to search: ");
		int in = input.nextInt();
		Linear.search(nums,in);
	}

}

class Linear{
	
	public static void search(int[] num, int target) {
		
		for(int i=0; i<num.length; i++) {
			int n = num[i];
			if(n == target) {
				System.out.println("Found " + n + " at " + "position " + i);
			}
		}
		
	}	
}
