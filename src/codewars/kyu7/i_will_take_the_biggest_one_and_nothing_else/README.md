<div class="description-content p-4">
<div class="markdown prose max-w-none mb-8" id="description"><h1><a href="https://www.codewars.com/kata/631082840289bf000e95a334" target="_blank">I Will Take the Biggest One and Nothing Else.</a></h1><p>We have a positive integer <code>N, N &gt; 0</code>.</p>
<p>We have an special integer <code>N1, N1 &gt; N</code>, such that 
<code>N1 = c ‧ d</code> and <code>N = c + d</code> with the constrain that <code>c ≠ d</code></p>
<p>Let´s see an example:</p>
<pre><code>N = 26 (starting integer)
</code></pre>
<p>The next integer <code>N1</code>, chained with this property  with <code>N</code>, will be <code>48</code>.</p>
<p>Because:</p>
<pre><code>N1 = 2 x 24 = 48
N = 2 + 24 = 26
</code></pre>
<p>But there are another integers chained with <code>N</code> with the property shown above. In effect the next integer <code>N2 = 69</code></p>
<p>Let´s see:</p>
<pre><code>N2 = 3 x 23 = 69
N = 3 + 23 = 26
</code></pre>
<p>The next integer <code>N3</code> is <code>88</code> and you may figure out the values for <code>c</code> and <code>d</code>.</p>
<p>If we continue working trying to find the successive values of <code>Ni</code> for our starting integer <code>N = 26</code> we will find the following chain.</p>
<pre><code>26 (N) --&gt; 48 (N1) --&gt; 69 (N2) --&gt; 88 (N3) --&gt; ........... --&gt; 160 (N9) --&gt; 165 (N10) --&gt; 168 (N11)
</code></pre>
<p>You may work to obtain the intermediate values of the above incomplete chain for the starting integer<code>26</code></p>
<p>In the example above <code>169</code> is discarded as a solution, because as we said before <code>c</code> and <code>d</code> should be different.</p>
<p>The task for this exercise is the following:</p>
<p><em>Given a starting integer you have to find the maximum chained integer that fulfills the property explained above</em></p>
<p>Your code should output an integer in all cases.
You will recieve always an integer as an input.</p>
<p>Special Cases</p>
<ul>
<li>If your starting integer is less than <code>5</code>, we do not have a result higher than your starting integer. In those cases your code should output <code>-1</code>. As an example:</li>
</ul>
<pre><code>input:4; output:-1
</code></pre>
<p>You will see more examples in the fixed examples of the sample box.
You have to pass 200 random tests and the values for the starting <code>N</code> are in the following range:</p>
<pre><code>10 &lt; N &lt; 1 x 10^14
</code></pre>
<p>I hope that this challenge will be useful for all the coding lovers.</p>
<p>Special Acknowledgements for two Codewarriors: Unnamed and macambira for their observations done in the beta phase.</p>
</div>
<hr>
<div class="mt-4"><span><i class="icon-moon-tag "></i></span><div class="keyword-tag">Mathematics</div></div>
</div>