<h2><a href="https://leetcode.com/problems/longest-substring-without-repeating-characters">3. Longest Substring Without Repeating Characters</a></h2>

---

# Comment

> ❌ 답을 확인하고 제출한 문제입니다. :(

문제에서 말하는 substring을 이해하지 못해서.. 답을 확인했습니다.
주어진 `s`의 substring 중에, 중복 글자가 없는 가장 긴 문자열을 의미하는 걸로 이해했습니다.

처음에는 단순히 중복문자를 제거하면 된다고 생각했으나, 주어진 예시 3번의 `pwwkew`에서 `pwke`가 아님을 명시함으로 보았을 때, `pw`까지는 substring이지만 `pww`부터는 substring이지만 w가 중복 되므로, `wke`가 가장 길고 중복 없는 문자열이 되어 답이 `3`인 것으로 이해했습니다.

이를 해결하기 위해서는 앞과 뒤 포인터를 두고 문자열을 탐색하는 방식이 유리한데, 이와 관련하여 **투 포인트** 또는 **슬라이딩 윈도우** 알고리즘으로 명합니다. 슬라이딩 윈도우는 주로 고정폭을 다룰 때 활용합니다.

덕분에 새로운 알고리즘을 알게 되었습니다.

---

<h3>Medium</h3><hr><p>Given a string <code>s</code>, find the length of the <strong>longest</strong> <span data-keyword="substring-nonempty"><strong>substring</strong></span> without repeating characters.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;abcabcbb&quot;
<strong>Output:</strong> 3
<strong>Explanation:</strong> The answer is &quot;abc&quot;, with the length of 3.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;bbbbb&quot;
<strong>Output:</strong> 1
<strong>Explanation:</strong> The answer is &quot;b&quot;, with the length of 1.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;pwwkew&quot;
<strong>Output:</strong> 3
<strong>Explanation:</strong> The answer is &quot;wke&quot;, with the length of 3.
Notice that the answer must be a substring, &quot;pwke&quot; is a subsequence and not a substring.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= s.length &lt;= 5 * 10<sup>4</sup></code></li>
	<li><code>s</code> consists of English letters, digits, symbols and spaces.</li>
</ul>
