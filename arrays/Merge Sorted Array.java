/*
 * LeetCode 88: Merge Sorted Array
 * Link: https://leetcode.com/problems/merge-sorted-array/
 * Approach 1 (brute force): sab ek list me daalo aur sort karo. O((m+n) log(m+n)), O(m+n) space
 * Approach 2 (optimal): 3 pointers, peeche se bade element rakhte jao.
 * Time: O(m+n), Space: O(1)
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            arr.add(nums1[i]);
        }
        for(int i=0;i<n;i++)
        {
            arr.add(nums2[i]);
        }
        Collections.sort(arr);
        for(int i=0;i<n+m;i++)
        {
            nums1[i] = arr.get(i);
        }
    }
}

