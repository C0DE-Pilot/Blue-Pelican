import java.util.Scanner;
public class DistTester 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the A value for the line: ");
        DistToLine.A = scanner.nextDouble();
        System.out.print("Enter the B value for the line: ");
        DistToLine.B = scanner.nextDouble();
        System.out.print("Enter the C value for the line: ");
        DistToLine.C = scanner.nextDouble();

        System.out.print("Enter the x coordinate of the point: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the y coordinate of the point: ");
        double y = scanner.nextDouble();

        double distance = DistToLine.getDist(x, y);
        System.out.println("Distance from the point to the line is: " + distance);
    }
}