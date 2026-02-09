/*
LeetCode 424 - Longest Repeating Character Replacement

Given a string s and integer k,
you can replace at most k characters.
Return the length of the longest substring
containing the same letter after replacements.
*/

class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0, maxCount = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            maxCount = Math.max(maxCount, ++freq[s.charAt(right) - 'A']);

            while (right - left + 1 - maxCount > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
