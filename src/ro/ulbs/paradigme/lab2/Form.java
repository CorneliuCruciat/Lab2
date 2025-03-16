package ro.ulbs.paradigme.lab2;

public class Form {
    private String color;
    public int area;

    public Form() {
        this.color = "white";
        this.area = 5;
    }

    public Form(String n, int a) {
        this.color = "white";
        this.area = 5;
    }

    public Form(String n) {
        this(n, 5);
    }

    public float getArea() {
        return (float)this.area;
    }

    public String toString() {
        return "This form has the color " + this.color;
    }
}
