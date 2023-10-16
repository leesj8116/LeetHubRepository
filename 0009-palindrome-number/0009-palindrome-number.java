class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x == 0) {
            return true;
        }

        // 숫자의 길이 구하기 (검색해서 활용)
        int length = (int) (Math.log10(x) + 1);

        for (int i = length - 1; i > 0; i -= 2) {
            int start = (x / ((int) Math.pow(10, i)));
            int end = x % 10;

            // 두 수가 같지 않을 경우 false
            if (start != end) {
                return false;
            }

            // 2개가 같을 경우, 앞 뒤 숫자 2개를 잘라냄
            x %= ((int) Math.pow(10, i));
            x /= 10;
        }

        return true;
    }
}