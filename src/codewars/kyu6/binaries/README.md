<div class="w-full panel bg-ui-section"><h1><a href="https://www.codewars.com/kata/5d98b6b38b0f6c001a461198" target="_blank">Binaries</a></h1><h3 class="wf-title-alt">Description:</h3><div class="markdown prose max-w-5xl mx-auto overflow-x-auto break-words" id="description"><p>Let us take a string composed of decimal digits: <code>"10111213"</code>. We want to code this string as a string of <code>0</code> and <code>1</code> and after that be able to decode it.</p>
<p>To code we decompose the given string in its decimal digits (in the above example: <code>1 0 1 1 1 2 1 3</code>) and we will code each digit.</p>
<h4 id="coding-process-to-code-a-number-n-expressed-in-base-10">Coding process to code a number n expressed in base 10:</h4>
<p>For each digit <code>d</code> of <code>n</code></p>
<ul>
<li><p>a) Let <code>k</code> be the number of bits of <code>d</code></p>
</li>
<li><p>b) Write <code>k-1</code> times the digit <code>0</code> followed by the digit <code>1</code></p>
</li>
<li><p>c) Write digit <code>d</code> as a binary string, with the rightmost bit being the least significant</p>
</li>
<li><p>d) Concat the result of b) and c) to get the coding of <code>d</code></p>
</li>
</ul>
<p>At last concatenate all the results got for the digits of <code>n</code>.</p>
<h4 id="an-example">An example</h4>
<p>So we code <code>0</code> as <code>10</code>, <code>1</code> as <code>11</code>, <code>2</code> as <code>0110</code>, <code>3</code> as <code>0111</code> ...  etc...</p>
<p>With the given process, the initial string <code>"10111213"</code>
becomes: 
<code>"11101111110110110111"</code> resulting of concatenation of <code>11 10 11 11 11 0110 11 0111</code>.</p>
<h4 id="task">Task:</h4>
<ul>
<li><p>Given <code>strng</code> a string of digits representing a decimal number the function <code>code(strng)</code> should return the coding of <code>strng</code> as explained above.</p>
</li>
<li><p>Given a string <code>strng</code> resulting from the previous coding, decode it to get the corresponding decimal string.</p>
</li>
</ul>
<h4 id="examples">Examples:</h4>
<pre><code>code("77338855") --&gt; "001111001111011101110001100000011000001101001101"
code("77338")  --&gt; "0011110011110111011100011000"
code("0011121314") --&gt; "1010111111011011011111001100"

decode("001111001111011101110001100000011000001101001101") -&gt; "77338855"
decode("0011110011110111011100011000") -&gt; "77338"
decode("1010111111011011011111001100") -&gt; "0011121314"
</code></pre>
<h4 id="notes">Notes</h4>
<ul>
<li>SHELL: The only tested function is <code>decode</code>.</li>
<li>Please could you ask before translating.</li>
</ul></code></pre>
</div><div class="pt-4 max-w-5xl mx-auto"><div class="mt-4"><span><i class="icon-moon-tag "></i></span><div class="keyword-tag">Fundamentals</div></div></div></div>