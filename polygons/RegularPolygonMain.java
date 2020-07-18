package polygons;

/**
 * Assignment-4, exercise-
 *
 * @author Sophia Hjörnhede
 * @version 1.10 11 July 2020
 */

import static polygons.RegularPolygon.totalSides;

class RegularPolygonMain  {
    private RegularPolygon regularTriagle;


    public static void main(String[] args) {
        RegularPolygon[] regularPolygons = new RegularPolygon[5];
        RegularPolygon regularPolygon1 = new EquilateralTriangle(5.5);
        RegularPolygon regularPolygon2 = new EquilateralTriangle(5.5);
        RegularPolygon regularPolygon3 = new Square(5.5);
        RegularPolygon regularPolygon4 = new Square(5.5);
        System.out.println("Side length triangle " + regularPolygon1.getSideLength());
        System.out.println("Number of sides triangle " + regularPolygon1.getNumSides());
        System.out.println("Square interiorAngle "+ regularPolygon3.getInteriorAngle());
        System.out.println("EquilateralTriangle interiorAngle "+ regularPolygon2.getInteriorAngle());
        regularPolygons[1]=regularPolygon1;
        regularPolygons[2]=regularPolygon2;
        regularPolygons[3]=regularPolygon3;
        regularPolygons[4]=regularPolygon4;
        // regularPolygons[1]=regularPolygon1;
        System.out.println("Totalt antal sidor i array " +totalSides(regularPolygons));
    }


}