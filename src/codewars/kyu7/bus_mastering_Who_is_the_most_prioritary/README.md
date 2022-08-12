  <div class="w-full panel bg-ui-section"><h1><a href="https://www.codewars.com/kata/5a0366f12b651dbfa300000c/java" target="_blank">Bus mastering - Who is the most prioritary?</a></h1><h3 class="wf-title-alt">Description:</h3><div
                class="markdown prose max-w-5xl mx-auto" id="description"><p>When
                    multiple master devices are connected to a single bus (<a
                        href="https://en.wikipedia.org/wiki/System_bus"
                        data-turbolinks="false" target="_blank">https://en.wikipedia.org/wiki/System_bus</a>),
                    there needs to be an arbitration in order to choose which of
                    them can have access to the bus (and 'talk' with a slave).</p>
                <p>We implement here a very simple model of bus mastering. Given
                    <code>n</code>, a number representing the number of <strong>masters</strong>
                    connected to the bus, and a fixed priority order (the first
                    master has more access priority than the second and so
                    on...), the task is to choose the selected master.
                    In practice, you are given a string <code>inp</code> of
                    length <code>n</code> representing the <code>n</code>
                    masters' requests to get access to the bus, and you should
                    return a string representing the masters, showing which
                    (only one) of them was granted access:</p>
                <pre><code>The string 1101 means that master 0, master 1 and master 3 have requested
        access to the bus. 
        Knowing that master 0 has the greatest priority, the output of the function should be: 1000
        </code></pre>
                <h2 id="examples">Examples</h2>
                <pre><code class="language-c"><span class="cm-operator">*</span> <span class="cm-variable">arbitrate</span>(<span class="cm-string">"001000101"</span>, <span class="cm-number">9</span>) <span class="cm-operator">-&gt;</span> <span class="cm-string">"001000000"</span>
<span class="cm-operator">*</span> <span class="cm-variable">arbitrate</span>(<span class="cm-string">"000000101"</span>
        , <span class="cm-number">9</span>) <span class="cm-operator">-&gt;</span> <span class="cm-string">"000000100"</span>
        </code></pre>
                <pre style="display: none;"><code class="language-javascript"><span class="cm-operator">*</span> <span class="cm-variable">arbitrate</span>(<span class="cm-string">"001000101"</span>, <span class="cm-number">9</span>) <span class="cm-operator">-</span><span class="cm-operator">&gt;</span> <span class="cm-string">"001000000"</span>        
        <span class="cm-operator">*</span> <span class="cm-variable">arbitrate</span>(<span class="cm-string">"000000101"</span>, <span class="cm-number">9</span>) <span class="cm-operator">-</span><span class="cm-operator">&gt;</span> <span class="cm-string">"000000100"</span>       
        <span class="cm-operator">*</span> <span class="cm-string-2">`n`</span> <span class="cm-variable">is</span> <span class="cm-variable">not</span> <span class="cm-variable">mandatory</span> <span class="cm-keyword">for</span> <span class="cm-variable">solving</span> <span class="cm-variable">the</span> <span class="cm-variable">kata</span>
        </code></pre>
                <h2 id="notes">Notes</h2>
                <ul>
                <li><p>The resulting string (<code>char* </code>) should be
                        allocated in the <code>arbitrate</code> function, and
                        will be free'ed in the tests.</p>
                </li>
                <li><p><code>n</code> is always greater or equal to 1.</p>
                </li>
                </ul>
            </div></div>ss="pt-4 max-w-5xl mx-auto"><div class="mt-4"><span><i class="icon-moon-tag "></i></span><div class="keyword-tag">Strings</div><div class="keyword-tag">Fundamentals</div><div class="keyword-tag">Bits</div></div>