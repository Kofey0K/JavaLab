import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Point> points = new HashSet<>();

        int n = 5;
        double a = 1;
        double b = 2;
        double c = 3;
        System.out.println("Amount of points: " + n + "\nLine A * x + B * y + C\nA = " + a + ". B = " + b + ". C = " + c + ".");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter amount of points");
//        while (!sc.hasNextInt()) {
//            System.out.println("Not a number. Try again");
//            sc.next();
//        }
//        int n = sc.nextInt();
        Random random = new Random();
        Point newPoint;
        for (int i = 0; i < n; i++) {
            do {
                newPoint = new Point((random.nextDouble() - 0.5) * 20, (random.nextDouble() - 0.5) * 20);
            } while (points.contains(newPoint));
            points.add(newPoint);
        }
        System.out.println("Points:");
//        for (Point point : points) {
//            System.out.println(point.toString());
//        }
        System.out.println(points);
        findNearestAndFurthestPoints(points, a, b, c);
        

    }

    static void findNearestAndFurthestPoints(Set<Point> points, double a, double b, double c) {
        double max = 0;
        double min = Double.POSITIVE_INFINITY;
        double distance;
        System.out.println("Distances:");
        for (Point point : points) {
            distance = point.findDistanceToLine(a, b, c);
            System.out.println(distance);
            if (distance < min) min = distance;
            if (distance > max) max = distance;
        }
        System.out.println("Max distance is " + max);
        System.out.println("Min distance is " + min);
    }
}
