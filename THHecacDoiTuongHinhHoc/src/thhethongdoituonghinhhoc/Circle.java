package thhethongdoituonghinhhoc;

public class Circle extends Shape{
    private Double radius;

    public Circle() {
        radius = 1.0;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius=radius;
    }

    public Circle(double radius, String color, boolean filled ) {
        super(color,filled);
        this.radius = radius;

    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius " + getRadius() + " which is a subclass of "
                + super.toString();
    }
}
