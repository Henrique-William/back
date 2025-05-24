//Simple calculator class with add, subtract, multiply, and divide methods

package algorithms.beginner;

import java.util.Scanner;

public class Calculator {
    private double add(double a, double b) {
        return a + b;
    }

    private double subtract(double a, double b) {
        return a - b;
    }

    private double multiply(double a, double b) {
        return a * b;
    }

    private double divide(double a, double b) {
        return a / b;
    }

    public void calculateAll() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter the first operand: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second operand: ");
        double b = scanner1.nextDouble();
        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));
    }
}
