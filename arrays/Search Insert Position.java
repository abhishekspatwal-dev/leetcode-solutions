/*
 * LeetCode 35: Search Insert Position
 * Link: https://leetcode.com/problems/search-insert-position/
 * Approach 1 (brute force): target se chhote elements ginte jao. O(n)
 * Approach 2 (optimal): binary search. O(log n)
 */


class Solution {
    public int searchInsert(int[] nums, int target) {
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<target)
            {
                k++;
            }
        }
        return k;
    }
}