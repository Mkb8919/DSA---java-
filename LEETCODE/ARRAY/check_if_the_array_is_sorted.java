/*
1752 - CHECK IF ARRAY IS SORTED AND ROTATED
Easy
Topics
premium lock icon
Companies
Hint

Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.



Example 1:

Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the element of value 3: [3,4,5,1,2].
Example 2:

Input: nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.
        Example 3:

Input: nums = [1,2,3]
Output: true
Explanation: [1,2,3] is the original sorted array.
You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.


Constraints:

        1 <= nums.length <= 100
        1 <= nums[i] <= 100

 */



public class check_if_the_array_is_sorted {

    class Solution {
        public boolean check(int[] nums) {
            int count = 0;
            int n = nums.length;

            for (int i = 0; i < n; i++) {
                int next = (i + 1) % n;
                if (nums[i] > nums[next]) {
                    count++;
                }
            }

            return count <= 1;
        }
    }

}
