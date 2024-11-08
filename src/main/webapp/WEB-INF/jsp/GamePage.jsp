<%--
  Created by IntelliJ IDEA.
  User: tje
  Date: 08.11.2024
  Time: 09:20
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Snake Game</title>
    <style>
        .grid {
            display: grid;
            grid-template-columns: repeat(16, 30px);
            grid-template-rows: repeat(16, 30px);
        }

        .square {
            width: 30px;
            height: 30px;
            background-color: black;
            border: 1px solid #333;
        }

        .apple {
            background-color: red;
        }

        .snake-body {
            background-color: green;
        }

        .snake-head {
            background-color: yellow;
        }
    </style>
</head>
<body>

<h1>Snake Game</h1>

<div class="grid">
    <c:forEach var="length" begin="0" end="${data.arena.length}">
        <c:forEach var="height" begin="0" end="${data.arena.height}">
            <c:choose>
                <c:when test="${data.arena.getASpezificSquare(height,length).hasApple}">
                    <div class="square apple"></div>
                </c:when>
                <c:when test="${data.arena.getASpezificSquare(height,length).hasHead}">
                    <div class="square snake-head"></div>
                </c:when>
                <c:when test="${data.arena.getASpezificSquare(height,length).hasBody}">
                    <div class="square snake-body"></div>
                </c:when>
                <c:otherwise>
                    <div class="square"></div>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </c:forEach>
</div>

</body>
</html>

