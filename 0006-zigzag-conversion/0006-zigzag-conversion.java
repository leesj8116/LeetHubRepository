class Solution {
    public String convert(String s, int numRows) {
        // numRows 가 1이면 그대로 반환
        if (numRows == 1) {
            return s;
        }

        // 결과를 담을 StringBuilder 선언
        StringBuilder[] answerList  = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            answerList[i] = new StringBuilder();
        }

        int offset = (numRows - 1) * 2;
        int first = offset;         // 첫번째줄에 해당하는 인덱스
        int end = (numRows - 1);    // 마지막 줄에 해당하는 인덱스

        int point = 0;              // 0 ~ (numRows - 1)을 왔다갔다하면서 답을 만드는 포인터
        boolean direction = true;   // point의 증감 방향

        for (int i = 0; i < s.length(); i++) {
            answerList[point].append(s.charAt(i));

            if(i == first) {
                first += offset;
                direction = true;
            } else if (i == end) {
                end += offset;
                direction = false;
            }

            if (direction) {
                point++;
            } else {
                point--;
            }
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            answer.append(answerList[i]);
        }

        return answer.toString();
    }
}