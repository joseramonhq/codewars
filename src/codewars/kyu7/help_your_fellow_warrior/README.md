<div class="w-full panel bg-ui-section"><h1><a href="https://www.codewars.com/kata/5660aa6fa60f03856c000045" target="_blank">Help your fellow warrior</a></h1><h3 class="wf-title-alt">Description:</h3><div class="markdown prose max-w-5xl mx-auto" id="description"><p>Let's say that in a hypothetical platform that resembles Codewars there is a clan with 2 warriors. The 2nd one in ranking (lets call him <strong>D</strong>) wants to at least reach the honor score of his ally (lets call her <strong>M</strong>). 
<em>(Let's say that there is no antagonism here, he just wants to prove his ally that she should be proud to have him in the clan and sees this as the only way to achieve it! :P )</em></p>
<p>Your task is to help <strong>D</strong> by providing him with the <strong>quickest path</strong> to reach <strong>M</strong>'s honor score.</p>
<p>In this hypothetical platform there are 2 kinds of kata to be solved:</p>
<pre><code>'2kyu' worth of 1 point 
'1kyu' worth of 2 points 
</code></pre>
<p>So if for example:</p>
<pre><code>M has honor 11
D has honor 2
</code></pre>
<p><strong>D</strong> could reach **M<code>s** honor by solving kata worth of </code>9`. He has many options to do this:</p>
<pre><code>Solve 9 '2kyus' (9*1 -&gt; 9) =&gt; Solve 9 kata
Solve 4 '1kyus' and 1 '2kyus' (4*2 + 1*1-&gt; 9) =&gt; Solve 5 kata
Solve 2 '1kyus' and 5 '2kyus' (2*2 + 5*1 -&gt; 9) =&gt; Solve 7 kata
etc etc...
</code></pre>
<p>The <strong>quickest path</strong> to reach the honor score is: </p>
<pre><code>4 '1kyus' and 1 '2kyus' =&gt; Solve only 5 kata
</code></pre>
<p>Create a function <code>getHonorPath</code> that accepts 2 arguments <code>honorScore</code> &amp; <code>targetHonorScore</code> with score integers of 2 warriors and returns an object with the <strong>quickest path</strong> for the first one to reach the 2nd's honor. For example:</p>
<pre><code>getHonorPath(2, 11) should return { '1kyus': 4, '2kyus': 1 }
getHonorPath(20, 11) should return {}
</code></pre>
<p><strong>For the purpose of this kata you do not have to worry about any non-integer arguments for honor scores</strong></p>
</div><div class="pt-4 max-w-5xl mx-auto"><div class="mt-4"><span><i class="icon-moon-tag "></i></span><div class="keyword-tag">Fundamentals</div><div class="keyword-tag">Mathematics</div><div class="keyword-tag">Algorithms</div></div></div></div>Help your fellow warrior