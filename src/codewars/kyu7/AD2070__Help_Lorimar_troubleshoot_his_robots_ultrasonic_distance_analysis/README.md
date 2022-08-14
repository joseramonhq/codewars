<div class="description-content p-4">
<div class="markdown prose max-w-none mb-8" id="description"><h1><a href="https://www.codewars.com/kata/57102bbfd860a3369300089c" target="_blank">AD2070: Help Lorimar troubleshoot his robots- ultrasonic distance analysis</a></h1><p>The year is 2070 and intelligent connected machines have replaced humans in most things. There are still a few critical jobs for mankind including machine software developer, for writing and maintaining the AI software, and machine forward deployed engineer for controlling the intelligent machines in the field. 
Lorimar is a forward deployed machine engineer and at any given time he controls thousands of BOT robots through real time interfaces and intelligent automation software. These interfaces are directly connected to his own brain so at all times his mind and the robots are one. They are pre-trained to think on their own but on occasion the human will direct the robot to perform a task. </p>
<p>There is an issue with the ultrasonic sensor data feed from BOT785 currently connected to Lorimar through a real time interface. The data feed from sensor five should be a series of floats representing the relative distance of objects within BOT785's path. The sensor error log has been saved for triage and Lorimar needs to search through the data to determine the mean and standard deviation of the distance variables. </p>
<p>You will be given a list of tuples extracted from the sensor logs:</p>
<pre><code class="language-python"><span class="cm-variable">sensor_data</span> <span class="cm-operator">=</span> [(<span class="cm-string">'Distance:'</span>, <span class="cm-number">116.28</span>, <span class="cm-string">'Meters'</span>, <span class="cm-string">'Sensor 5 malfunction =&gt;lorimar'</span>), (<span class="cm-string">'Distance:'</span>, <span class="cm-number">117.1</span>, <span class="cm-string">'Meters'</span>, <span class="cm-string">'Sensor 5 malfunction =&gt;lorimar'</span>), (<span class="cm-string">'Distance:'</span>, <span class="cm-number">123.96</span>, <span class="cm-string">'Meters'</span>, <span class="cm-string">'Sensor 5 malfunction =&gt;lorimar'</span>), (<span class="cm-string">'Distance:'</span>, <span class="cm-number">117.17</span>, <span class="cm-string">'Meters'</span>, <span class="cm-string">'Sensor 5 malfunction =&gt;lorimar'</span>)]
</code></pre>
<p>Return a tuple with the mean and standard deviation of the distance variables rounded to four decimal places. The variance should be computed using the formula for samples (dividing by N-1).</p>
<p>|Mean|   |Standard Deviation|</p>
<pre><code class="language-python">(<span class="cm-number">118.6275</span>, <span class="cm-number">3.5779</span>)
</code></pre>
<p>Hint (<a href="http://math.stackexchange.com/questions/15098/sample-standard-deviation-vs-population-standard-deviation" data-turbolinks="false" target="_blank">http://math.stackexchange.com/questions/15098/sample-standard-deviation-vs-population-standard-deviation</a>)</p>
<p>Please also try the other Kata in this series..</p>
<ul>
<li><a href="https://www.codewars.com/kata/57dc0ffed8f92982af0000f6" data-turbolinks="false" target="_blank">AD2070:Help Lorimar troubleshoot his robots-Search and Disable</a></li>
</ul>
</div>
<hr>
<div class="mt-4"><span><i class="icon-moon-tag "></i></span><div class="keyword-tag">Mathematics</div><div class="keyword-tag">Statistics</div><div class="keyword-tag">Algorithms</div></div>
</div>