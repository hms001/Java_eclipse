//function that computes the factorial value
public class Lab1Q2 {

	public static void main(String[] args) {
		int num = 7;
		for(int i=0; i <num; i++) {
			System.out.println("Factorial Number " + i +" is " + factorial(i));
			
		}

	}
	
	public static int factorial(int n) {
		
		if(n == 0) {
			return 1;
		}
		else {
			return (n*factorial(n-1));
		}

	}
}
