/*Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false*/

package algorithm;

public class ContainsNearbyDuplicate {

	public static void main(String[] args) {
		/*[1,2,3,1,2,3]
			2*/
		int[] nums = {1,2,3,1,2,3};
		int k = 2;
		
		System.out.println(containsNearbyDuplicate(nums,k));
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j-i <= k; j++) {
				if(nums[i]==nums[j]) {
					return true;
				}
				if(j == nums.length-1) {
					break;
				}
			}
		}
		
		return false;
		
	}
}
