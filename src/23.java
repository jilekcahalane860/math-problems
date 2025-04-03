public class MathProblems {
    public static void main(String[] args) {
        // Example 1: Add two numbers
        int result = add(5, 3);
        System.out.println("The sum is: " + result);

        // Example 2: Multiply two numbers
        int result = multiply(4, 6);
        System.out.println("The product is: " + result);

        // Example 3: Subtract two numbers
        int result = subtract(8, 2);
        System.out.println("The difference is: " + result);

        // Example 4: Divide two numbers
        double result = divide(10, 2.5);
        System.out.println("The quotient is: " + result);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static double subtract(double a, double b) {
        return a - b;
    }

    private static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        }
        throw new IllegalArgumentException("Cannot divide by zero");
    }
}
