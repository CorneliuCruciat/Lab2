package ro.ulbs.paradigme.lab2;

import java.io.PrintStream;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Triangle tri = new Triangle("red", 1.1F, 2.0F);
        Circle c = new Circle("yellow", 1.5F);
        Square sq = new Square("blue", 1.2F);
        PrintStream var10000 = System.out;
        float var10001 = tri.getArea();
        var10000.println("Area = " + var10001 + " details: " + String.valueOf(tri));
        var10000 = System.out;
        var10001 = c.getArea();
        var10000.println("Area = " + var10001 + " details: " + String.valueOf(c));
        var10000 = System.out;
        var10001 = sq.getArea();
        var10000.println("Area = " + var10001 + " details: " + String.valueOf(sq));
        Triangle tri2 = new Triangle("red", 1.1F, 2.0F);
        var10000 = System.out;
        boolean var12 = tri.equals(tri2);
        var10000.println("Triangle2 equals to Triangle1: " + var12);
        Triangle tri3 = new Triangle("brown", 1.1F, 2.0F);
        var10000 = System.out;
        var12 = tri.equals(tri3);
        var10000.println("Triangle3 equals to Triangle1: " + var12);
    }
}