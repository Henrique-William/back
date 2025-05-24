package algorithms.beginner;

public class MultiplicationTable {
    public static void Table(double n1, int n2) {
        for (int i = 1; i <= n2; i++) {
            double result = n1 * i;
            System.out.println(n1 + " X " + i + " = " + result);
        }
    }
}
