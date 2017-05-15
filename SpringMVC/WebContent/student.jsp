<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Student Information</h2>
  <form method="POST" action="/SpringMVC/result" method="POST">
    Name:<br>
    <input type="text" name="name"><br>
    Hobby:<br>
  <input type="text" name="hobby"><br><br>
  <input type="submit" value="Submit">
</form>
</body>
</html>