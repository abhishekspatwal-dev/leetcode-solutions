/*
 * LeetCode 1: Two Sum
 * Link: https://leetcode.com/problems/two-sum/
 * Approach: HashMap me value -> index store karo, complement check karo.
 * Time: O(n), Space: O(n)
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int j=0;j<nums.length;j++)
        {
            for(int i=j+1;i<nums.length;i++)
            {
                if(nums[i]+nums[j]== target)
                {
                    arr[0]=j;
                    arr[1]=i;
                    return arr;
                }
            }
        }
        return arr;
    }
}