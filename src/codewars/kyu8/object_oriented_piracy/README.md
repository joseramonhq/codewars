<div class="w-full panel bg-ui-section"><h1><a href="https://www.codewars.com/kata/54fe05c4762e2e3047000add" target="_blank">Object Oriented Piracy</a></h1><h3 class="wf-title-alt">Description:</h3><div class="markdown prose max-w-5xl mx-auto overflow-x-auto break-words" id="description"><p>Ahoy matey!</p>
<p>You are a leader of a small pirate crew. And you have a plan.
With the help of OOP you wish to make a pretty efficient system to identify ships with a heavy booty on board. </p>
<p>Unfortunately for you, people weigh a lot these days, so how do you know if a ship is full of gold and not people?</p>
<p>You begin with writing a generic Ship class / struct:</p>
<pre style="display: none;"><code class="language-javascript"><span class="cm-keyword">function</span> <span class="cm-def">Ship</span>(<span class="cm-def">draft</span>,<span class="cm-def">crew</span>) {
 <span class="cm-keyword">this</span>.<span class="cm-property">draft</span> <span class="cm-operator">=</span> <span class="cm-variable-2">draft</span>;
 <span class="cm-keyword">this</span>.<span class="cm-property">crew</span> <span class="cm-operator">=</span> <span class="cm-variable-2">crew</span>;
}
</code></pre>
<pre style="display: none;"><code class="language-python"><span class="cm-keyword">class</span> <span class="cm-def">Ship</span>:
    <span class="cm-keyword">def</span> <span class="cm-def">__init__</span>(<span class="cm-variable-2">self</span>, <span class="cm-variable">draft</span>, <span class="cm-variable">crew</span>):
        <span class="cm-variable-2">self</span>.<span class="cm-property">draft</span> <span class="cm-operator">=</span> <span class="cm-variable">draft</span>
        <span class="cm-variable-2">self</span>.<span class="cm-property">crew</span> <span class="cm-operator">=</span> <span class="cm-variable">crew</span>
</code></pre>
<pre style="display: none;"><code class="language-csharp"><span class="cm-keyword">public</span> <span class="cm-keyword">class</span> <span class="cm-def">Ship</span>
{
  <span class="cm-keyword">public</span> <span class="cm-type">int</span> <span class="cm-variable">Draft</span>;
  <span class="cm-keyword">public</span> <span class="cm-type">int</span> <span class="cm-variable">Crew</span>;

<span class="cm-keyword">public</span> <span class="cm-variable">Ship</span>(<span class="cm-type">
int</span> <span class="cm-variable">draft</span>, <span class="cm-type">int</span> <span class="cm-variable">
crew</span>)
{
<span class="cm-variable">Draft</span> <span class="cm-operator">=</span> <span class="cm-variable">draft</span>;
<span class="cm-variable">Crew</span> <span class="cm-operator">=</span> <span class="cm-variable">crew</span>; } }
</code></pre>
<pre style="display: none;"><code class="language-rust"><span class="cm-keyword">struct</span> <span class="cm-def">Ship</span> {
  <span class="cm-variable">draft</span>: <span class="cm-atom">u32</span>,
  <span class="cm-variable">crew</span>: <span class="cm-atom">u32</span>,
}
</code></pre>
<pre><code class="language-java"><span class="cm-keyword">public</span> <span class="cm-keyword">class</span> <span class="cm-def">Ship</span> {
    <span class="cm-keyword">private</span> <span class="cm-keyword">final</span> <span class="cm-type">double</span> <span class="cm-variable">draft</span>;
    <span class="cm-keyword">private</span> <span class="cm-keyword">final</span> <span class="cm-type">int</span> <span class="cm-variable">crew</span>;
    
    <span class="cm-keyword">public</span> <span class="cm-variable">Ship</span>(<span class="cm-type">double</span> <span class="cm-variable">draft</span>, <span class="cm-type">int</span> <span class="cm-variable">crew</span>) {
        <span class="cm-keyword">this</span>.<span class="cm-variable">draft</span> <span class="cm-operator">=</span> <span class="cm-variable">draft</span>;
        <span class="cm-keyword">this</span>.<span class="cm-variable">crew</span> <span class="cm-operator">=</span> <span class="cm-variable">crew</span>;
    }
} 
</code></pre>
<p>Every time your spies see a new ship enter the dock, they will create a new ship object based on their observations:</p>
<ul>
<li>draft - an estimate of the ship's weight based on how low it is in the water</li>
<li>crew - the count of crew on board</li>
</ul>
<pre style="display: none;"><code class="language-javascript"><span class="cm-keyword">var</span> <span class="cm-def">titanic</span> <span class="cm-operator">=</span> <span class="cm-keyword">new</span> <span class="cm-variable">Ship</span>(<span class="cm-number">15</span>, <span class="cm-number">10</span>);
</code></pre>
<pre style="display: none;"><code class="language-python"><span class="cm-variable">Titanic</span> <span class="cm-operator">=</span> <span class="cm-variable">Ship</span>(<span class="cm-number">15</span>, <span class="cm-number">10</span>)
</code></pre>
<pre style="display: none;"><code class="language-csharp"><span class="cm-variable">Ship</span> <span class="cm-variable">titanic</span> <span class="cm-operator">=</span> <span class="cm-keyword">new</span> <span class="cm-variable">Ship</span>(<span class="cm-number">15</span>, <span class="cm-number">10</span>);
</code></pre>
<pre style="display: none;"><code class="language-rust">  <span class="cm-keyword">let</span> <span class="cm-def">titanic</span> <span class="cm-operator">=</span> <span class="cm-variable">Ship</span> {
      <span class="cm-variable">draft</span> : <span class="cm-number">15</span>,
      <span class="cm-variable">crew</span> : <span class="cm-number">10</span>,
  };
</code></pre>
<pre><code class="language-java"><span class="cm-variable">Ship</span> <span class="cm-variable">titanic</span> <span class="cm-operator">=</span> <span class="cm-keyword">new</span> <span class="cm-variable">Ship</span>(<span class="cm-number">15</span>, <span class="cm-number">10</span>);
</code></pre>
<h2 id="task">Task</h2>
<p>You have access to the ship "draft" and "crew". "Draft" is the total ship weight and "crew" is the number of humans on the ship.</p>
<p>Each crew member adds <code>1.5</code> units to the ship draft. If after removing the weight of the crew, the draft is still more than <code>20</code>, then the ship is worth looting. Any ship weighing that much must have a lot of booty!</p>
<p>Add the method</p>
<pre style="display: none;"><code class="language-javascript"><span class="cm-variable">isWorthIt</span>
</code></pre>
<pre style="display: none;"><code class="language-python"><span class="cm-variable">is_worth_it</span>
</code></pre>
<pre style="display: none;"><code class="language-rust"><span class="cm-variable">is_worth_it</span>(&amp;<span class="cm-keyword">self</span>)
</code></pre>
<pre style="display: none;"><code class="language-csharp"><span class="cm-variable">IsWorthIt</span>
</code></pre>
<pre><code class="language-java"><span class="cm-variable">isWorthIt</span>
</code></pre>
<p>to decide if the ship is worthy to loot. For example:</p>
<pre style="display: none;"><code class="language-javascript"><span class="cm-variable">titanic</span>.<span class="cm-property">isWorthIt</span>() <span class="cm-comment">// return false</span>
</code></pre>
<pre style="display: none;"><code class="language-python"><span class="cm-variable">Titanic</span>.<span class="cm-property">is_worth_it</span>()
<span class="cm-keyword">False</span>
</code></pre>
<pre style="display: none;"><code class="language-csharp"><span class="cm-variable">titanic</span>.<span class="cm-variable">IsWorthIt</span>() <span class="cm-operator">=&gt;</span> <span class="cm-atom">false</span>
</code></pre>
<pre style="display: none;"><code class="language-rust"><span class="cm-variable">titanic</span>.<span class="cm-variable">is_worth_it</span>() <span class="cm-operator">-&gt;</span> <span class="cm-builtin">false</span>
</code></pre>
<pre><code class="language-java"><span class="cm-variable">titanic</span>.<span class="cm-variable">isWorthIt</span>() <span class="cm-operator">==</span> <span class="cm-atom">false</span>
</code></pre>
<p>This Kata teaches you the very basics of method creation.</p>
<p>Good luck!</p></code></pre>
</div><div class="pt-4 max-w-5xl mx-auto"><div class="mt-4"><span><i class="icon-moon-tag "></i></span><div class="keyword-tag">Object-oriented Programming</div><div class="keyword-tag">Fundamentals</div></div></div></div>