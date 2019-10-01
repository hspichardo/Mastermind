

import java.util.*;
import java.util.stream.Collectors;

public class SecretCombination {
    public Color[] secret;
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

    public void setSecret(Color[] secret) {
        this.secret = secret;
    }

    public Color[] getSecret() {
        return this.secret;
    }

    public Color [] generateSecretCombination(){
        Random rnd = new Random();
        Color [] key = new Color[4];
        int op = 0;
        char a;
        Integer [] codigoColores = generateRandomNumbers(0,6);
        for(int i = 0; i<4; i++){
            key[i]=new Color();
            key[i]=key[i].generateColor(codigoColores[i]);

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
        Color it;
        char o;
        char [] deadandwounded;
        deadandwounded = new char[]{' ', ' ', ' ', ' '};
        for(int i =0; i<proposal.length(); i++){
            for(int j=0 ; j<4; j++){
                it = this.secret[i];
                o = proposal.charAt(j);
                if(o == it.getName() && i==j){
                    dead++;
                    deadandwounded[i] = 'D';
                }
                else if(o == it.getName() && i!=j){
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
