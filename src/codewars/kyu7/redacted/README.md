<div class="markdown prose max-w-none mb-8" id="description"><h1><a href="https://www.codewars.com/kata/5b662d286d0db722bd000013" target="_blank">Redacted!</a></h1><h1 id="meanwhile-somewhere-in-a-pentagon-basement">Meanwhile... somewhere in a Pentagon basement</h1>
<p>Your job is to compare two confidential documents that have come into your possession.</p>
<p>The first document has parts <a href="https://www.merriam-webster.com/dictionary/redacted" data-turbolinks="false" target="_blank">redacted</a>, and the other one doesn't.</p>
<img style="width:300px" src="https://i.imgur.com/8BSbFEy.png">

<p>But the original (unredacted) document might be a fake!</p>
<p>You need to compare the two documents and decide if it is <em>possible</em> they are the <strong>same</strong> or not.</p>
<h1 id="kata-task">Kata Task</h1>
<p>Return <code>true</code> if the two documents are possibly the same. Return <code>false</code> otherwise.</p>
<h2 id="notes">Notes</h2>
<ul>
<li>Each document is made of any visible characters, spaces, punctuation, and newlines <code>\n</code></li>
<li>Any character might be redacted (except <code>\n</code>)</li>
<li>The redaction character is <code>X</code></li>
<li>The redacted document is always the first one</li>
</ul>
<h1 id="examples">Examples</h1>
<style>
#mytable {
  width: 75%;
  margin-bottom: 20px;
}

#mytable #myth, #mytd {
border-collapse: collapse;
border: 2px solid gray;
padding: 3px 15px 3px 15px;
}
</style>

<table id="mytable">
<tbody><tr id="mytr"><th id="myth">Document 1 (redacted)</th><th id="myth">Document 2 (original)</th><th id="myth">Possibly&nbsp;Same?</th></tr>
<tr>
<td id="mytd">
<pre style="background-color:white;color:gray">TOP SECRET:
The missile launch code for Sunday <span style="background-color:black">XXXXXXXXXX</span> is:
<span style="background-color:black">XXXXXXXXXXXXXXXXX</span>
</pre></td><td id="mytd">
<pre style="background-color:white;color:gray">TOP SECRET:
The missile launch code for Sunday 5th August is:
7-ZERO-8X-ALPHA-1
</pre></td><td id="mytd">
true
</td></tr>

<tr>
<td id="mytd">
<pre style="background-color:white;color:gray">The name of the mole is Professor <span style="background-color:black">XXXXX</span>
</pre></td><td id="mytd">
<pre style="background-color:white;color:gray">The name of the mole is Professor Plum
</pre></td><td id="mytd">
false
</td></tr>

<tr>
<td id="mytd">
<pre style="background-color:white;color:gray"><span style="background-color:black">XXXXXXXX</span> <span style="background-color:black">XXXXXXX</span> <span style="background-color:black">XXXXXXXXXXXXXXXXXXX</span>
<span style="background-color:black">XXXX</span> <span style="background-color:black">XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX</span> <span style="background-color:black">XXXXXXXXX</span> <span style="background-color:black">XXXXXXXXXXXXX</span> <span style="background-color:black">XXXXX</span>
</pre></td><td id="mytd">
<pre style="background-color:white;color:gray">Area-51. Medical Report. 23/Oct/1969
E.T. subject 4 was given an asprin after reporting sick for duty today
</pre></td><td id="mytd">
true
</td></tr>

</tbody></table>

</div>
<hr>
<div class="mt-4"><span><i class="icon-moon-tag "></i></span><div class="keyword-tag">Fundamentals</div></div>
</div></style></div>