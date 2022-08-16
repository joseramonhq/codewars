<div class="description-content p-4">
<div class="markdown prose max-w-none mb-8" id="description"><h1><a href="https://www.codewars.com/kata/628df6b29070907ecb3c2d83" target="_blank">Chaser's schedule</a></h1><p>A runner, who runs with base speed <code>s</code> with duration <code>t</code> will cover a distances <code>d</code>: <code>d = s * t</code><br>
However, this runner can sprint for one unit of time with double speed <code>s * 2</code><br>
After sprinting, base speed <code>s</code> will permanently reduced by <code>1</code>, and for next one unit of time runner will enter recovery phase and can't sprint again.</p>
<p>Your task, given base speed <code>s</code> and time <code>t</code>, is to find the maximum possible distance <code>d</code>.</p>
<p><b style="font-size: larger;">Input:</b><br> 
<code>1 &lt;= s &lt; 1000</code><br>
<code>1 &lt;= t &lt; 1000</code></p>
<p><b style="font-size: larger;">Example:</b><br> 
Given <code>s = 2</code> and <code>t = 4</code>.<br>
We could schedule when runner should sprint so we could get these possible sequences:<br></p>
<pre>Seq.: RRRR
=&gt; s + s + s + s
=&gt; 2 + 2 + 2 + 2 = 8
Seq.: RRRS
=&gt; s + s + s + s*2
=&gt; 2 + 2 + 2 + 2*2 = 10
Seq.: RRSR
=&gt; s + s + s*2 + (s-1)
=&gt; 2 + 2 + 2*2 + (2-1) = 9
Seq.: RSRR
=&gt; s + s*2 + (s-1) + (s-1)
=&gt; 2 + 2*2 + (2-1) + (2-1) = 8
Seq.: RSRS
=&gt; s + s*2 + (s-1) + (s-1)*2
=&gt; 2 + 2*2 + (2-1) + (2-1)*2 = 9
Seq.: SRRR
=&gt; s*2 + (s-1) + (s-1) + (s-1)
=&gt; 2*2 + (2-1) + (2-1) + (2-1) = 7
Seq.: SRRS
=&gt; s*2 + (s-1) + (s-1) + (s-1)*2
=&gt; 2*2 + (2-1) + (2-1) + (2-1)*2 = 8
Seq.: SRSR
=&gt; s*2 + (s-1) + (s-1)*2 + (s-1-1)
=&gt; 2*2 + (2-1) + (2-1)*2 + (2-1-1) = 7

Where:

- R: Normal Run / Recovery
- S: Sprint

</pre>
<p>Based on above sequences, the maximum possible distance <code>d</code> is <code>10</code>.</p>
<p style="font-size: larger; text-align: center;"><b>Enjoy!</b></p></div>
<hr>
<div class="mt-4"><span><i class="icon-moon-tag "></i></span><div class="keyword-tag">Logic</div><div class="keyword-tag">Algorithms</div></div>
</div>