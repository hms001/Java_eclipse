/*
 * 3 functions that take an array as a parameter and return the minimum, average, 
 * and maximum values of that array
 */
public class Lab1Q3 {

	public static void main(String[] args) {
		
		int[] parameter = {10,22,8,13};
		int max = Maximum(parameter);
		int min = Minimum(parameter);
		int avg = Average(parameter);
		System.out.println("Maximum number of array is : " + max);
		System.out.println("Minimum number of array is : " + min);
		System.out.println("Average number of array is : " + avg);
	}
	
	public static int Maximum(int[] first) {
		int max = first[0];
		for(int i=0; i<first.length; i++) {
			if(first[i] > max) {
				max = first[i];
			}
		}
		return max;
	}
	
	public static int Minimum(int[] sec) {
		int min = sec[0];
		for(int i=0; i < sec.length; i++) {
			if(sec[i] < min) {
				min = sec[i];
			}
		}
		return min;
	}
	
	public static int Average(int[] third) {
		int avg = 0;
		for(int i=0; i<third.length; i++) {
			avg = avg+third[i];
		}
		return avg = avg/third.length;
	}

}
