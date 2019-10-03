package Controllers;

import Models.Game;
import Views.GameView;

public class Controller {
    private Game game;
    private GameView gameview;

    public Controller(Game game, GameView gameview) {
        this.game = game;
        this.gameview =gameview;

    }

}
