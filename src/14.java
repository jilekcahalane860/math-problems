 import java.util.*; 
 public class MathProblem { 
  // Randomly generate a math problem 
  private static final int[] operators = new int[]{1, 2, 3}; 
  public String getMathProblem() { 
    Random rand = new Random(); 
    int operatorIndex = rand.nextInt(operators.length); 
    String operator = operators[operatorIndex]; 
    int operand1 = rand.nextInt(10); 
    int operand2 = rand.nextInt(10); 
    return operand1 + " " + operator + " " + operand2; 
  } 
}