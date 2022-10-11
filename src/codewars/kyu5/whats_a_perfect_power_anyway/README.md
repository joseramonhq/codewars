<div class="w-full panel bg-ui-section"><h1><a href="https://www.codewars.com/kata/54d4c8b08776e4ad92000835" target="_blank">What's a Perfect Power anyway?
</a></h1><h3 class="wf-title-alt">Description:</h3><div class="markdown prose max-w-5xl mx-auto overflow-x-auto break-words" id="description"><p>A <a href="https://en.wikipedia.org/wiki/Perfect_power" data-turbolinks="false" target="_blank">perfect power</a> is a classification of positive integers:</p>
<blockquote>
<p>In mathematics, a <strong>perfect power</strong> is a positive integer that can be expressed as an integer power of another positive integer. More formally, n is a perfect power if there exist natural numbers m &gt; 1, and k &gt; 1 such that m<sup>k</sup> = n.</p>
</blockquote>
<p>Your task is to check whether a given integer is a perfect power. If it is a perfect power, return a pair <code>m</code> and <code>k</code> with m<sup>k</sup> = n as a proof. Otherwise return <code>Nothing</code>, <code>Nil</code>, <code>null</code>, <code>NULL</code>, <code>None</code> or your language's equivalent.</p>
<p><strong>Note:</strong> For a perfect power, there might be several pairs. For example <code>81 = 3^4 = 9^2</code>, so <code>(3,4)</code> and <code>(9,2)</code> are valid solutions. However, the tests take care of this, so if a number is a perfect power, return any pair that proves it.</p>
<h3 id="examples">Examples</h3>
<pre style="display: none;"><code class="language-javascript"><span class="cm-variable">Test</span>.<span class="cm-property">describe</span>(<span class="cm-string">"perfect powers"</span>, <span class="cm-keyword">function</span>(){
  <span class="cm-variable">Test</span>.<span class="cm-property">it</span>(<span class="cm-string">"should work for some examples"</span>,<span class="cm-keyword">function</span>(){
    <span class="cm-variable">Test</span>.<span class="cm-property">assertSimilar</span>(<span class="cm-variable">isPP</span>(<span class="cm-number">4</span>), [<span class="cm-number">2</span>,<span class="cm-number">2</span>], <span class="cm-string">"4 = 2^2"</span>);
    <span class="cm-variable">Test</span>.<span class="cm-property">assertSimilar</span>(<span class="cm-variable">isPP</span>(<span class="cm-number">9</span>), [<span class="cm-number">3</span>,<span class="cm-number">2</span>], <span class="cm-string">"9 = 3^2"</span>);
    <span class="cm-variable">Test</span>.<span class="cm-property">assertEquals</span>( <span class="cm-variable">isPP</span>(<span class="cm-number">5</span>), <span class="cm-atom">null</span>, <span class="cm-string">"5 isn't a perfect number"</span>);
  });
});
</code></pre>
<pre style="display: none;"><code class="language-coffeescript"><span class="cm-variable">Test</span><span class="cm-punctuation">.</span><span class="cm-property">describe</span> <span class="cm-string">"perfect powers"</span><span class="cm-punctuation">,</span> <span class="cm-operator">-&gt;</span>
  <span class="cm-variable">Test</span><span class="cm-punctuation">.</span><span class="cm-property">it</span> <span class="cm-string">"should work for some examples"</span><span class="cm-punctuation">,</span> <span class="cm-operator">-&gt;</span>
    <span class="cm-variable">Test</span><span class="cm-punctuation">.</span><span class="cm-property">assertSimilar</span> <span class="cm-variable">isPP</span><span class="cm-punctuation">(</span><span class="cm-number">4</span><span class="cm-punctuation">)</span><span class="cm-punctuation">,</span> <span class="cm-punctuation">[</span> <span class="cm-number">2</span><span class="cm-punctuation">,</span> <span class="cm-number">2</span> <span class="cm-punctuation">]</span><span class="cm-punctuation">,</span> <span class="cm-string">"4 = 2^2"</span>
    <span class="cm-variable">Test</span><span class="cm-punctuation">.</span><span class="cm-property">assertSimilar</span> <span class="cm-variable">isPP</span><span class="cm-punctuation">(</span><span class="cm-number">9</span><span class="cm-punctuation">)</span><span class="cm-punctuation">,</span> <span class="cm-punctuation">[</span> <span class="cm-number">3</span><span class="cm-punctuation">,</span> <span class="cm-number">2</span> <span class="cm-punctuation">]</span><span class="cm-punctuation">,</span> <span class="cm-string">"9 = 3^2"</span>
    <span class="cm-variable">Test</span><span class="cm-punctuation">.</span><span class="cm-property">assertEquals</span> <span class="cm-variable">isPP</span><span class="cm-punctuation">(</span><span class="cm-number">5</span><span class="cm-punctuation">)</span><span class="cm-punctuation">,</span> <span class="cm-atom">null</span><span class="cm-punctuation">,</span> <span class="cm-string">"5 isn't a perfect number"</span>
</code></pre>
<pre style="display: none;"><code class="language-haskell"><span class="cm-variable">isPP</span> <span class="cm-number">4</span> `<span class="cm-variable">shouldBe</span>` <span class="cm-builtin">Just</span> (<span class="cm-number">2</span>,<span class="cm-number">2</span>)
<span class="cm-variable">isPP</span> <span class="cm-number">9</span> `<span class="cm-variable">shouldBe</span>` <span class="cm-builtin">Just</span> (<span class="cm-number">3</span>,<span class="cm-number">2</span>)
<span class="cm-variable">isPP</span> <span class="cm-number">5</span> `<span class="cm-variable">shouldBe</span>` <span class="cm-builtin">Nothing</span>
</code></pre>
<pre style="display: none;"><code class="language-python"><span class="cm-variable">isPP</span>(<span class="cm-number">4</span>) <span class="cm-operator">=&gt;</span> [<span class="cm-number">2</span>,<span class="cm-number">2</span>]
<span class="cm-variable">isPP</span>(<span class="cm-number">9</span>) <span class="cm-operator">=&gt;</span> [<span class="cm-number">3</span>,<span class="cm-number">2</span>]
<span class="cm-variable">isPP</span>(<span class="cm-number">5</span>) <span class="cm-operator">=&gt;</span> <span class="cm-keyword">None</span>
</code></pre>
<pre style="display: none;"><code class="language-ruby"><span class="cm-variable">isPP</span>(<span class="cm-number">4</span>) <span class="cm-operator">=&gt;</span> [<span class="cm-number">2</span>,<span class="cm-number">2</span>]
<span class="cm-variable">isPP</span>(<span class="cm-number">9</span>) <span class="cm-operator">=&gt;</span> [<span class="cm-number">3</span>,<span class="cm-number">2</span>]
<span class="cm-variable">isPP</span>(<span class="cm-number">5</span>) <span class="cm-operator">=&gt;</span> <span class="cm-keyword">nil</span>
</code></pre>
<pre><code class="language-java"><span class="cm-variable">isPerfectPower</span>(<span class="cm-number">4</span>) <span class="cm-operator">=&gt;</span> <span class="cm-keyword">new</span> <span class="cm-type">int</span>[]{<span class="cm-number">2</span>,<span class="cm-number">2</span>}
<span class="cm-variable">isPerfectPower</span>(<span class="cm-number">5</span>) <span class="cm-operator">=&gt;</span> <span class="cm-atom">null</span>
<span class="cm-variable">isPerfectPower</span>(<span class="cm-number">8</span>) <span class="cm-operator">=&gt;</span> <span class="cm-keyword">new</span> <span class="cm-type">int</span>[]{<span class="cm-number">2</span>,<span class="cm-number">3</span>}
<span class="cm-variable">isPerfectPower</span>(<span class="cm-number">9</span>) <span class="cm-operator">=&gt;</span> <span class="cm-keyword">new</span> <span class="cm-type">int</span>[]{<span class="cm-number">3</span>,<span class="cm-number">2</span>}
</code></pre>
<pre style="display: none;"><code class="language-r"><span class="cm-variable">isPP</span>(<span class="cm-number">4</span>) <span class="cm-operator">=&gt;</span> <span class="cm-number">2</span> <span class="cm-number">2</span>
<span class="cm-variable">isPP</span>(<span class="cm-number">9</span>) <span class="cm-operator">=&gt;</span> <span class="cm-number">3</span> <span class="cm-number">2</span>
<span class="cm-variable">isPP</span>(<span class="cm-number">5</span>) <span class="cm-operator">=&gt;</span> <span class="cm-atom">NULL</span>
</code></pre>
<pre style="display: none;"><code class="language-csharp"><span class="cm-variable">IsPerfectPower</span>(<span class="cm-number">4</span>) <span class="cm-operator">=&gt;</span> (<span class="cm-number">2</span>,<span class="cm-number">2</span>)
<span class="cm-variable">IsPerfectPower</span>(<span class="cm-number">5</span>) <span class="cm-operator">=&gt;</span> <span class="cm-atom">null</span>
<span class="cm-variable">IsPerfectPower</span>(<span class="cm-number">8</span>) <span class="cm-operator">=&gt;</span> (<span class="cm-number">2</span>,<span class="cm-number">3</span>)
<span class="cm-variable">IsPerfectPower</span>(<span class="cm-number">9</span>) <span class="cm-operator">=&gt;</span> (<span class="cm-number">3</span>,<span class="cm-number">2</span>)
</code></pre>
</div><div class="pt-4 max-w-5xl mx-auto"><div class="mt-4"><span><i class="icon-moon-tag "></i></span><div class="keyword-tag">Mathematics</div><div class="keyword-tag">Fundamentals</div></div></div></div>