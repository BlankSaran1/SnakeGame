package game.model;

import java.util.Arrays;

public class Arena {
    /**
     * Hier ist die Idee, dass die Arena ein Zweidimensionales Brett aus Vierecken ist.
     * Somit kann hier die Höhe und Breite Angegeben, was auch die Bewegung der Schlange vereinfacht.
     */
    private Square[][] squares;
    private int length;
    private int height;
    private boolean gameIsLost;

    public boolean isGameIsLost() {
        return gameIsLost;
    }

    public void setGameIsLost(boolean gameIsLost) {
        this.gameIsLost = gameIsLost;
    }

    public Square[][] getSquares() {
        return squares;
    }

    public Square getASpezificSquare(int height, int length) {
        return squares[height][length];
    }

    public void setSquares(Square[][] squares) {
        this.squares = squares;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Hier wird die erste Instanz der Arena geladen.
     * Die Daten sind die Startvariablen, damit wir Anfangswerte haben,
     * wenn das Spiel Startet
     */
    public Arena() {
        this.height=16;
        this.length=16;
        squares = new Square[16][16];
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                squares[i][j] =new Square();
                setSquares(squares);
                if(i==0||j==0||i==15||j==15){
                    squares[i][j].setOutOfBounds(true);
                    squares[i][j].setHasNoContent(false);

                }
            }
        }

        squares[1][1].setHasApple(true);
        squares[8][4].setHasNoContent(false);
        squares[2][4].setHasBody(true);
        squares[2][4].setBodyAge(2);
        squares[1][4].setBodyAge(3);

        squares[3][4].setHasNoContent(false);
        squares[1][4].setHasBody(true);
        squares[2][4].setHasNoContent(false);
        squares[3][4].setHasBody(true);
        squares[3][4].setBodyAge(1);

        squares[1][4].setHasNoContent(false);

    }

    @Override
    public String toString() {
        return "Arena{" +
                "squares=" + Arrays.toString(squares) +
                ", length=" + length +
                ", height=" + height +
                '}';
    }


}
