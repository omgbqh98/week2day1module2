public class Cylinder extends Circle {
    double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return Math.PI*getRadius()*getRadius()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                " volume= " +getVolume()+
                super.toString()+'}';
    }
}
