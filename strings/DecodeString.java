/*
LeetCode 394 - Decode String

Given an encoded string, return its decoded version.
Encoding rule: k[encoded_string]
where encoded_string is repeated k times.
Nested encodings are allowed.
*/

import java.util.*;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<StringBuilder> strs = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int num = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                counts.push(num);
                strs.push(curr);
                curr = new StringBuilder();
                num = 0;
            } else if (c == ']') {
                int k = counts.pop();
                StringBuilder prev = strs.pop();
                while (k-- > 0) prev.append(curr);
                curr = prev;
            } else {
                curr.append(c);
            }
        }

        return curr.toString();
    }
}
