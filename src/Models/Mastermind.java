package Models;

import Controllers.ContinueController;
import Controllers.Controller;
import Controllers.StartController;
import Controllers.StopController;
import Views.GameView;

public class Mastermind {

    private Game game;
    private GameView gameView;
    private StartController startController;
    private ContinueController continueController;
    private StopController stopController;

    public Mastermind(){
        this.game = new Game();
        this.gameView = new GameView();
        this.startController = new StartController(this.game,this.gameView);
        this.continueController = new ContinueController(this.game, this.gameView);
        this.stopController = new StopController(this.game,this.gameView);
    }
    public static void main(String[] args) {
        Mastermind mastermind = new Mastermind();


    }
}
