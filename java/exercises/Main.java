import algorithms.beginner.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        FibonacciSequence fibonacci = new FibonacciSequence();
        FactorialNumber factorialNumber = new FactorialNumber();
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        MinMaxOfAnArray minMaxOfAnArray = new MinMaxOfAnArray();
        String string = "Arara";
        List<Integer> array = new ArrayList<>(Arrays.asList(1231, 213, 12, 123, 3312, 4444, 3892));

//        calculator.calculateAll();
//        fibonacci.printFibonacci();
//        factorialNumber.printFactorial();
//        System.out.println(palindromeChecker.isPalindrome(string));

        System.out.println(minMaxOfAnArray.MinAndMaxOfAnArray(array));

    }
}
