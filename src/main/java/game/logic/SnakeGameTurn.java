package game.logic;

import game.model.Arena;
import game.model.Snake;

/**
 * Die Klasse wurde erstellt, damit die Abfolge der Züge klar verständlicht wird: Zuerst wird die Position des Kopfes
 * verändert, dann wird geschaut, ob der Kopf im Körper oder der Wand ist, dann wird nach dem Apfel geschaut, und dann
 * der Körper erstellt und verändert.
 */
public class SnakeGameTurn {
    SnakeGameLogic logic = new SnakeGameLogic();

    /**
     * Hier wird der Zug tatsächlich ausgeführt. Diese Methode bewegt die Schlange, checkt fürs Spielende, und
     * Regel das neuerscheinen von Äpfeln
     * @param arena
     * @param snake
     */
    public void gameTurn(Arena arena, Snake snake) {
        logic.addAndAgeSnakeBody(arena, snake);
        logic.removeSnakesTail(arena, snake);
        logic.SnakeMovement(arena, snake);
        logic.checkForGameEnd(arena, snake);
        logic.checkForApple(arena, snake);

    }
}