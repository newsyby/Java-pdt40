package point;

public class CalculationDistanceBetweenPoints {

    static Point p1 = new Point(4, 5);
    static Point p2 = new Point(7, 7);

    public static void main(String[] args) {
        System.out.println("The distance is " + Point.distance(p1,p2));
    }
}
