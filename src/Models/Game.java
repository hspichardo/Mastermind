package Models;

import Views.GameView;

import java.util.*;
public class Game {
    int attemps;
    public static SecretCombination solu;
    GameView gameview;
    Result result;

    public Game(){
        this.attemps = 0;
        solu = new SecretCombination();
        this.gameview = new GameView();
        this.result = new Result();
    }

    public Result getResult() {
        return result;
    }

    public int getAttemps() {
        return attemps;
    }

    public void startGame(){

        String seguir = "";
        Scanner input = new Scanner(System.in);
        ProposalCombination proposalCombination = new ProposalCombination();



        gameview.printIntroduction();
        gameview.printRules();
        do{
        proposalCombination = gameview.askProposal();


            this.result = proposalCombination.checkProposal(solu);
            gameview.printDeadsandWoundeds(result);
            this.attemps++;
            System.out.println("Intentos: "+ this.attemps);

    /*
        */
        if (result.getDeads()==4) break;
        }while(this.attemps<10);



    }







}
