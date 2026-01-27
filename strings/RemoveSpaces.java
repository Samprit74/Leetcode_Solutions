// Given a string s, return the string after removing all spaces.

class Solution {
    public String removeSpaces(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != ' ')
                sb.append(c);
        }
        return sb.toString();
    }
}
