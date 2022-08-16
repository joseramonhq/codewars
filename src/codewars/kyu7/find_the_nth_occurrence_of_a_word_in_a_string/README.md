<div class="description-content p-4">
<div class="markdown prose max-w-none mb-8" id="description"><h1><a href="https://www.codewars.com/kata/5b1d1812b6989d61bd00004f" target="_blank">Find the nth occurrence of a word in a string!</a></h1><h1 id="description">Description</h1>
<p>You are required to implement a function <code>find_nth_occurrence</code> that returns the index of the nth occurrence of a substring within a string (considering that those substring could overlap each others). If there are less than n occurrences of the substring, return -1.</p>
<h1 id="example">Example</h1>
<pre style="display: none;"><code class="language-python"><span class="cm-variable">string</span> <span class="cm-operator">=</span> <span class="cm-string">"This is an example. Return the nth occurrence of example in this example string."</span>
<span class="cm-variable">find_nth_occurrence</span>(<span class="cm-string">"example"</span>, <span class="cm-variable">string</span>, <span class="cm-number">1</span>) <span class="cm-operator">==</span> <span class="cm-number">11</span>
<span class="cm-variable">find_nth_occurrence</span>(<span class="cm-string">"example"</span>, <span class="cm-variable">string</span>, <span class="cm-number">2</span>) <span class="cm-operator">==</span> <span class="cm-number">49</span>
<span class="cm-variable">find_nth_occurrence</span>(<span class="cm-string">"example"</span>, <span class="cm-variable">string</span>, <span class="cm-number">3</span>) <span class="cm-operator">==</span> <span class="cm-number">65</span>
<span class="cm-variable">find_nth_occurrence</span>(<span class="cm-string">"example"</span>, <span class="cm-variable">string</span>, <span class="cm-number">4</span>) <span class="cm-operator">==</span> <span class="cm-operator">-</span><span class="cm-number">1</span>
</code></pre>
<pre style="display: none;"><code class="language-c"><span class="cm-keyword">const</span> <span class="cm-type">char</span> <span class="cm-type">*</span><span class="cm-variable">string</span> <span class="cm-operator">=</span> <span class="cm-string">"This is an example. Return the nth occurrence of example in this example string."</span>;
<span class="cm-variable">find_nth_occurrence</span>(<span class="cm-string">"example"</span>, <span class="cm-variable">string</span>, <span class="cm-number">1</span>) <span class="cm-operator">==</span> <span class="cm-number">11</span>
<span class="cm-variable">find_nth_occurrence</span>(<span class="cm-string">"example"</span>, <span class="cm-variable">string</span>, <span class="cm-number">2</span>) <span class="cm-operator">==</span> <span class="cm-number">49</span>
<span class="cm-variable">find_nth_occurrence</span>(<span class="cm-string">"example"</span>, <span class="cm-variable">string</span>, <span class="cm-number">3</span>) <span class="cm-operator">==</span> <span class="cm-number">65</span>
<span class="cm-variable">find_nth_occurrence</span>(<span class="cm-string">"example"</span>, <span class="cm-variable">string</span>, <span class="cm-number">4</span>) <span class="cm-operator">==</span> <span class="cm-operator">-</span><span class="cm-number">1</span>
</code></pre>
<pre><code class="language-java"><span class="cm-type">String</span> <span class="cm-variable">string</span> <span class="cm-operator">=</span> <span class="cm-string">"This is an example. Return the nth occurrence of example in this example string."</span>;
<span class="cm-variable">findNthOccurrence</span>(<span class="cm-string">"example"</span>, <span class="cm-variable">string</span>, <span class="cm-number">1</span>) <span class="cm-operator">==</span> <span class="cm-number">11</span>
<span class="cm-variable">findNthOccurrence</span>(<span class="cm-string">"example"</span>, <span class="cm-variable">string</span>, <span class="cm-number">2</span>) <span class="cm-operator">==</span> <span class="cm-number">49</span>
<span class="cm-variable">findNthOccurrence</span>(<span class="cm-string">"example"</span>, <span class="cm-variable">string</span>, <span class="cm-number">3</span>) <span class="cm-operator">==</span> <span class="cm-number">65</span>
<span class="cm-variable">findNthOccurrence</span>(<span class="cm-string">"example"</span>, <span class="cm-variable">string</span>, <span class="cm-number">4</span>) <span class="cm-operator">==</span> <span class="cm-operator">-</span><span class="cm-number">1</span>
</code></pre>
<p>Multiple occurrences of a substring are allowed to overlap, e.g.</p>
<pre style="display: none;"><code class="language-python"><span class="cm-variable">find_nth_occurrence</span>(<span class="cm-string">"TestTest"</span>, <span class="cm-string">"TestTestTestTest"</span>, <span class="cm-number">1</span>) <span class="cm-operator">==</span> <span class="cm-number">0</span>
<span class="cm-variable">find_nth_occurrence</span>(<span class="cm-string">"TestTest"</span>, <span class="cm-string">"TestTestTestTest"</span>, <span class="cm-number">2</span>) <span class="cm-operator">==</span> <span class="cm-number">4</span>
<span class="cm-variable">find_nth_occurrence</span>(<span class="cm-string">"TestTest"</span>, <span class="cm-string">"TestTestTestTest"</span>, <span class="cm-number">3</span>) <span class="cm-operator">==</span> <span class="cm-number">8</span>
<span class="cm-variable">find_nth_occurrence</span>(<span class="cm-string">"TestTest"</span>, <span class="cm-string">"TestTestTestTest"</span>, <span class="cm-number">4</span>) <span class="cm-operator">==</span> <span class="cm-operator">-</span><span class="cm-number">1</span>
</code></pre>
<pre style="display: none;"><code class="language-c"><span class="cm-variable">find_nth_occurrence</span>(<span class="cm-string">"TestTest"</span>, <span class="cm-string">"TestTestTestTest"</span>, <span class="cm-number">1</span>) <span class="cm-operator">==</span> <span class="cm-number">0</span>
<span class="cm-variable">find_nth_occurrence</span>(<span class="cm-string">"TestTest"</span>, <span class="cm-string">"TestTestTestTest"</span>, <span class="cm-number">2</span>) <span class="cm-operator">==</span> <span class="cm-number">4</span>
<span class="cm-variable">find_nth_occurrence</span>(<span class="cm-string">"TestTest"</span>, <span class="cm-string">"TestTestTestTest"</span>, <span class="cm-number">3</span>) <span class="cm-operator">==</span> <span class="cm-number">8</span>
<span class="cm-variable">find_nth_occurrence</span>(<span class="cm-string">"TestTest"</span>, <span class="cm-string">"TestTestTestTest"</span>, <span class="cm-number">4</span>) <span class="cm-operator">==</span> <span class="cm-operator">-</span><span class="cm-number">1</span>
</code></pre>
<pre><code class="language-java"><span class="cm-variable">findNthOccurrence</span>(<span class="cm-string">"TestTest"</span>, <span class="cm-string">"TestTestTestTest"</span>, <span class="cm-number">1</span>) <span class="cm-operator">==</span> <span class="cm-number">0</span>
<span class="cm-variable">findNthOccurrence</span>(<span class="cm-string">"TestTest"</span>, <span class="cm-string">"TestTestTestTest"</span>, <span class="cm-number">2</span>) <span class="cm-operator">==</span> <span class="cm-number">4</span>
<span class="cm-variable">findNthOccurrence</span>(<span class="cm-string">"TestTest"</span>, <span class="cm-string">"TestTestTestTest"</span>, <span class="cm-number">3</span>) <span class="cm-operator">==</span> <span class="cm-number">8</span>
<span class="cm-variable">findNthOccurrence</span>(<span class="cm-string">"TestTest"</span>, <span class="cm-string">"TestTestTestTest"</span>, <span class="cm-number">4</span>) <span class="cm-operator">==</span> <span class="cm-operator">-</span><span class="cm-number">1</span>
</code></pre>
</div>
<hr>
<div class="mt-4"><span><i class="icon-moon-tag "></i></span><div class="keyword-tag">Fundamentals</div></div>
</div>