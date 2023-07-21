package T3;

public class Circle implements iPlanarShape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return 3.14*radius*radius;
    }

}
