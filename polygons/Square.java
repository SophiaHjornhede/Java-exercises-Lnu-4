package polygons;

/**
 * Assignment-4, exercise-
 *
 * @author Sophia Hjörnhede
 * @version 1.10 11 July 2020
 */

public class Square implements RegularPolygon {
    private double length;
    // Constructor
    public Square(double length) {
        this.length = length;
    }

    // interface methods
    @Override
    public int getNumSides() {
        return 4;
    }

    @Override
    public double getSideLength() {
        return length;
    }
}
