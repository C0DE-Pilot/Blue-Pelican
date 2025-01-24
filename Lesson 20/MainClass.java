public class DistToLine 
{
    static double A;
    static double B;
    static double C;
    public static double getDist(double a, double b) 
    {
        double numerator = Math.abs(A * a + B * b + C);
        double denominator = Math.sqrt(A * A + B * B);
        return numerator / denominator;
    }
}