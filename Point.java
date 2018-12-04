public class Point {
    public double x;
    public double y;

    public Point(double a, double b) {
        x = a;
        y = b;
    }

    public static double length(Point p1, Point p2) {
        return Math.sqrt( Math.pow(p1.x - p1.y, 2) + Math.pow(p2.x - p2.y,2) );
    }



}
