class Solution {
    public int lengthOfLongestSubstring(String s) {
        // I can't understand Question.
        // I am checked answer. https://leetcode.com/problems/longest-substring-without-repeating-characters/solutions/3157485/used-hashset-in-java-explained-approach/comments/2016376

        int length = 0;
        int left = 0;

        for (int right = 0 ; right < s.length(); right++) {
            while (right != s.indexOf(s.charAt(right), left)) {
                left++;
            }

            length = Math.max(length, right - left + 1);
        }

        return length;
    }
}