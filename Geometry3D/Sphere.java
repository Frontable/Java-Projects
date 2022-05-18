public class Sphere extends Shape3D implements Calculations {
    private int radius;
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {//
        this.radius = radius;
    }
    public Sphere(int radius) {
        super(1, 1, 0);
        this.radius = radius;
    }
    public Sphere() {//
        super(1, 1, 0);
    }

    public boolean isPainted() {
        return true;
    }
    public String toString() {
        return "The sphere is " + super.toString() + " with radius = " + radius;
    }

    public double area() {
        return Math.PI*4*radius*radius;
    }
    public double volume() {
        return (Math.PI*4*radius*radius*radius)/3;
    }
}
