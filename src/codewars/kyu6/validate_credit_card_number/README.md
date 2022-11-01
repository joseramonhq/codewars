<div class="w-full panel bg-ui-section"><h1><a href="https://www.codewars.com/kata/5418a1dd6d8216e18a0012b2" target="_blank">Validate Credit Card Number
</a></h1><h3 class="wf-title-alt">Description:</h3><div class="markdown prose max-w-5xl mx-auto overflow-x-auto break-words" id="description"><p>In this Kata, you will implement the <a href="http://en.wikipedia.org/wiki/Luhn_algorithm" data-turbolinks="false" target="_blank">Luhn Algorithm</a>, which is used to help validate credit card numbers.</p>
<p>Given a positive integer of up to 16 digits, return <code>true</code> if it is a valid credit card number, and <code>false</code> if it is not.</p>
<p>Here is the algorithm:</p>
<ul>
<li><p>Double every other digit, scanning <strong>from right to left</strong>, starting from the second digit (from the right).</p>
<p>Another way to think about it is: if there are an <strong>even</strong> number of digits, double every other digit starting with the <strong>first</strong>; if there are an <strong>odd</strong> number of digits, double every other digit starting with the <strong>second</strong>:</p>
<pre><code>1714 ==&gt; [1*, 7, 1*, 4] ==&gt; [2, 7, 2, 4]</code></pre>

12345 ==&gt; [1, 2*, 3, 4*, 5] ==&gt; [1, 4, 3, 8, 5]

891 ==&gt; [8, 9*, 1] ==&gt; [8, 18, 1]
</code></pre>
</li>
<li><p>If a resulting number is greater than <code>9</code>, replace it with the sum of its own digits (which is the same as subtracting <code>9</code> from it):</p>
</li>
</ul>
<pre><code>[8, 18*, 1] ==&gt; [8, (1+8), 1] ==&gt; [8, 9, 1]

or:

[8, 18*, 1] ==&gt; [8, (18-9), 1] ==&gt; [8, 9, 1]
</code></pre>
<ul>
<li><p>Sum all of the final digits:</p>
<pre><code>[8, 9, 1] ==&gt; 8 + 9 + 1 = 18
</code></pre>
</li>
<li><p>Finally, take that sum and divide it by <code>10</code>.  If the remainder equals zero, the original credit card number is valid.</p>
<pre><code>18 (modulus) 10 ==&gt; 8 , which is not equal to 0, so this is not a valid credit card number
</code></pre>
</li>
</ul></code></pre>
</div><div class="pt-4 max-w-5xl mx-auto"><div class="mt-4"><span><i class="icon-moon-tag "></i></span><div class="keyword-tag">Algorithms</div></div></div></div>