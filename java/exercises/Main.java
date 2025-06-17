import algorithms.beginner.Calculator;
import algorithms.beginner.FactorialNumber;
import algorithms.beginner.FibonacciSequence;
import algorithms.beginner.PalindromeChecker;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        FibonacciSequence fibonacci = new FibonacciSequence();
        FactorialNumber factorialNumber = new FactorialNumber();
        PalindromeChecker palindromeChecker = new PalindromeChecker();

//        calculator.calculateAll();
//        fibonacci.printFibonacci();
//        factorialNumber.printFactorial();

        String string = "Arara";
        System.out.println(palindromeChecker.isPalindrome(string));


    }
}
