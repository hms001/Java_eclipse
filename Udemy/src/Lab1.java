//function that takes a value n returns the sum of numbers 1 to n
public class Lab1 {

	public static void main(String[] args) {
		
		System.out.println(sumNum(4));
	}
	
	public static int sumNum(int n) {
		int sum = 0;
		for(int i=1; i <= n ; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
