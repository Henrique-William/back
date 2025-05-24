//Fibonacci Sequence

package algorithms.beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSequence {
    private List<Integer> generateFibonacci(int max) {
        List<Integer> fibonacci = new ArrayList<>();
        int n1 = 0, n2 = 1;

        for (int i = 0; i < max; i++) {
            fibonacci.add(n1);
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        return fibonacci;
    }

    public void printFibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number of terms from fibonacci sequence: ");
        int max = scanner.nextInt();
        scanner.close();

        System.out.println(generateFibonacci(max));
    }
}