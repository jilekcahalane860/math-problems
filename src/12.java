import java.util.Random;

public class MathProblems {
    private static final Random random = new Random();

    public int generateMathProblem() {
        // Generate a random math problem
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        char operator = "+-*/".charAt(random.nextInt(3));

        switch (operator) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                if (number2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return number1 / number2;
            default:
                throw new IllegalArgumentException("Invalid operator " + operator);
        }
    }
}
