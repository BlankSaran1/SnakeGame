<%--
  Created by IntelliJ IDEA.
  User: tje
  Date: 09.11.2024
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
    <meta charset="UTF-8">

    <title>Verloren</title>
    <style>

        body {
            background-color: linen;
            align-content: center;
            text-align: center;
            place-items: center;
            display: grid;
        }

h1{
   font-size: 60px;
    top: 30%;
    left: 50%;
}
        .form-submit-button {
            background: blue;
            border-style: outset;
            border-color: blue;
            height: 40px;
            width: 150px;
            text-shadow: none;
            horiz-align: center;
            vertical-align: center;
            font-size: 100px;
            color: white;
        }
        input[type=submit] {
            padding: 12px 45px;
            cursor: pointer;
            background: transparent;
            border: none;
            color: #ffff00;
        }


    </style>
</head>
<body>
<h1>Du hast verloren</h1>
<br>
<br>
<br>
<br>
<h1>Schlangenlänge: ${data.snake.snakeLength}</h1>
<form action="/init">
    <div class="form-submit-button">
    <input type="submit" name="nochmal" value="nochmal">
    </div>
</form>
<script>
</script>
</body>
</html>
