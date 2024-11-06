package game.model;

/**
 * Die Klasse ist vor allen Dingen da, da die Schlange ein wichtiges Teil des Spiels ist. Gespeichert wird hier zwar
 * nur die Länge und die Position des Kopfes, aber es vereinfacht die Ansicht des Codes
 */
public class Snake {
    private int SnakeLength;
    private int SnakeX;
    private int SnakeY;
    private int SnakeDirection;

    public int getSnakeDirection() {
        return SnakeDirection;
    }

    public void setSnakeDirection(int snakeDirection) {
        SnakeDirection = snakeDirection;
    }

    public int getSnakeX() {
        return SnakeX;
    }

    public void setSnakeX(int snakeX) {
        SnakeX = snakeX;
    }

    public int getSnakeY() {
        return SnakeY;
    }

    public void setSnakeY(int snakeY) {
        SnakeY = snakeY;
    }

    public int getSnakeLength() {
        return SnakeLength;
    }

    public void setSnakeLength(int snakeLength) {
        SnakeLength = snakeLength;
    }

}
