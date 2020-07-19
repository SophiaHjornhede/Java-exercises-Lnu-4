package polygons;

/**
 * Assignment-4, exercise-3,main class
 *
 * @author Sophia Hjörnhede
 * @version 1.10 11 July 2020
 */

import static polygons.RegularPolygon.totalSides;

class RegularPolygonMain  {
    private RegularPolygon regularTriagle;

    public static void main(String[] args) {
        RegularPolygon[] regularPolygons = new RegularPolygon[5];
        RegularPolygon regularPolygon1 = new EquilateralTriangle(5);
        RegularPolygon regularPolygon2 = new EquilateralTriangle(6);
        RegularPolygon regularPolygon3 = new Square(7);
        RegularPolygon regularPolygon4 = new Square(8);
        System.out.println("Number of sides of the first polygon is: " + regularPolygon1.getNumSides());
        System.out.println("The first polygon's side length is: " + regularPolygon1.getSideLength());
        System.out.println("The first polygon's perimeter is: " + regularPolygon1.getPerimeter());
        System.out.println("The first polygon's interiorAngle is: "+ regularPolygon1.getInteriorAngle());
        System.out.println("  ");
        System.out.println("Number of sides of the third polygon is: " + regularPolygon3.getNumSides());
        System.out.println("The third polygon's side length is: " + regularPolygon3.getSideLength());
        System.out.println("The third polygon's perimeter is: " + regularPolygon3.getPerimeter());
        System.out.println("The third polygon's interiorAngle is: "+ regularPolygon3.getInteriorAngle());

        regularPolygons[1]=regularPolygon1;
        regularPolygons[2]=regularPolygon2;
        regularPolygons[3]=regularPolygon3;
        regularPolygons[4]=regularPolygon4;
        System.out.println("  ");
        System.out.println("The sum of the sides number of all the regular polygons is: " +totalSides(regularPolygons));
    }
}