<h2><a href="https://leetcode.com/problems/zigzag-conversion">6. Zigzag Conversion</a></h2>

#### Comment

첫번째줄의 규칙, 마지막줄의 숫자 증감에 대한 규칙을 찾고 생각나는대로 구현했다.  
그러다보니 코드가 간결하지 못한 부분이 있는데, 모범 답안에서는 훨씬 간단하게 표현하고 있다.

```java
// 모범 답안
// https://leetcode.com/problems/zigzag-conversion/solutions/3248705/stringbuilder-for-each-row-easy-to-understand/
class Solution {
  public String convert(String s, int numRows) {
    if (numRows == 1) return s;

		StringBuilder[] listOfSb = new StringBuilder[numRows];
		for (int i = 0; i < numRows; i++) {
			listOfSb[i] = new StringBuilder();
		}

	/**
	 * first와 end를 구분짓지 않고, rest 변수를 만들어서
	 * rest < numRows를 조건으로 지그재그를 계산
	**/
		int k = (numRows - 1) * 2;
		for (int i = 0; i < s.length(); i++) {
			int rest = i % k;
			//i-th char in row [0, numRows-1] when rest < numRows
			int row = rest < numRows ? rest : k - rest;
			listOfSb[row].append(s.charAt(i));
		}
		StringBuilder sb = new StringBuilder();

		// for (int i = 0; < listOfSb.length; i++) 보다 간결한 표현
		//combine all builders
		for (StringBuilder b : listOfSb) {
			sb.append(b);
		}
		return sb.toString();
	}
}
```

---

<h3>Medium</h3>
<hr><p>The string <code>&quot;PAYPALISHIRING&quot;</code> is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)</p>

<pre>
P   A   H   N
A P L S I I G
Y   I   R
</pre>

<p>And then read line by line: <code>&quot;PAHNAPLSIIGYIR&quot;</code></p>

<p>Write the code that will take a string and make this conversion given a number of rows:</p>

<pre>
string convert(string s, int numRows);
</pre>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;PAYPALISHIRING&quot;, numRows = 3
<strong>Output:</strong> &quot;PAHNAPLSIIGYIR&quot;
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;PAYPALISHIRING&quot;, numRows = 4
<strong>Output:</strong> &quot;PINALSIGYAHRPI&quot;
<strong>Explanation:</strong>
P     I    N
A   L S  I G
Y A   H R
P     I
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;A&quot;, numRows = 1
<strong>Output:</strong> &quot;A&quot;
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 1000</code></li>
	<li><code>s</code> consists of English letters (lower-case and upper-case), <code>&#39;,&#39;</code> and <code>&#39;.&#39;</code>.</li>
	<li><code>1 &lt;= numRows &lt;= 1000</code></li>
</ul>
