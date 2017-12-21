package Algorithm;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] nums = {70,54,12,50,100,89,39,45,76,27,43};
		
		System.out.println("Before sorted...");
		Bubble.bsort(nums);
		Bubble.sorting(nums);
		System.out.println("After sorted...");
		Bubble.bsort(nums);		
	}

}

class Bubble{
	
	public static void sorting(int[] nums) {
		
		for(int i=0; i<nums.length-1; i++) {
			int num;
			if(nums[i] > nums[i+1]) {
				num = nums[i];
				nums[i] = nums[i+1];
				nums[i+1] = num;					
				System.out.println("[Swapped " + nums[i+1] + " and " + nums[i] +"]");
				bsort(nums);
				sorting(nums);	//use recursive method
			}				
		}			
	}
	
	public static void bsort(int[] nums) {
		for(int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println("\n");
	}	
	
}