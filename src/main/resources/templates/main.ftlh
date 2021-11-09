<!DOCTYPE html>
<html>
<head>
<title>Sweater</title>
</head>
<body>
<h1>Sweater</h1><hr>
<h3>Messages:</h3>
<#list messages as message>
    <p><b>${message.title} : </b>${message.text} : <i>${message.author}</i></p>
</#list>
<hr>
<h3>Create new message</h3>
<form action="/create" method="post">
    Title: <input type="text" name="title"/><br><br>
    Text: <input type="text" name="text"/><br><br>
    Author: <input type="text" name="author"/><br><br>
    <button type="submit">Create</button>
</form>
</body>
</html>