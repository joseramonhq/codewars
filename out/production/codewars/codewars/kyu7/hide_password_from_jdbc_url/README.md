<div class="w-full panel bg-ui-section"><h1><a href="https://www.codewars.com/kata/5a726f16373c2ee6c60000db" target="_blank">Hide password from jdbc url
</a></h1><h3 class="wf-title-alt">Description:</h3><div class="markdown prose max-w-5xl mx-auto" id="description"><p>We have to create a function that receives a connection string with password included and you have to mask the password i.e. change password by asterisks.</p>
<p>Preconditions:</p>
<ul>
<li>non empty valid url</li>
<li>password always next to string section <code>password=</code></li>
<li>assume password will not contain ampersand sign for sake of simplicity</li>
<li>to make it more real it has non ASCII characters</li>
<li>"password=" and "user" will occur only once</li>
</ul>
<blockquote>
<p>empty passwords are not validated but best solutions take empty passwords into account</p>
</blockquote>
<p>Example:</p>
<hr>
<h2 id="input">input</h2>
<blockquote>
<p><code>jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&amp;password=12345</code></p>
</blockquote>
<h2 id="output">output</h2>
<blockquote>
<p><code>jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&amp;password=*****</code></p>
</blockquote>
<p>Extra readings:</p>
<p><a href="https://alvinalexander.com/java/jdbc-connection-string-mysql-postgresql-sqlserver" data-turbolinks="false" target="_blank">https://alvinalexander.com/java/jdbc-connection-string-mysql-postgresql-sqlserver</a></p>
</div><div class="pt-4 max-w-5xl mx-auto"><div class="mt-4"><span><i class="icon-moon-tag "></i></span><div class="keyword-tag">Strings</div><div class="keyword-tag">Regular Expressions</div><div class="keyword-tag">Fundamentals</div></div></div></div>