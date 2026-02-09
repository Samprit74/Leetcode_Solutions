/*
LeetCode 1071 - Greatest Common Divisor of Strings

Given two strings str1 and str2,
return the largest string that divides both strings.
A string divides another if repeating it forms the original string.
*/

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";

        int len = gcd(str1.length(), str2.length());
        return str1.substring(0, len);
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
