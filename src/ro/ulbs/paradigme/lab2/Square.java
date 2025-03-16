package ro.ulbs.paradigme.lab2;

public class Square extends Form {
    private float side;

    public Square() {
        this.side = 0.0F;
    }

    public Square(String color, float side) {
        super(color);
        this.side = side;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + ",and this is a Suare " + this.side;
    }
}
