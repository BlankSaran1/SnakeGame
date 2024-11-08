package game.controller;

import game.model.IndividualGameData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;


@Controller
public class GameEndpoint {
    private final AtomicLong counter = new AtomicLong();
    private final Map<Long, IndividualGameData> gameID = new HashMap<>();

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


}
