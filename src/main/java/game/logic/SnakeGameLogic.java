package game.logic;

import game.model.Arena;
import game.model.Snake;

public class SnakeGameLogic {
    /**
     * Die Idee bei der Entfernung aller alten bodies der Schlange ist, dass die Körperteile bei jeder Bewegung um 1
     * älter werden, weswegen wir bei dem Vergleich der geplanten Länge der Schlange und den ältesten Teilen der Schlange
     * immer wissen, ob das Ende "Sich mitbewegen" (entfernt werden) soll, oder dableibt.
     *
     * @param arena
     * @param snake
     */
    public void removeSnakesTail(Arena arena, Snake snake) {
        for (int i = 0; i < arena.getLength(); i++) {
            for (int j = 0; j < arena.getHeight(); j++) {
                if (arena.getASpezificSquare(i, j).getBodyAge() > snake.getSnakeLength()) {
                    arena.getASpezificSquare(i, j).setBodyAge(0);
                    arena.getASpezificSquare(i, j).setHasBody(false);
                    arena.getASpezificSquare(i, j).setEmpty(true);
                }
            }

        }
    }

    public void SnakeMovement(Snake snake) {
        if (snake.getSnakeDirection() == 0) {
            snake.setSnakeY(snake.getSnakeY() + 1);
        } else if (snake.getSnakeDirection() == 1) {
            snake.setSnakeX(snake.getSnakeX() + 1);
        } else if (snake.getSnakeDirection() == 2) {
            snake.setSnakeY(snake.getSnakeY() - 1);
        } else if (snake.getSnakeDirection() == 3) {
            snake.setSnakeX(snake.getSnakeX() - 1);
        }
    }

    public void checkForApple(Arena arena, Snake snake) {
        if (arena.getASpezificSquare(snake.getSnakeY(),snake.getSnakeX()).isHasApple()){
            arena.getASpezificSquare(snake.getSnakeY(),snake.getSnakeX()).setHasApple(false);
            snake.setSnakeLength(snake.getSnakeLength() + 1);
        }
    }
    public void addAndAgeSnakeBody(Arena arena, Snake snake) {
        arena.getASpezificSquare(snake.getSnakeY(),snake.getSnakeX()).setHasBody(true);
        arena.getASpezificSquare(snake.getSnakeY(),snake.getSnakeX()).setBodyAge(0);
        for (int i = 0; i < arena.getLength(); i++) {
            for (int j = 0; j < arena.getHeight(); j++) {
                if(arena.getASpezificSquare(j,i).isHasBody()){
                    arena.getASpezificSquare(j, i).setBodyAge(arena.getASpezificSquare(j, i).getBodyAge() + 1);
                }
            }
        }
    }
    public void checkForGameEnd(Arena arena, Snake snake) {
        if(arena.getASpezificSquare(snake.getSnakeY(),snake.getSnakeX()).isHasBody()|arena.getASpezificSquare(snake.getSnakeY(),snake.getSnakeX()).isOutOfBounds()){
            //TODO:Spielende Implementieren, falls der Spieler die Wand oder den Körper berührt
        }
    }


}
