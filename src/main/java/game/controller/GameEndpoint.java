package game.controller;

import game.logic.SnakeGameTurn;
import game.model.IndividualGameData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;


@Controller
public class GameEndpoint {
    private final AtomicLong counter = new AtomicLong();
    private final Map<Long, IndividualGameData> gameID = new HashMap<>();
    SnakeGameTurn snakeGameTurn = new SnakeGameTurn();

    @GetMapping("/")
    public String mainPage() {
        return "MainPage";
    }

    @GetMapping("/init")
    public String initialize(Model model, @RequestParam(value = "playername", defaultValue = "player") String player) {


        Long id = counter.incrementAndGet();
        IndividualGameData individualGameData = new IndividualGameData(player, id);
        gameID.put(id, individualGameData);
        model.addAttribute("data", individualGameData);
        individualGameData.setInit(true);

        return "GamePage";
    }

    @GetMapping("/getGameFiles")
    @ResponseBody
    private IndividualGameData convertBoardToJson() {
        if (counter.get() == 0) {
            return null;
        }

        IndividualGameData individualGameData = gameID.get(counter.get());
        snakeGameTurn.gameTurn(individualGameData.getArena(), individualGameData.getSnake());
        return individualGameData;
    }
    @PostMapping("/updateDirection")
    public void updateDirection(@RequestParam int direction) {
        gameID.get(counter.get()).getSnake().setSnakeDirection(direction);
        System.out.println("Direction updated to: " + direction); // Log for debugging
    }
}
