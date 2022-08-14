<div class="description-content p-4">
<div class="markdown prose max-w-none mb-8" id="description"><h1><a href="https://www.codewars.com/kata/603b2bb1c7646d000f900083">Shifter words
</a></h1><p>You probably know that some characters written on a piece of paper, after turning this sheet 180 degrees, can be read, although sometimes in a different way. So, uppercase letters "H", "I", "N", "O", "S", "X", "Z" after rotation are not changed,  the letter "M" becomes a "W", and Vice versa, the letter "W" becomes a "M".</p>
<p>We will call a word "shifter" if it consists only of letters "H", "I", "N", "O", "S", "X", "Z", "M" and "W". After turning the sheet, this word can also be read, although in a different way. So, the word "WOW "turns into the word "MOM". On the other hand, the word "HOME" is not a shifter.</p>
<p>Find the number of <strong>unique</strong> shifter words in the input string (without duplicates). All shifters to be counted, even if they are paired (like "MOM" and "WOW"). String contains only uppercase letters.</p>
<h4 id="examples">Examples</h4>
<pre style="display: none;"><code class="language-javascript"><span class="cm-variable">shifter</span>(<span class="cm-string">"SOS IN THE HOME"</span>) <span class="cm-operator">===</span> <span class="cm-number">2</span> <span class="cm-comment">// shifter words are "SOS" and "IN"</span>
<span class="cm-variable">shifter</span>(<span class="cm-string">"WHO IS SHIFTER AND WHO IS NO"</span>) <span class="cm-operator">===</span> <span class="cm-number">3</span> <span class="cm-comment">// shifter words are "WHO", "IS", "NO"</span>
<span class="cm-variable">shifter</span>(<span class="cm-string">"TASK"</span>) <span class="cm-operator">===</span> <span class="cm-number">0</span> <span class="cm-comment">// no shifter words</span>
<span class="cm-variable">shifter</span>(<span class="cm-string">""</span>) <span class="cm-operator">===</span> <span class="cm-number">0</span> <span class="cm-comment">// no shifter words in empty string</span>
</code></pre>
<pre style="display: none;"><code class="language-python"><span class="cm-variable">shifter</span>(<span class="cm-string">"SOS IN THE HOME"</span>) <span class="cm-operator">==</span> <span class="cm-number">2</span> <span class="cm-comment"># shifter words are "SOS" and "IN"</span>
<span class="cm-variable">shifter</span>(<span class="cm-string">"WHO IS SHIFTER AND WHO IS NO"</span>) <span class="cm-operator">==</span> <span class="cm-number">3</span> <span class="cm-comment"># shifter words are "WHO", "IS", "NO"</span>
<span class="cm-variable">shifter</span>(<span class="cm-string">"TASK"</span>) <span class="cm-operator">==</span> <span class="cm-number">0</span> <span class="cm-comment"># no shifter words</span>
<span class="cm-variable">shifter</span>(<span class="cm-string">""</span>) <span class="cm-operator">==</span> <span class="cm-number">0</span> <span class="cm-comment"># no shifter words in empty string</span>
</code></pre>
<pre><code class="language-java"><span class="cm-variable">Shifter</span>.<span class="cm-variable">count</span>(<span class="cm-string">"SOS IN THE HOME"</span>) <span class="cm-operator">==</span> <span class="cm-number">2</span> <span class="cm-comment">// shifter words are "SOS" and "IN"</span>
<span class="cm-variable">Shifter</span>.<span class="cm-variable">count</span>(<span class="cm-string">"WHO IS SHIFTER AND WHO IS NO"</span>) <span class="cm-operator">==</span> <span class="cm-number">3</span> <span class="cm-comment">// shifter words are "WHO", "IS", "NO"</span>
<span class="cm-variable">Shifter</span>.<span class="cm-variable">count</span>(<span class="cm-string">"TASK"</span>) <span class="cm-operator">==</span> <span class="cm-number">0</span> <span class="cm-comment">// no shifter words</span>
<span class="cm-variable">Shifter</span>.<span class="cm-variable">count</span>(<span class="cm-string">""</span>) <span class="cm-operator">==</span> <span class="cm-number">0</span> <span class="cm-comment">// no shifter words in empty string</span>
</code></pre>
<pre style="display: none;"><code class="language-rust"><span class="cm-variable">shifter</span>(<span class="cm-string">"</span><span class="cm-string">SOS IN THE HOME</span><span class="cm-string">"</span>) <span class="cm-operator">==</span> <span class="cm-number">2</span> <span class="cm-comment">// shifter words are "SOS" and "IN"</span>
<span class="cm-variable">shifter</span>(<span class="cm-string">"</span><span class="cm-string">WHO IS SHIFTER AND WHO IS NO</span><span class="cm-string">"</span>) <span class="cm-operator">==</span> <span class="cm-number">3</span> <span class="cm-comment">// shifter words are "WHO", "IS", "NO"</span>
<span class="cm-variable">shifter</span>(<span class="cm-string">"</span><span class="cm-string">TASK</span><span class="cm-string">"</span>) <span class="cm-operator">==</span> <span class="cm-number">0</span> <span class="cm-comment">// no shifter words</span>
<span class="cm-variable">shifter</span>(<span class="cm-string">"</span><span class="cm-string">"</span>) <span class="cm-operator">==</span> <span class="cm-number">0</span> <span class="cm-comment">// no shifter words in empty string</span>
</code></pre>
</div>
<hr>
<div class="mt-4"><span><i class="icon-moon-tag "></i></span><div class="keyword-tag">Strings</div><div class="keyword-tag">Fundamentals</div></div>
</div>