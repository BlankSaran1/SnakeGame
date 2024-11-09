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
<div class="grid" id="gameBoard">
    <c:forEach var="i" begin="1" end="${data.arena.length}">
        <c:forEach var="j" begin="1" end="${data.arena.height}">
            <div class="square"></div>
        </c:forEach>
    </c:forEach>
</div>

<script>
    function updateBoard(data) {
        const arena = document.getElementById("gameBoard");
        const squares = arena.getElementsByClassName("square");
        let squareIndex = 0;
        for (let length = 0; length < data.arena.length; length++) {
            for (let height = 0; height < data.arena.length; height++) {
                squares[squareIndex].className="square"
                console.log(data.snake)
                if(data.arena.squares[height][length].hasApple){
                    squares[squareIndex].classList.add("apple");
                    console.log("Added an apple at")
                    console.log(length)
                    console.log(height)
                    console.log(squareIndex)
                }
                if(data.arena.squares[height][length].hasBody){
                    squares[squareIndex].classList.add("snake-body");
                    console.log("Added a body at")
                    console.log(length)
                    console.log(height)
                    console.log(squareIndex)
                }
                if(data.arena.squares[height][length].hasHead) {
                    squares[squareIndex].classList.add("snake-head");
                    console.log("Added a head at")
                    console.log(length)
                    console.log(height)
                    console.log(squareIndex)

                }
                if(data.snake.snakeY==height&&data.snake.snakeX==length)
                    squares[squareIndex].classList.add("snake-head")

                squareIndex++;
            }
        }
    }

    function fetchGameUpdate() {
        const repsonse= fetch("http://localhost:8080/getGameFiles")
            .then(response => {
                if (response.ok) {
                    return response.json();
                } else {
                    console.log("Fail");
                    throw new Error("Network response was not ok");
                }
            })
            .then(data => updateBoard(data))
            .catch(error => console.error('Error fetching game update:', error));
    }

    let cellNumber = 0;

    function turnFieldblue() {
        const grid = document.getElementById("gameBoard");
        const cells = grid.getElementsByClassName("square");
        cells[cellNumber].classList.add("snake-body");
        cellNumber++;

    }

    setInterval(fetchGameUpdate, 500);
    let snakeDirection = 0;

    document.addEventListener("keydown", function(event) {
        let newDirection = snakeDirection;

        switch(event.key) {
            case "ArrowRight":
                if (snakeDirection !== 2) newDirection = 0;
                break;
            case "ArrowDown":
                if (snakeDirection !== 3) newDirection = 1;
                break;
            case "ArrowLeft":
                if (snakeDirection !== 0) newDirection = 2;
                break;
            case "ArrowUp":
                if (snakeDirection !== 1) newDirection = 3;
                break;
        }

        if (newDirection !== snakeDirection) {
            snakeDirection = newDirection;
            if(snakeDirection==0){

                fetch("http://localhost:8080/updateDirection", {
                    method: "POST",
                    headers: {
                        "Content-Type": "application/x-www-form-urlencoded"
                    },
                    body: `direction=0`
                })
                    .then(response => {
                        if (!response.ok) {
                            throw new Error("Failed to update direction on server");
                        }
                    })
                    .catch(error => console.error("Error sending direction update:", error));

            }
            if(snakeDirection==1){

                fetch("http://localhost:8080/updateDirection", {
                    method: "POST",
                    headers: {
                        "Content-Type": "application/x-www-form-urlencoded"
                    },
                    body: `direction=1`
                })
                    .then(response => {
                        if (!response.ok) {
                            throw new Error("Failed to update direction on server");
                        }
                    })
                    .catch(error => console.error("Error sending direction update:", error));

            }
            if(snakeDirection==2){

                fetch("http://localhost:8080/updateDirection", {
                    method: "POST",
                    headers: {
                        "Content-Type": "application/x-www-form-urlencoded"
                    },
                    body: `direction=2`
                })
                    .then(response => {
                        if (!response.ok) {
                            throw new Error("Failed to update direction on server");
                        }
                    })
                    .catch(error => console.error("Error sending direction update:", error));

            }
            if(snakeDirection==3){

                fetch("http://localhost:8080/updateDirection", {
                    method: "POST",
                    headers: {
                        "Content-Type": "application/x-www-form-urlencoded"
                    },
                    body: `direction=3`
                })
                    .then(response => {
                        if (!response.ok) {
                            throw new Error("Failed to update direction on server");
                        }
                    })
                    .catch(error => console.error("Error sending direction update:", error));

            }
        }
    });

</script>

</body>
</html>
