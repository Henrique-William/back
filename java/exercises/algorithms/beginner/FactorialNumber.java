package algorithms.beginner;

import java.util.Scanner;

public class FactorialNumber {
    private int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial cannot be defined as negative");
        }

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public void printFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an number to get the factorial: ");
        int a = scanner.nextInt();
        scanner.close();

        System.out.println(factorial(a));
    }
}

