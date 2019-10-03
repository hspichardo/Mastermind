package Models;

import Views.GameView;

import java.util.*;
public class Game {
    int attemps;
    public static SecretCombination solu;
    GameView gameview;
    public Game(){
        this.attemps = 0;
        solu = new SecretCombination();
        this.gameview = new GameView();
    }

    public void startGame(){

        String seguir = "";
        Scanner input = new Scanner(System.in);
        ProposalCombination proposalCombination = new ProposalCombination();
        Result result = new Result();

        for(int i=0; i<solu.getSecret().length;i++){
            System.out.println(solu.getSecret()[i].getName());
        }
        gameview.printIntroduction();
        do {
            System.out.println("Proponer Combinación:");

            String propousal = new String();
            do {
                propousal = input.nextLine();

            } while (proposalCombination.proposedcombinationview.validateProposalSize(propousal) || proposalCombination.proposedcombinationview.validateProposalColors(propousal));


            proposalCombination.setProposalCombination(propousal);
            result = proposalCombination.checkProposal(solu);
            System.out.println(result.getResultArray());
            System.out.println("Tienes " + result.getDeads() + " Muertes y " + result.getWoundeds() + " Heridos");
            this.attemps++;
            System.out.println("Intentos: "+ this.attemps);
            if(result.getDeads() == 4){
                System.out.println("Has ganado!!!");
                System.out.println("Seguir Jugando?: s o n");
                seguir = input.nextLine();
                if (seguir.compareTo("s")==0){
                    this.startGame();
                }
                else{
                    System.exit(0);
                    break;
                }

            }
        }while(this.attemps<10);

        if(this.attemps == 10){
            System.out.println("Has perdido!!!");
        }

        seguir = input.nextLine();
        if (seguir.compareTo("s")==0){
            this.startGame();
        }
        else{
            System.exit(0);
        }

    }



}
