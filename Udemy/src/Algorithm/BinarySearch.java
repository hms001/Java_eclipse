package Algorithm;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = {12,15,17,20,28,36,39,45,51,60,85};
		Binary.search(nums, 85, 0, nums.length);
	}

}

class Binary{
	
	public static int search(int[] num, int target, int start, int end) {
		
		System.out.println("Searching between position "+ start + " and " + end);
		int medium = (int) Math.floor(((start + end)/2));
		int value = num[medium];
		
		if(target > value) {
			System.out.println(target + " > " + value);
			return search(num,target,(medium+1),end);
		}
		else if(target < value) {
			System.out.println(target + " < " + value);
			return search(num,target,start,(medium-1));
		}
		System.out.println(target + " = " + value);
		System.out.println("Found "+ target + " at position "+ medium );
		return medium;
	}
}
