package Models;

import Views.ProposedCombinationView;

public class ProposalCombination extends Combination {
    Result result;
    ProposedCombinationView proposedcombinationview;

    public ProposalCombination() {
        super();
        this.result = new Result();
        this.proposedcombinationview = new ProposedCombinationView();

    }

    public Color[] getPropousal(){
        return combination;
    }

    public void setProposalCombination(String proposal){
        for (int i=0; i<combination.length; i++){
            combination[i] = new Color(proposal.charAt(i));
        }
    }
    public Result checkProposal(SecretCombination secret){
        Result result = new Result();
        Color[] prop = this.getPropousal();
        int dead=0, wounded =0;
        char it;
        char o = ' ';

        for(int i =0; i<prop.length; i++){
            for(int j=0 ; j<secret.combination.length; j++){
                it = prop[i].getName();
                o = secret.combination[j].getName();
                if(o == it && i==j){
                    dead++;
                    result.getResultArray()[i] = 'D';
                }
                else if(o == it && i!=j){
                    wounded++;
                    result.getResultArray()[i] = 'W';
                }

            }
        }
        result.setDeads(dead);
        result.setWoundeds(wounded);
        return result;
    }



}
