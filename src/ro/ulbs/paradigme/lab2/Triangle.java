package ro.ulbs.paradigme.lab2;

class Triangle extends Form {
    private float height;
    private float base;

    public Triangle() {
        this.height = 0.0F;
        this.base = 0.0F;
    }

    public Triangle(String color, float height, float base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    public float getArea() {
        return this.base * this.height / 2.0F;
    }

    public String toString() {
        return "This form have " + this.height + " and " + this.base;
    }

    public boolean equals(Triangle tr) {
        return this.height == tr.height && this.base == tr.base;
    }
}
