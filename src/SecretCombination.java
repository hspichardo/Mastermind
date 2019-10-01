

import java.util.*;
import java.util.stream.Collectors;

public class SecretCombination {
    public char[] secret;
    int deads;
    int wounded;
    public SecretCombination(){
        secret = generateSecretCombination();
        this.deads = 0;
        this.wounded = 0;
    }

    public int getDeads() {
        return this.deads;
    }

    public void setDeads(int deads){
        this.deads = deads;
    }

    public int getWounded() {
        return this.wounded;
    }

    public void setWounded(int wounded) {
        this.wounded = wounded;
    }

    public void setSecret(char[] secret) {
        this.secret = secret;
    }

    public char[] getSecret() {
        return this.secret;
    }

    public char [] generateSecretCombination(){
        Random rnd = new Random();
        char [] key = new char[4];
        int op = 0;
        char a;
        Integer [] codigoColores = generateRandomNumbers(0,6);
        for(int i = 0; i<4; i++){

            a = generateColor(codigoColores[i]);
            key[i]=a;
        }
       return key;
    }

    public static Integer[] generateRandomNumbers(int start, int end){
        Random random = new Random();
        List<Integer> temp;
        temp =  random.ints(start,end).distinct().limit(4).boxed().collect(Collectors.toList());
        Integer[] numeros = temp.toArray(new Integer[temp.size()]);

        return numeros;
    }

    public char generateColor(int indicador){
        switch (indicador){
            case 0: return 'r';
            case 1: return 'b';
            case 2: return 'y';
            case 3: return 'g';
            case 4: return 'o';
            default: return 'p';
        }
    }

    /*public char [] decodeSolution(){
        ArrayList<Character> key = this.secret;
        Iterator<Character> iterator = key.iterator();
        char [] decodedKey = new char[4];

        int acum = 0;
        while(iterator.hasNext()){
            char tmp = iterator.next();
                decodedKey[acum] = tmp;
                acum ++;

        }
        return decodedKey;
    }*/

    public char[] checkProposal(String proposal){
        int dead=0, wounded =0;
        char it,o;
        char [] deadandwounded;
        deadandwounded = new char[]{' ', ' ', ' ', ' '};
        for(int i =0; i<proposal.length(); i++){
            for(int j=0 ; j<4; j++){
                it = this.secret[i];
                o = proposal.charAt(j);
                if(o == it && i==j){
                    dead++;
                    deadandwounded[i] = 'D';
                }
                else if(o == it && i!=j){
                    wounded++;
                    deadandwounded[i] = 'W';
                }

            }
        }
        this.setDeads(dead);
        this.setWounded(wounded);
        return deadandwounded;
    }


}
