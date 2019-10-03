package Views;

import Models.*;

public class ProposedCombinationView extends Combination {


    public ProposedCombinationView(ProposalCombination proposalcombination) {

    }
    public ProposedCombinationView(){

    }



    public boolean validateProposalSize(String proposal){
        if(proposal.length() != 4) {
            System.out.println("Propuesta Incorrecta debe contener 4 caracteres");
            System.out.println("Proponer Combinación:");
            return true;
        }
        else return false;
    }

    public boolean validateProposalColors(String proposal){
        char it = ' ';
        char[] validador = {'r','b','y','g','o','p'};
        int acum = 0;
        for(int i =0; i< proposal.length(); i++ ){
            for(int j=0; j<validador.length;j++){
                if(proposal.charAt(i) == validador[j]){

                    acum++;
                }

            }

        }
        if(acum == 4) {

            return false;

        }
        else {
            System.out.println("Caracteres incorrectos, debe ser r b y g o p");
            System.out.println("Proponer Combinación:");

            return true;
        }

    }
}
