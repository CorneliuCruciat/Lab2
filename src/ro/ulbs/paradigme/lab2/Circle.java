package ro.ulbs.paradigme.lab2;

class Circle extends Form {
    public float radius;

    public Circle() {
        this.radius = 0.0F;
    }

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    public float getArea() {
        return (float)Math.PI * this.radius * this.radius;
    }

    public String toString() {
        return "This form have " + this.radius;
    }
}