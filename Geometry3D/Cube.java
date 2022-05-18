public class Cube extends Shape3D implements Calculations{
    private int side;
    public int getSide() {
        return side;
    }
    public void setSide(int side) {//
        this.side = side;
    }
    public Cube(int side) {
        super(6, 8, 8);
        this.side = side;
    }
    public Cube() {
        super(6, 8, 8);
    }

    public boolean isPainted() {
        return false;
    }
    public String toString() {
        return "The cube is " + super.toString() + " with side's length = " + side;
    }
    public double area() {
        return 6*(Math.pow(side, 2));
    }
    public double volume() {
        return Math.pow(side, 3);
    }
}
