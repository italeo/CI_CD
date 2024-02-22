import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        if (args.length >= 2) {
            String operation = args[0];
            int[] operands = Arrays.stream(args).skip(1).mapToInt(Integer::parseInt).toArray();

            switch (operation) {
                case "add":
                    System.out.println(calculator.add(operands[0], operands[1]));
                    break;
                case "subtract":
                    System.out.println(calculator.subtract(operands[0], operands[1]));
                    break;
                case "multiply":
                    System.out.println(calculator.multiply(operands[0], operands[1]));
                    break;
                case "divide":
                    System.out.println(calculator.divide(operands[0], operands[1]));
                    break;
                case "fibonacciNumberFinder":
                    System.out.println(calculator.fibonacciNumberFinder(operands[0]));
                    break;
                case "intToBinaryNumber":
                    System.out.println(calculator.intToBinaryNumber(operands[0]));
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        } else {
            System.out.println("Invalid input format. Please provide operation and operands.");
        }
    }
}
