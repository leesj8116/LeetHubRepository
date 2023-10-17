// 답지 보고 해결
// https://leetcode.com/problems/longest-palindromic-substring/solutions/3401644/detailed-recursive-explaination-with-pictures-in-c-java-python-dp-two-pointers/
class Solution {
    int len = 0;    // 문자열의 길이
    int lo = 0;     // substring의 시작 index

    public String longestPalindrome(String s) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            expandPalindrome(arr, i, i);        // 홀수 문자열
            expandPalindrome(arr, i, i + 1);    // 짝수 문자열
        }

        return s.substring(lo, lo + len);
    }

    public void expandPalindrome(char[] arr, int k, int m) {
        while((k >= 0) && (m < arr.length) && (arr[k] == arr[m])) {
            k--; m++;
        }

        if (len < (m - k - 1)) {
            len = m - k - 1;
            lo = k + 1;
        }
    }
}