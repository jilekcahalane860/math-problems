public class MathProblemSolver {
    public static void main(String[] args) {
        // Example 1: Simple arithmetic operation
        System.out.println("10 + 5 = " + (10 + 5));

        // Example 2: Basic mathematical function calls
        double result = 7.5 * 2.3;
        System.out.println("7.5 * 2.3 = " + result);

        // Example 3: Quadratic equation solving
        double a = 1, b = -3, c = 4;
        double discriminant = Math.pow(b, 2) - (4 * a * c);
        if (discriminant > 0) {
            System.out.println("The solutions are " + (-(b + Math.sqrt(discriminant)) / (2 * a)) + " and " +
                    ((-(b - Math.sqrt(discriminant)) / (2 * a))));
        } else if (discriminant == 0) {
            System.out.println("The solution is " + (-b / (2 * a)));
        } else {
            System.out.println("There are no real solutions.");
        }

        // Example 4: Factorial calculation
        int number = 5;
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
