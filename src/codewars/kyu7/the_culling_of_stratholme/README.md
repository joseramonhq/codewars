<div class="w-full panel bg-ui-section"><h1><a href="https://www.codewars.com/kata/634913db7611b9003dff49ad" target="_blank">The Culling of Stratholme</a></h1><h3 class="wf-title-alt">Description:</h3><div class="markdown prose max-w-5xl mx-auto overflow-x-auto break-words" id="description"><p>Prince Arthas needs your help! Mal'ganis has spread an infection amongst the Stratholme citizens, and we must help Arthas prevent this infection from spreading to other parts of the Kingdom.</p>
<p>You will receive a string <code>s</code> as input: Each "word" represents a house, and each letter represents a citizen. All infected citizens are represented as <code>"i"</code> or <code>"I"</code> in <code>s</code>. You must eradicate them, and their neighbors. If an infected citizen appears after or before a space, you should not delete the space, but keep in mind that the distance from "house" to "house" (word to word) has to have only one whitespace. </p>
<p>EXAMPLES:</p>
<pre><code>"STRING"                       -&gt; "STG"
"1i2 33 i4i5 i555ii5"          -&gt; "33 5"
"It is a bit chilly"           -&gt; "a cly"
"Pineapple pizza is delicious" -&gt; "eapple za deus"
"It is not there"              -&gt; "not there"
</code></pre>
<p>NOTES: </p>
<ul>
<li>There are no apostrophes or any non-alphanumeric characters other than whitespaces.</li>
<li>Make sure there are no leading or trailing spaces in the result string</li>
<li>You will always be given a valid string.</li>
<li>You won't be provided any empty strings.</li>
</ul>
<p>Good luck and for the Alliance!</p>
</div><div class="pt-4 max-w-5xl mx-auto"><div class="mt-4"><span><i class="icon-moon-tag "></i></span><div class="keyword-tag">Strings</div><div class="keyword-tag">Games</div><div class="keyword-tag">Regular Expressions</div></div></div></div>