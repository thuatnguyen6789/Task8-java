package session8;

public class TestShape1 {
    public static void main(String[] args) {
        // Constructing a Shape instance poses problem!
        Shape s3 = new Shape("green");
        System.out.println(s3);
        // Shape[color=green]
        System.out.println("Area is " + s3.getArea()); // Invalid output
        // Shape unknown! Cannot compute area!
        // Area is 0.0
    }
}
