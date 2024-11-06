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
    public Square getASpezificSquare(int height,int length){
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
}
