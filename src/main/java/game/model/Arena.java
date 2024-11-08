package game.model;

public class Arena {
    /**
     * Hier ist die Idee, dass die Arena ein Zweidimensionales Brett aus Vierecken ist.
     * Somit kann hier die Höhe und Breite Angegeben, was auch die Bewegung der Schlange vereinfacht.
     */
    private Square[][] squares;
    private int length;
    private int height;

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
        this.height=15;
        this.length=15;
        squares = new Square[16][16];
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                squares[i][j] =new Square();
                setSquares(squares);
            }
        }
        squares[8][4].setHasApple(true);
        squares[4][4].setHasHead(true);
        squares[2][4].setHasBody(true);
        squares[3][4].setHasBody(true);
        squares[1][4].setHasBody(true);

    }
}
