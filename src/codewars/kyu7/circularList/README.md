<div class="description-content p-4">
<div class="markdown prose max-w-none mb-8" id="description"><h1><a href="https://www.codewars.com/kata/5b2e60742ae7543f9d00005d" target="_blank">Circular List</a></h1><p>Create a Circular List</p>
<p>A circular list is of finite size, but can infititely be asked for its previous and next elements. This is because it acts like it is joined at the ends and loops around.</p>
<p>For example, imagine a CircularList of <code>[1, 2, 3, 4]</code>. Five invocations of <code>next()</code> in a row should return 1, 2, 3, 4 and then 1 again. At this point, five invocations of <code>prev()</code> in a row should return 4, 3, 2, 1 and then 4 again.</p>
<p>Your CircularList is created by passing a vargargs parameter in, e.g. <code>new CircularList(1, 2, 3)</code>. Your list constructor/init code should throw an Exception if nothing is passed in.</p>
</div>
<hr>
<div class="mt-4"><span><i class="icon-moon-tag "></i></span><div class="keyword-tag">Lists</div><div class="keyword-tag">Data Structures</div><div class="keyword-tag">Fundamentals</div></div>
</div>