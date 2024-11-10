package game.model;

/**
 * Diese Klasse wird vor allen Dingen benutzt, um die Daten von einem Individuellen
 * Spiel zu speichern und zur Front-End zu geben
 */
public class IndividualGameData {
    private String playerName;
    private Arena arena;
    private Snake snake;
    private long ownID;
    private boolean isInit;
    private boolean edgeRules;
    private int gameSpeed;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Arena getArena() {
        return arena;
    }

    public void setArena(Arena arena) {
        this.arena = arena;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public long getOwnID() {
        return ownID;
    }

    public void setOwnID(long ownID) {
        this.ownID = ownID;
    }

    public boolean isInit() {
        return isInit;
    }

    public void setInit(boolean init) {
        isInit = init;
    }

    public IndividualGameData(String playerName, long id, int gameSpeed, boolean edgeRules) {
        this.gameSpeed = gameSpeed;
        this.edgeRules = edgeRules;
        this.playerName = playerName;
        setOwnID(id);
        Arena arena = new Arena(edgeRules, gameSpeed);
        setArena(arena);
        Snake snake = new Snake();
        setSnake(snake);
    }

    @Override
    public String toString() {
        return "IndividualGameData{" +
                "playerName='" + playerName + '\'' +
                ", arena=" + arena +
                ", snake=" + snake +
                ", ownID=" + ownID +
                ", isInit=" + isInit +
                '}';
    }
}
