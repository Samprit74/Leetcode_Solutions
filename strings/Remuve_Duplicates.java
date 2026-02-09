/*
GFG - Remove Duplicates from a String

Given a string,
remove duplicate characters
while keeping first occurrences.
*/

class Solution {
    String removeDuplicates(String s) {
        boolean[] seen = new boolean[256];
        StringBuilder res = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                res.append(c);
            }
        }

        return res.toString();
    }
}
