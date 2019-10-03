package Models;

public class Result {
    public char[] resultArray;
    int deads;
    int woundeds;

    public Result() {
        this.resultArray = new char[4];
        this.deads =0;
        this.woundeds=0;
    }

    public char[] getResultArray() {
        return resultArray;
    }

    public void setResultArray(char[] resultArray) {
        this.resultArray = resultArray;
    }

    public int getDeads() {
        return deads;
    }

    public void setDeads(int deads) {
        this.deads = deads;
    }

    public int getWoundeds() {
        return woundeds;
    }

    public void setWoundeds(int woundeds) {
        this.woundeds = woundeds;
    }
}


