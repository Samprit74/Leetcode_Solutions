/*
LeetCode 345 - Reverse Vowels of a String

Reverse only the vowels in a string
and return the new string.
*/

import java.util.*;

class Solution {
    public String reverseVowels(String s) {
        Set<Character> v = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;

        while (i < j) {
            while (i < j && !v.contains(arr[i])) i++;
            while (i < j && !v.contains(arr[j])) j--;

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return new String(arr);
    }
}
