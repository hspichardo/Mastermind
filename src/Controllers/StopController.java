package Controllers;

import Models.Game;
import Views.GameView;

public class StopController extends Controller {
    public StopController(Game game, GameView gameview) {
        super(game, gameview);
        if (game.getAttemps() < 10) {
            if (gameview.checkifwin(game.getResult())) {
                if (gameview.PlayAgain()) {
                    game = new Game();
                    game.startGame();
                } else {
                    System.exit(0);
                }
            }

        }
        else{
            gameview.endGame(game.solu);
            if (gameview.PlayAgain()) {
                game = new Game();
                game.startGame();
            } else {
                System.exit(0);
            }

        }
    }

}
