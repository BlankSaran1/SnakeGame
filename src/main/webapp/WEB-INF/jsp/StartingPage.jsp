<%--
  Created by IntelliJ IDEA.
  User: tje
  Date: 09.11.2024
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>SnakeGame</title>
    <style>
        h1 {
            font-size: 80px;
        }

        body {
            background-color: linen;
            align-content: center;
            text-align: center;
            place-items: center;
            display: grid;

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

        .form-submit-button:hover {

        }
    </style>
</head>
<body>
<h1> Snake Time</h1>
<form action="/startGame">
    <div class="form-submit-button">
        <input type="submit" name="New Game" value="New Game">
    </div>

</form>
</body>
</html>
