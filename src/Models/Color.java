package Models;

public class Color {
    private char name;

    public Color(char name){
        this.name = name;

    }
    public Color(){
        this.name = ' ';
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }
    public Color generateColor(int indicador) {
        switch (indicador) {
            case 0:
                return new Color('r');
            case 1:
                return new Color('b');
            case 2:
                return new Color('y');
            case 3:
                return new Color('g');
            case 4:
                return new Color('o');
            default:
                return new Color('p');
        }
    }
}
