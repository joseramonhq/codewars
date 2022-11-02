<div class="w-full panel bg-ui-section"><h1><a href="https://www.codewars.com/kata/559e3224324a2b6e66000046" target="_blank">Functions of Integers on Cartesian Plane
</a></h1><h3 class="wf-title-alt">Description:</h3><div class="markdown prose max-w-5xl mx-auto overflow-x-auto break-words" id="description"><p>Let us consider integer coordinates x, y in the Cartesian plan and three functions f, g, h
defined by:</p>
<pre><code>f: 1 &lt;= x &lt;= n, 1 &lt;= y &lt;= n --&gt; f(x, y) = min(x, y)
g: 1 &lt;= x &lt;= n, 1 &lt;= y &lt;= n --&gt; g(x, y) = max(x, y)
h: 1 &lt;= x &lt;= n, 1 &lt;= y &lt;= n --&gt; h(x, y) = x + y
</code></pre>
<p>where <code>n</code> is a given integer <code>(n &gt;= 1)</code> and <code>x</code>, <code>y</code> are integers.</p>
<p>In the table below you can see the value of the function <code>f</code> with <code>n = 6</code>.</p>
<table>
<thead>
<tr>
<th>---</th>
<th>x=1</th>
<th>x=2</th>
<th>x=3</th>
<th>x=4</th>
<th>x=5</th>
<th>x=6</th>
</tr>
</thead>
<tbody><tr>
<td>y=6</td>
<td>1</td>
<td>2</td>
<td>3</td>
<td>4</td>
<td>5</td>
<td>6</td>
</tr>
<tr>
<td>y=5</td>
<td>1</td>
<td>2</td>
<td>3</td>
<td>4</td>
<td>5</td>
<td>5</td>
</tr>
<tr>
<td>y=4</td>
<td>1</td>
<td>2</td>
<td>3</td>
<td>4</td>
<td>4</td>
<td>4</td>
</tr>
<tr>
<td>y=3</td>
<td>1</td>
<td>2</td>
<td>3</td>
<td>3</td>
<td>3</td>
<td>3</td>
</tr>
<tr>
<td>y=2</td>
<td>1</td>
<td>2</td>
<td>2</td>
<td>2</td>
<td>2</td>
<td>2</td>
</tr>
<tr>
<td>y=1</td>
<td>1</td>
<td>1</td>
<td>1</td>
<td>1</td>
<td>1</td>
<td>1</td>
</tr>
</tbody></table>
<p>The task is to calculate 
the <strong>sum</strong> of <strong><code>f(x, y)</code>, <code>g(x, y)</code> and <code>h(x, y)</code></strong> for all integers <code>x</code> and <code>y</code> in the domain D: <code>(1 &lt;= x &lt;= n, 1 &lt;= y &lt;= n)</code>.</p>
<ul>
<li><p>The function <strong><code>sumin</code></strong> <code>(sum of f)</code> will take n as a parameter and return the <strong><code>sum</code></strong> of <strong><code>min(x, y)</code></strong> in <code>D</code>.</p>
</li>
<li><p>The function <strong><code>sumax</code></strong> <code>(sum of g)</code> will take n as a parameter and return the <strong><code>sum</code></strong> of <strong><code>max(x, y)</code></strong> in <code>D</code>.</p>
</li>
<li><p>The function <strong><code>sumsum</code></strong> <code>(sum of h)</code> will take n as a parameter and return the <strong><code>sum</code></strong> of <strong><code>x + y</code></strong> in <code>D</code>.</p>
</li>
</ul>
<h4 id="examples">Examples:</h4>
<pre><code>sumin(6) --&gt; 91 (You can verify with the above table for n = 6)
sumax(6) --&gt; 161
sumsum(6) --&gt; 252</code></pre>

sumin(45) --&gt; 31395 sumax(45) --&gt; 61755 sumsum(45) --&gt; 93150

sumin(999) --&gt; 332833500 sumax(999) --&gt; 665167500 sumsum(999) --&gt; 998001000

sumin(5000) --&gt; 41679167500 sumax(5000) --&gt; 83345832500 sumsum(5000) --&gt; 125025000000
</code></pre>
</div><div class="pt-4 max-w-5xl mx-auto"><div class="mt-4"><span><i class="icon-moon-tag "></i></span><div class="keyword-tag">Fundamentals</div><div class="keyword-tag">Mathematics</div></div></div></div>