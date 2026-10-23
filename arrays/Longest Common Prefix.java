\*

\* LeetCode 14: Longest Common Prefix

\* Link: https://leetcode.com/problems/longest-common-prefix/

\* Approach: Pehli string ko prefix maano, har agli string ke liye

\* prefix tab tak chhota karo jab tak string uss se shuru na ho.

\* Time: O(S) jahan S = saari strings ke characters ka total, Space: O(1)

\*/



class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        for(int i=0;i<first.length();i++)
        {
            char ch = first.charAt(i);

            for(int j=1;j<strs.length;j++)
            {
                if(i>=strs[j].length() || strs[j].charAt(i) != ch)
                {
                    return first.substring(0,i);
                }
            }
        }
        return first;
    }
}


Step 2: Logic kaise sochna hai?
1. Pehli string ko reference maan sakte ho.
2. Baaki strings ke saath uske characters ko left se right compare karo.
3. Jab tak characters same hain, common prefix mein unhe include karte jao.
4. Jaise hi koi character different mile, comparison stop kar do.
5. Agar pehla character hi different ho, toh empty string "" return karni hogi.
