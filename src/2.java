import java.util.Random;

public class MathProblem {
    private int number1;
    private int number2;
    private String operator;

    public MathProblem(int number1, int number2, String operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public String getOperator() {
        return operator;
    }

    public int solve() {
        if (operator.equals("+")) {
            return number1 + number2;
        } else if (operator.equals("-")) {
            return number1 - number2;
        } else if (operator.equals("*")) {
            return number1 * number2;
        } else if (operator.equals("/")) {
            return number1 / number2;
        } else {
            throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}

Random r = new Random();
int number1 = r.nextInt(10) + 1;
int number2 = r.nextInt(10) + 1;
String operator = "+-*/".charAt(r.nextInt(4));
MathProblem problem = new MathProblem(number1, number2, operator);
System.out.println("What is " + number1 + " " + operator + " " + number2 + "?");
int answer = problem.solve();
System.out.println("Answer: " + answer);
