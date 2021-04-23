package session8;
// The superclass Circle
public class Circle {
    // private instance variable
    private double radius;
    // Constructs a Circle instance with the given radius
    public Circle(double radius) {
        this.radius = radius;
    }
    // Return the radius
    public double getRadius() {
        return this.radius;
    }
    // Return the area of this circle
    public double getArea() {
        return radius * radius * Math.PI;
    }
    // Return a self-descriptive string
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
