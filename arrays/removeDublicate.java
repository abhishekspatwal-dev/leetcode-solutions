/*
 * LeetCode 27: Remove Element
 * Link: https://leetcode.com/problems/remove-element/
 * Approach: Two pointers. k wo jagah hai jahan agla valid element likhna hai.
 *           Har element jo val ke barabar nahi, usse nums[k] par likho.
 * Time: O(n), Space: O(1)
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == val)
            {
                count++;
            }
            else
            {
                nums[i-count]=nums[i];
            }
        }
        k=nums.length-count;
        return k;
    }
}

