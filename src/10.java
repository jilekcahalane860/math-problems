import java.util.Random;

public class MathProblems {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(20) + 1;
        int b = rand.nextInt(20) + 1;
        System.out.println("Sum: " + (a + b));
        System.out.println("Product: " + (a * b));
    }
}
