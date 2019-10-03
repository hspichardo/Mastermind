package Controllers;

import Models.Game;
import Views.GameView;

public class ContinueController extends Controller {
    public ContinueController(Game game, GameView gameview) {
        super(game, gameview);
        game.startGame();
    }
}
