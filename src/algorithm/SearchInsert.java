package algorithm;


/*
* Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:

Input: [1,3,5,6], 5
Output: 2
Example 2:

Input: [1,3,5,6], 2
Output: 1
Example 3:

Input: [1,3,5,6], 7
Output: 4
Example 4:

Input: [1,3,5,6], 0
Output: 0
* */

public class SearchInsert {

    public static void main(String[] args) {

        int[] nums = new int[]{1,3,5,6};

        System.out.println(searchInsert(nums,2));
    }

    public static int searchInsert(int[] nums, int target) {

        int result = 0;

        if(target < nums[0]){
            return 0;
        }

        for (int i =0; i < nums.length; i++){
            if(nums[i] == target){
                result = i;
                return result;
            }else if(nums[i]> target){
                result= i;
                return  result;
            }else {
                result = i+1;
            }
        }


        return result;
    }
}
