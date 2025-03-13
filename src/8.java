import java.util.*;
public class MathProblems {
    public static int[] getRandomProblem(int num) {
        Random rand = new Random();
        int a = rand.nextInt(num);
        int b = rand.nextInt(num);
        return new int[]{a, b};
    }
}