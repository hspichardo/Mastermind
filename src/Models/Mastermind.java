package Models;

public class Mastermind {
    private Game juego;
    public static void main(String[] args) {
        Mastermind mastermind = new Mastermind();

        mastermind.juego= new Game();
        mastermind.juego.startGame();

    }
}
