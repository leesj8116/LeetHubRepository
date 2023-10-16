<h2><a href="https://leetcode.com/problems/palindrome-number">9. Palindrome Number</a></h2>

---

# Comment

문제의 Follow up에서 문자열로 변환하지 않고 풀어보기를 제시하여, 직접 자릿수별로 나누어 비교하기를 시도했다.

이를 위해 자릿수 계산을 위한 `Math.log10(x)`을 호출했다.
문자열 변환으로 푸는 것이 더 간편한 답을 얻을 수 있으므로, 시도한 코드가 마음에 들지는 않았다.

```java
// 간편 답안
// https://leetcode.com/problems/palindrome-number/solutions/4130511/simple-java-solutions/
class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder s = new StringBuilder(String.valueOf(x));
        s.reverse();

        return s.toString().equals(x + "");
    }
}
```

---

<h3>Easy</h3><hr><p>Given an integer <code>x</code>, return <code>true</code><em> if </em><code>x</code><em> is a </em><span data-keyword="palindrome-integer"><em><strong>palindrome</strong></em></span><em>, and </em><code>false</code><em> otherwise</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> x = 121
<strong>Output:</strong> true
<strong>Explanation:</strong> 121 reads as 121 from left to right and from right to left.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> x = -121
<strong>Output:</strong> false
<strong>Explanation:</strong> From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> x = 10
<strong>Output:</strong> false
<strong>Explanation:</strong> Reads 01 from right to left. Therefore it is not a palindrome.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>-2<sup>31</sup>&nbsp;&lt;= x &lt;= 2<sup>31</sup>&nbsp;- 1</code></li>
</ul>

<p>&nbsp;</p>
<strong>Follow up:</strong> Could you solve it without converting the integer to a string?
