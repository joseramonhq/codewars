<div class="description-content p-4">
<div class="markdown prose max-w-none mb-8" id="description"><h1><a href="https://www.codewars.com/kata/597770e98b4b340e5b000071" target="_blank">extract file name</a></h1><p>You have to extract a portion of the file name as follows:</p>
<ul>
<li>Assume it will start with date represented as long number</li>
<li>Followed by an underscore</li>
<li>You'll have then a filename with an extension</li>
<li>it will always have an extra extension at the end</li>
</ul>
<h2 id="inputs">Inputs:</h2>
<pre><code>1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION

1_This_is_an_otherExample.mpg.OTHEREXTENSIONadasdassdassds34

1231231223123131_myFile.tar.gz2
</code></pre>
<h2 id="outputs">Outputs</h2>
<pre><code>FILE_NAME.EXTENSION

This_is_an_otherExample.mpg

myFile.tar
</code></pre>
<p>Acceptable characters for random tests:</p>
<p><code>abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-0123456789</code></p>
<p>The recommended way to solve it is using RegEx and specifically groups.</p></code></pre>
</div>
<hr>
<div class="mt-4"><span><i class="icon-moon-tag "></i></span><div class="keyword-tag">Regular Expressions</div><div class="keyword-tag">Fundamentals</div></div>
</div>