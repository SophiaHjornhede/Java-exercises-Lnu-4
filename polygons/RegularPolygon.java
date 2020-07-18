package polygons;

public interface RegularPolygon {


    int getNumSides();

    double getSideLength();

    default double getPerimeter() {
        return getNumSides()*getSideLength();
    }

    default double getInteriorAngle() {
        double n= getNumSides();
        return (n-2)*180;

    }

    static int totalSides(RegularPolygon[] regularPolygon) {
        int sumOfSides=0;
        for(int i=0; i<regularPolygon.length;i++){
            if(regularPolygon[i]!=null) {
                sumOfSides += regularPolygon[i].getNumSides();
            }
        }

        return sumOfSides;
    }
}
