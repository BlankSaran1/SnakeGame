<%--
  Created by IntelliJ IDEA.
  User: tje
  Date: 09.11.2024
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>
        StartingSite
    </title>
    <style>
        body {
            background-color: linen;
            display: grid;
            width: auto;
            height: auto;
        }

        .PlayerInput {
            position: absolute;
            top: 30%;
            left: 40%;
            text-align: center;
            vertical-align: center;
            font-size: 40px;
        }

        .SpeedInput {
            position: absolute;
            top: 35%;
            left: 20%;
            text-align: center;
            vertical-align: center;
            font-size: 20px;
        }

        .WallInput {
            position: absolute;
            top: 35%;
            left: 60%;
            text-align: center;
            vertical-align: center;
            font-size: 20px;
        }


        .Player1Input span {
            text-align: right;
        }


        .StartGameButton {
            position: absolute;
            top: 60%;
            left: 45%;
            background: #997df5;
            border-style: outset;
            border-color: #997df5;
            height: 80px;
            width: 160px;
            text-shadow: none;
            horiz-align: center;
            vertical-align: center;
            font-size: 100px;
            color: white;
        }

        input[type=submit] {
            cursor: pointer;
            background: transparent;
            border: none;
            color: white;
            font-size: 60px;
            position: absolute;
        }

        input[type=text] {
            font-size: 80px;
            width: 300px;
        }

    </style>
</head>
<body>

<table>

    <form action="/init">
        <label>
            <div class="PlayerInput">
                <input type="text" name="player" placeholder="Name">
            </div>
            <div class="WallInput">
                <select name="edgeRules">
                    <option value="false" name="false">Mit offener Wand</option>
                    <option value="true" name="true">Mit geschlossener Wand</option>
                </select>

            </div>
            <div class="SpeedInput">
                Spielgeschwindigkeit
                <select name="gameSpeed">
                    <option value="100" name="100">ultra</option>
                    <option value="200" name="200">schnell</option>
                    <option value="300" name="300">normal</option>
                    <option value="400" name="400">langsam</option>
                </select>

            </div>


            <br>
            <div class="StartGameButton">
                <input type="submit" name="Start!" value="Start!">
            </div>

        </label>
    </form>


</table>
</body>
</html>