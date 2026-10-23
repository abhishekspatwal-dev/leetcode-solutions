/\*

&#x20;\* LeetCode 14: Longest Common Prefix

&#x20;\* Link: https://leetcode.com/problems/longest-common-prefix/

&#x20;\* Approach: Pehli string ko prefix maano, har agli string ke liye

&#x20;\*           prefix tab tak chhota karo jab tak string uss se shuru na ho.

&#x20;\* Time: O(S) jahan S = saari strings ke characters ka total, Space: O(1)

&#x20;\*/



**class Solution {**

&#x20;   **public String longestCommonPrefix(String\[] strs) {**

&#x20;       **String first = strs\[0];**

&#x20;       **for(int i=0;i<first.length();i++)**

&#x20;       **{**

&#x20;           **char ch = first.charAt(i);**



&#x20;           **for(int j=1;j<strs.length;j++)**

&#x20;           **{**

&#x20;               **if(i>=strs\[j].length() || strs\[j].charAt(i) != ch)**

&#x20;               **{**

&#x20;                   **return first.substring(0,i);**

&#x20;               **}**

&#x20;           **}**

&#x20;       **}**

&#x20;       **return first;**

&#x20;   **}**

**}


1. Pehli string ko reference maan sakte ho.**

**2. Baaki strings ke saath uske characters ko left se right compare karo.**

**3. Jab tak characters same hain, common prefix mein unhe include karte jao.**

**4. Jaise hi koi character different mile, comparison stop kar do.**

**5. Agar pehla character hi different ho, toh empty string "" return karni hogi.**

