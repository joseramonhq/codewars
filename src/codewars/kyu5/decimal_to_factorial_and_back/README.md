<div class="w-full panel bg-ui-section"><h1><a href="https://www.codewars.com/kata/54e320dcebe1e583250008fd" target="_blank">Decimal to Factorial and Back
</a></h1><h3 class="wf-title-alt">Description:</h3><div class="markdown prose max-w-5xl mx-auto overflow-x-auto break-words" id="description"><p>Coding decimal numbers with factorials is a way of writing out numbers 
in a base system that depends on factorials, rather than powers of numbers.</p>
<p>In this system, the last digit is always <code>0</code> and is in base 0!. The digit before that is either <code>0 or 1</code> and is in base 1!.  The digit before that is either <code>0, 1, or 2</code> and is in base 2!, etc.
More generally, the nth-to-last digit is always <code>0, 1, 2, ..., n</code> and is in base n!.</p>
<p>Read more about it at: <a href="http://en.wikipedia.org/wiki/Factorial_number_system" data-turbolinks="false" target="_blank">http://en.wikipedia.org/wiki/Factorial_number_system</a></p>
<h4 id="example">Example</h4>
<p>The decimal number <code>463</code> is encoded as <code>"341010"</code>, because:</p>
<p>463 = 3×5! + 4×4! + 1×3! + 0×2! + 1×1! + 0×0!</p>
<p>If we are limited to digits <code>0..9</code>, the biggest number we can encode is 10!-1 (= 3628799). So we extend <code>0..9</code> with letters <code>A..Z</code>. With these 36 digits we can now encode numbers up to 36!-1 (= 3.72 × 10<sup>41</sup>)</p>
<h4 id="task">Task</h4>
<p>We will need two functions. The first one will receive a decimal number and return a string with the factorial representation.</p>
<p><strong>Note:</strong> the input number is at most a long.</p>
<p>The second one will receive a string with a factorial representation and produce the decimal representation.</p>
<p>Given numbers will always be positive.</p>
</div><div class="pt-4 max-w-5xl mx-auto"><div class="mt-4"><span><i class="icon-moon-tag "></i></span><div class="keyword-tag">Algorithms</div></div></div></div>