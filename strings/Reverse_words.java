/*
GFG - Reverse Words in a Given String

Given a string with words separated by dots,
reverse the order of words.
*/

class Solution {
    String reverseWords(String s) {
        String[] arr = s.split("\\.");
        StringBuilder res = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            res.append(arr[i]);
            if (i != 0) res.append(".");
        }

        return res.toString();
    }
}
