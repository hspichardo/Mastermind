package Models;

public class Combination {
   public  Color[] combination;

    public Combination() {
        this.combination = new Color[4];
    }

    public Color getColorAt(int index){
        return this.combination[index];
    }

    public Color[] getCombination() {
        return this.combination;
    }

    public  void setCombination(Color[] combination) {
        this.combination= combination;
    }
}
