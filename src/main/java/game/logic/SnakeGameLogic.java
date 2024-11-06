package game.logic;

import game.model.Arena;
import game.model.Snake;

public class SnakeGameLogic {
    /**
     * Die Idee bei der Entfernung aller alten bodies der Schlange ist, dass die Körperteile bei jeder Bewegung um 1
     * älter werden, weswegen wir bei dem Vergleich der geplanten Länge der Schlange und den ältesten Teilen der Schlange
     * immer wissen, ob das Ende "Sich mitbewegen" (entfernt werden) soll, oder dableibt.
     * @param arena
     * @param snake
     */
    public void removeSnakesTail(Arena arena,Snake snake){
        for (int i = 0; i < arena.getLength(); i++) {
            for (int j = 0; j < arena.getHeight(); j++) {
                if(arena.getASpezificSquare(i,j).getBodyAge()>snake.getSnakeLength()){
                    arena.getASpezificSquare(i,j).setBodyAge(0);
                    arena.getASpezificSquare(i,j).setHasBody(false);
                    arena.getASpezificSquare(i,j).setEmpty(true);
                }
            }

        }
    }

}
