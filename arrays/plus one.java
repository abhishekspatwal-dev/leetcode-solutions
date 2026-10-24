/*
 * LeetCode 66: Plus One
 * Link: https://leetcode.com/problems/plus-one/
 * Approach: Peeche se chalo. 9 se chhota digit mile to +1 karke return.
 *           9 mile to usse 0 karke aage badho. Sab 9 the to naya array [1,0,0...].
 * Time: O(n), Space: O(1)
 */

class Solution {
    public int[] plusOne(int[] digits) {
        
        for(int i=digits.length-1; i>=0; i--)
        {
            
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] arr = new int[digits.length +1];
        arr[0]=1;

        return arr;
    }
}

