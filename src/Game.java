import java.util.*;
public class Game {
    int attemps;
    private SecretCombination solu;
    public Game(){
        this.attemps = 0;
        this.solu = new SecretCombination();
    }

    public void startGame(){

        String seguir = "";
        Scanner input = new Scanner(System.in);
        System.out.println(solu.getSecret());
        System.out.println("------------ Bienvenido al juego MasterMind -----------");
        char [] solution = new char[4];
        solution = solu.getSecret();
        System.out.println("Clave Generada: ****");
        do {
            System.out.println("Proponer Combinación:");

            String propousal = new String();
            do {
                propousal = input.nextLine();

            } while (validateProposalSize(propousal) || validateProposalColors(propousal));
            char[] deadandwounded = new char[4];
            deadandwounded = solu.checkProposal(propousal);
            System.out.println(deadandwounded);
            System.out.println("Tienes " + solu.getDeads() + " Muertes y " + solu.getWounded() + " Heridos");
            this.attemps++;
            System.out.println("Intentos: "+ this.attemps);
            if(solu.getDeads() == 4){
                System.out.println("Has ganado!!!");
                System.out.println("Seguir Jugando?: s o n");
                seguir = input.nextLine();
                if (seguir.compareTo("s")==0){
                    this.startGame();
                }
                else{
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
