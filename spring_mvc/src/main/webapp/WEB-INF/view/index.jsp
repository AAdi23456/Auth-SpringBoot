
<%@page isELIgnored ='false'%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Form</title>
</head>
<body>
    <h2>User Form</h2>
    <form action="submit" method="post">
        <label for="username">UserName:</label><br>
        <input type="text" id="userName" name="userName"><br>
        <label for="email">Email:</label><br>
        <input type="email" id="Email" name="Email"><br><br>
        <label for="email">Password:</label><br>
        <input type="password" id="Password" name="Password"><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
