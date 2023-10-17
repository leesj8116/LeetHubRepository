<h2><a href="https://leetcode.com/problems/longest-palindromic-substring">5. Longest Palindromic Substring</a></h2>

### Comment

> ❌ 답을 확인하고 제출한 문제입니다. :(

![스크린샷 2023-10-17 09 54 26](https://github.com/leesj8116/LeetHubRepository/assets/105261571/86706588-6d35-42da-aa38-22d5c9e7f149)

무작정 모든 문자열에 대해 탐색하는 것이 느리다는 건 알고 있었지만, 어떻게 해결해야할지 감이 오지 않았습니다.
처음엔 `StringBuidler.append(subString).reverse().equals(subString)` 식으로 비교하는 게 느리다 판단하여, `subString.toCharArray()[i] == subStirng.toCharArray()[k]` 식으로 비교하기도 하고, 이전에 대칭이 아닌 문자열들을 `HashSet<String>`에 담아서 재활용하고자 하는 생각도 있었습니다.

무작정 해결하는 방식보다 효율적인 방안을 생각해야 했는데, 그 부분이 아쉬웠습니다.

---



<h3>Medium</h3><hr><p>Given a string <code>s</code>, return <em>the longest</em> <span data-keyword="palindromic-string"><em>palindromic</em></span> <span data-keyword="substring-nonempty"><em>substring</em></span> in <code>s</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;babad&quot;
<strong>Output:</strong> &quot;bab&quot;
<strong>Explanation:</strong> &quot;aba&quot; is also a valid answer.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;cbbd&quot;
<strong>Output:</strong> &quot;bb&quot;
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 1000</code></li>
	<li><code>s</code> consist of only digits and English letters.</li>
</ul>
