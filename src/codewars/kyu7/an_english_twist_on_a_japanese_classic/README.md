<div class="description-content p-4">
<div class="markdown prose max-w-none mb-8" id="description"><h1><a href="https://www.codewars.com/kata/5b04be641839f1a0ab000151" target="_blank">An English Twist on a Japanese Classic</a></h1><h2 id="background">Background:</h2>
<p>In Japan, a game called Shiritori is played. The rules are simple, a group of people take turns calling out a word whose beginning syllable is the same as the previous player's ending syllable. For example, the first person would say the word ねこ, and the second player must make a word that starts with こ, like　こむぎ. This repeats until a player can not think of a word fast enough or makes a word that ends in ん, because there are no words that begin with ん　in the Japanese language.</p>
<p>English Shiritori has the same principle, with the first and last letters of words. That being said the lose condition is saying a word that doesn't start with the previous word's last letter or not saying a word quick enough. </p>
<p><code>For example: apple -&gt; eggs -&gt; salmon -&gt; nut -&gt; turkey ...</code></p>
<h1 id="your-task">Your Task:</h1>
<p>You will be given a list of strings, a transcript of an English Shiritori match. Your task is to find out if the game ended early, and return a list that contains every valid string until the mistake. If a list is empty return an empty list. If one of the elements is an empty string, that is invalid and should be handled. </p>
<hr>
<h3 id="examples">Examples:</h3>
<h2 id="all-elements-valid">All elements valid:</h2>
<p>The array <code>{"dog","goose","elephant","tiger","rhino","orc","cat"}</code></p>
<p>should return <code>{"dog","goose","elephant","tiger","rhino","orc","cat"}</code></p>
<h2 id="an-invalid-element-at-index-2">An invalid element at index 2:</h2>
<p>The array <code>{"dog","goose","tiger","cat", "elephant","rhino","orc"}</code> </p>
<p>should return <code>("dog","goose")</code> 
since goose ends in <code>'e'</code> and tiger starts with <code>'t'</code></p>
<h2 id="an-invalid-empty-string-at-index-2">An invalid empty string at index 2:</h2>
<p>The array <code>{"ab","bc","","cd"}</code> </p>
<p>should return <code>("ab","bc")</code></p>
<h2 id="all-invalid-empty-string-at-index-0">All invalid empty string at index 0:</h2>
<p>The array <code>{"","bc","","cd"}</code> </p>
<p>should return <code>An Empty List</code></p>
<hr>
<h2 id="resources">Resources:</h2>
<p><a href="https://en.wikipedia.org/wiki/Shiritori" data-turbolinks="false" target="_blank">https://en.wikipedia.org/wiki/Shiritori</a></p>
<h3 id="notes">Notes:</h3>
<p>  猫 = ねこ = neko = cat</p>
<p>  小麦 = こむぎ = komugi = wheat</p>
</div>
<hr>
<div class="mt-4"><span><i class="icon-moon-tag "></i></span><div class="keyword-tag">Fundamentals</div><div class="keyword-tag">Algorithms</div><div class="keyword-tag">Strings</div></div>
</div>