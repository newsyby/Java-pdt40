package point;

public class CalculationDistanceBetweenPoints {

    static Point p1 = new Point(0, 1);
    static Point p2 = new Point(0, 2);

    public static void main(String[] args) {
        System.out.println("The distance is " + Point.distance(p1,p2));
    }
}
