/*
LeetCode 1732 - Find the Highest Altitude

You start at altitude 0.
Given an array gain where gain[i]
is the net gain between points,
return the highest altitude reached.
*/

class Solution {
    public int largestAltitude(int[] gain) {
        int alt = 0;
        int max = 0;

        for (int g : gain) {
            alt += g;
            max = Math.max(max, alt);
        }

        return max;
    }
}
