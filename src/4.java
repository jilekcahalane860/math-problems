import java.util.Random;
public class MathProblem {
  public static int getAnswer(int[] options) {
    Random rand = new Random();
    return options[rand.nextInt(options.length)];
  }
}