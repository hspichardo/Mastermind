package Views;

import Models.ProposalCombination;
import Models.Result;
import Models.SecretCombination;

import java.util.Scanner;

public class GameView {
    public GameView(){

    }

    public void printIntroduction(){
        System.out.println();
        System.out.println("------------ Bienvenido al juego MasterMind -----------");
        System.out.println("Colores: r b y o p g");
        System.out.println("Clave Generada: ****");
    }
    public void printRules(){
        System.out.println();
        System.out.println("Tienes 10 intentos, si aciertas el color pero no la posicion obtendras un herido");
        System.out.println("En caso de que aciertes posicion y color tendras una muerte");
        System.out.println("Se mostrara las posiciones de muertos y heridos despues de ingresar tu propuesta");
    }
    public void printDeadsandWoundeds(Result result){
        System.out.println(result.getResultArray());
        System.out.println("Tienes " + result.getDeads() + " Muertes y " + result.getWoundeds() + " Heridos");

    }

    public ProposalCombination askProposal(){
        String seguir = "";
        Scanner input = new Scanner(System.in);
        ProposalCombination proposalCombination = new ProposalCombination();

            System.out.println("Proponer Combinación:");

            String propousal = new String();
            do {
                propousal = input.nextLine();

            } while (proposalCombination.proposedcombinationview.validateProposalSize(propousal) || proposalCombination.proposedcombinationview.validateProposalColors(propousal));
            proposalCombination.setProposalCombination(propousal);
            return proposalCombination;
        }

     public boolean PlayAgain(){
         Scanner input = new Scanner(System.in);
         String seguir = " ";

         System.out.println("Seguir Jugando?: s o n");
         seguir = input.nextLine();
         if (seguir.compareTo("s")==0){
             return true;
         }
         else{
             return false;
         }
     }

    public boolean checkifwin(Result result) {
        if (result.getDeads() == 4) {

            return true;
        } else {
            return false;
        }
    }
    public void endGame(SecretCombination solu){
        System.out.println("Has perdido!!!");
        System.out.println("La solucion era: ");
        solu.secretcombinarionview.printSecret(solu);
    }



}
