
// COMMENT - For testing part 5.4

import java.util.HashSet;
import java.util.Set;

class Calculator {

    private int uniqueIDCounter;

    Calculator() {
        uniqueIDCounter = 0;
    }

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }

    /*
    Returns the n'th number in the fibonacci sequence
    https://en.wikipedia.org/wiki/Fibonacci_number
    Example below
    n = x
    1 = 1
    2 = 1
    3 = 2
    4 = 3
    5 = 5
    .
    .
    .
    etc
    */
    int fibonacciNumberFinder(int n) {
        if (n <= 0)
            return 0;
        else if (n == 1 || n == 2)
            return 1;
        else {
            int a = 1, b = 1, fib = 0;
            for (int i = 3; i <= n; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }
            return fib;
        }
    }

    /*
    Returns binary value of the given int number
    The binary number will be stored as a string
    if int a = 0 then this method returns: 0
    if int a = 10 then this method returns: 1010
    if int a = 16 then this method returns: 10000
    */
    String intToBinaryNumber(int number) {
        if (number == 0)
            return "0";
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.insert(0, number % 2);
            number = number / 2;
        }
        return binary.toString();
    }

    /*
    Create a completely unique String identifier for a given string
    Each createdID must contain the string n in its unaltered Form
    if String n = "Jason"
    then the created ID could be = Jasonklfgn3jknnvksdfm - Because it contains the unaltered String n and is unique

    if you run this function twice with the same String input, it must return 2 unique String IDs
    */
    String createUniqueID(String n) {
        String uniqueID = n + "-" + uniqueIDCounter;
        uniqueIDCounter++;
        return uniqueID;
    }
}
