

/*
Medium
Topics
premium lock icon
Companies

Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.



Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
Example 3:

Input: nums = [1,0,1,2]
Output: 3


Constraints:


 */

import java.util.HashSet;


public class Longest_consecutive_sequence_128 {

    class Solution {
        public int longestConsecutive(int[] nums) {
            HashSet<Integer> set = new HashSet<>();

            // Step 1: Add all elements to HashSet
            for (int num : nums) {
                set.add(num);
            }

            int longestStreak = 0;

            // Step 2: Loop through each number
            for (int num : set) {
                // Only check for start of sequence
                if (!set.contains(num - 1)) {
                    int currentNum = num;
                    int currentStreak = 1;

                    // Count how long the sequence continues
                    while (set.contains(currentNum + 1)) {
                        currentNum++;
                        currentStreak++;
                    }

                    // Update longest streak
                    longestStreak = Math.max(longestStreak, currentStreak);
                }
            }

            return longestStreak;
        }

        public  void main(String[] args) {
            int[] arr = {100, 4, 200, 1, 3, 2};
            System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(arr));
        }
    }
}
