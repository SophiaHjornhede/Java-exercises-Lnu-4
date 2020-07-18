package polygons;

/**
 * Assignment-4, exercise-
 *
 * @author Sophia Hjörnhede
 * @version 1.10 11 July 2020
 */

public class EquilateralTriangle implements RegularPolygon{
    // class attributes
    private double lenght;
    // Constructor
    public EquilateralTriangle(double length) {
        this.lenght = length;
    }

    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public double getSideLength() {
        return lenght;
    }
}
