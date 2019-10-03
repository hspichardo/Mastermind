package Views;

import Models.Color;
import Models.SecretCombination;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class SecretCombinationView {

    public Color[] generateSecretCombination(){
        Random rnd = new Random();
        Color [] key = new Color[4];
        Integer [] codigoColores = generateRandomNumbers(0,6);
        for(int i = 0; i<4; i++){
            key[i]=new Color();
            key[i]=key[i].generateColor(codigoColores[i]);
        }
        return key;
    }

    private static Integer[] generateRandomNumbers(int start, int end){
        Random random = new Random();
        List<Integer> temp;
        temp =  random.ints(start,end).distinct().limit(4).boxed().collect(Collectors.toList());
        Integer[] numeros = temp.toArray(new Integer[temp.size()]);

        return numeros;
    }

    public void printSecret(SecretCombination solu){
        for(int i=0; i<solu.getSecret().length;i++){
            System.out.println(solu.getSecret()[i].getName());
        }
    }
}
