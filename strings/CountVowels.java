// Given a string s, return the count of vowels in it.

class Solution {
    public int countVowels(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
        }
        return count;
    }
}
