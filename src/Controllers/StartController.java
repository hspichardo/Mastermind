package Controllers;

import Models.Game;
import Views.GameView;

public class StartController extends Controller {
    public StartController(Game game, GameView gameview) {
        super(game, gameview);
        gameview.printIntroduction();
        gameview.printRules();
    }
}
