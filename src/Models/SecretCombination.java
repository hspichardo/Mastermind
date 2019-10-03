package Models;

import Views.SecretCombinationView;

import java.util.*;
import java.util.stream.Collectors;

public class SecretCombination extends Combination {
    SecretCombinationView secretcombinarionview;

    public SecretCombination(){
        super();

        this.secretcombinarionview = new SecretCombinationView();
        combination = secretcombinarionview.generateSecretCombination();

    }

    public Color[] getSecret() {
        return combination;
    }





}
