<div class="description-content p-4">
<div class="markdown prose max-w-none mb-8" id="description"><h1><a href="https://www.codewars.com/kata/586d6cefbcc21eed7a001155" target="_blank">Character with longest consecutive repetition</a></h1><p>For a given string <code>s</code> find the character <code>c</code> (or <code>C</code>) with longest consecutive repetition and return:</p>
<pre style="display: none;"><code class="language-c"><span class="cm-variable">c</span>
(<span class="cm-variable">assign</span> <span class="cm-variable">l</span> <span class="cm-variable">to</span> <span class="cm-variable">pointer</span>)
</code></pre>
<pre style="display: none;"><code class="language-lua">{ <span class="cm-variable">character</span> = <span class="cm-variable">c</span>, <span class="cm-variable">length</span> = <span class="cm-variable">l</span> }
</code></pre>
<pre style="display: none;"><code class="language-go"><span class="cm-keyword">type</span> <span class="cm-variable">Result</span> <span class="cm-keyword">struct</span> {
    <span class="cm-variable">C</span> <span class="cm-keyword">rune</span> <span class="cm-comment">// character</span>
    <span class="cm-variable">L</span> <span class="cm-keyword">int</span>  <span class="cm-comment">// count</span>
}
</code></pre>
<pre style="display: none;"><code class="language-python">(<span class="cm-variable">c</span>, <span class="cm-variable">l</span>)
</code></pre>
<pre style="display: none;"><code class="language-haskell"><span class="cm-builtin">Just</span> (<span class="cm-builtin">Char</span>, <span class="cm-builtin">Int</span>)
</code></pre>
<pre style="display: none;"><code class="language-csharp"><span class="cm-variable">Tuple</span><span class="cm-operator">&lt;</span><span class="cm-type">char</span><span class="cm-operator">?</span>, <span class="cm-type">int</span><span class="cm-operator">&gt;</span>(<span class="cm-variable">c</span>, <span class="cm-variable">l</span>)
</code></pre>
<pre style="display: none;"><code class="language-shell"><span class="cm-comment"># in Shell a String of comma-separated values</span>
c,l
</code></pre>
<pre style="display: none;"><code class="language-javascript">[<span class="cm-variable">c</span>, <span class="cm-variable">l</span>]
</code></pre>
<pre style="display: none;"><code class="language-ruby">[<span class="cm-variable">c</span>, <span class="cm-variable">l</span>]
</code></pre>
<pre style="display: none;"><code class="language-groovy">[<span class="cm-variable">c</span>, <span class="cm-variable">l</span>]
</code></pre>
<pre style="display: none;"><code class="language-coffeescript"><span class="cm-punctuation">[</span><span class="cm-variable">c</span><span class="cm-punctuation">,</span> <span class="cm-variable">l</span><span class="cm-punctuation">]</span>
</code></pre>
<pre><code class="language-java"><span class="cm-type">Object</span>[]{<span class="cm-variable">c</span>, <span class="cm-variable">l</span>};
</code></pre>
<pre style="display: none;"><code class="language-typescript">[<span class="cm-variable">c</span>, <span class="cm-variable">l</span>]: [<span class="cm-variable">string</span>, <span class="cm-variable">number</span>]
</code></pre>
<pre style="display: none;"><code class="language-scala">(<span class="cm-variable">c</span>, <span class="cm-variable">l</span>)
</code></pre>
<pre style="display: none;"><code class="language-nim">(<span class="cm-variable">c</span>, <span class="cm-variable">l</span>)
</code></pre>
<pre style="display: none;"><code class="language-kotlin"><span class="cm-type">Pair</span>(<span class="cm-variable">c</span>, <span class="cm-variable">l</span>)
</code></pre>
<pre style="display: none;"><code class="language-vb"><span class="cm-variable">Tuple</span>(<span class="cm-keyword">Of</span> <span class="cm-keyword">Char</span><span class="cm-error">?</span>, <span class="cm-keyword">Integer</span><span class="cm-operator">&gt;</span>(<span class="cm-variable">c</span>, <span class="cm-variable">l</span>)
</code></pre>
<pre style="display: none;"><code class="language-elixir">{<span class="cm-variable">c</span>, <span class="cm-variable">l</span>}
</code></pre>
<pre style="display: none;"><code class="language-rust"><span class="cm-builtin">Some</span>((<span class="cm-variable">c</span>, <span class="cm-variable">l</span>))
</code></pre>
<pre style="display: none;"><code class="language-perl">[<span class="cm-meta">c</span>, <span class="cm-meta">l</span>]
</code></pre>
<p>where <code>l</code> (or <code>L</code>) is the length of the repetition. If there are two or more characters with the same <code>l</code> return the first in order of appearance.</p>
<p>For empty string return:</p>
<pre style="display: none;"><code class="language-c"><span class="cm-string">'\0'</span>
(<span class="cm-variable">assign</span> <span class="cm-number">0</span> <span class="cm-variable">to</span> <span class="cm-variable">pointer</span>)
</code></pre>
<pre style="display: none;"><code class="language-lua">{<span class="cm-variable">character</span> = <span class="cm-string">""</span>, <span class="cm-variable">length</span> = <span class="cm-number">0</span> }
</code></pre>
<pre style="display: none;"><code class="language-go"><span class="cm-variable">Result</span>{}
</code></pre>
<pre style="display: none;"><code class="language-python">(<span class="cm-string">''</span>, <span class="cm-number">0</span>)
</code></pre>
<pre style="display: none;"><code class="language-haskell"><span class="cm-builtin">Nothing</span>
</code></pre>
<pre style="display: none;"><code class="language-csharp"><span class="cm-variable">Tuple</span><span class="cm-operator">&lt;</span><span class="cm-type">char</span><span class="cm-operator">?</span>, <span class="cm-type">int</span><span class="cm-operator">&gt;</span>(<span class="cm-atom">null</span>, <span class="cm-number">0</span>)
</code></pre>
<pre style="display: none;"><code class="language-shell">,0
</code></pre>
<pre style="display: none;"><code class="language-javascript">[<span class="cm-string">""</span>, <span class="cm-number">0</span>]
</code></pre>
<pre style="display: none;"><code class="language-groovy">[<span class="cm-string">""</span>, <span class="cm-number">0</span>]
</code></pre>
<pre style="display: none;"><code class="language-ruby">[<span class="cm-string">""</span>, <span class="cm-number">0</span>]
</code></pre>
<pre style="display: none;"><code class="language-coffeescript"><span class="cm-punctuation">[</span><span class="cm-string">""</span><span class="cm-punctuation">,</span> <span class="cm-number">0</span><span class="cm-punctuation">]</span>
</code></pre>
<pre><code class="language-java"><span class="cm-type">Object</span>[]{<span class="cm-string">""</span>, <span class="cm-number">0</span>}
</code></pre>
<pre style="display: none;"><code class="language-typescript">[<span class="cm-string">""</span>, <span class="cm-number">0</span>]
</code></pre>
<pre style="display: none;"><code class="language-scala">(<span class="cm-string">""</span>, <span class="cm-number">0</span>)
</code></pre>
<pre style="display: none;"><code class="language-nim">(<span class="cm-string">'\0'</span>, <span class="cm-number">0</span>)
</code></pre>
<pre style="display: none;"><code class="language-kotlin"><span class="cm-type">Pair</span>(<span class="cm-atom">null</span>, <span class="cm-number">0</span>)
</code></pre>
<pre style="display: none;"><code class="language-vb"><span class="cm-variable">Tuple</span>(<span class="cm-keyword">Of</span> <span class="cm-keyword">Char</span><span class="cm-error">?</span>, <span class="cm-keyword">Integer</span>)(<span class="cm-keyword">Nothing</span>, <span class="cm-number">0</span>)
</code></pre>
<pre style="display: none;"><code class="language-elixir">{<span class="cm-string">""</span>, <span class="cm-number">0</span>}
</code></pre>
<pre style="display: none;"><code class="language-rust"><span class="cm-builtin">None</span>
</code></pre>
<pre style="display: none;"><code class="language-swift"><span class="cm-punctuation">[</span><span class="cm-string">""</span><span class="cm-punctuation">:</span> <span class="cm-number">0</span><span class="cm-punctuation">]</span>
</code></pre>
<pre style="display: none;"><code class="language-perl">[<span class="cm-string">""</span>, <span class="cm-number">0</span>]
</code></pre>
<p>In <strong>JavaScript</strong>: If you use <code>Array.sort</code> in your solution, you might experience issues with the random tests as <code>Array.sort</code> is not stable in the Node.js version used by CodeWars. This is not a kata issue.</p>
<p>Happy coding! :)</p>
</div>
<hr>
<div class="mt-4"><span><i class="icon-moon-tag "></i></span><div class="keyword-tag">Strings</div><div class="keyword-tag">Fundamentals</div><div class="keyword-tag">Algorithms</div></div>
</div>