import java.util.Scanner;

public class MathProblem {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Generate a random math problem
    int a = (int) (Math.random() * 10) + 1;
    int b = (int) (Math.random() * 10) + 1;
    char operation = '+';
    if (Math.random() < 0.5) {
      operation = '-';
    } else if (Math.random() < 0.75) {
      operation = '*';
    } else {
      operation = '/';
    }
    
    // Print the problem
    System.out.print("What is " + a + " " + operation + " " + b + "? ");
    
    // Read the answer from the user
    int answer = scanner.nextInt();
    
    // Check if the answer is correct
    if (operation == '+' && a + b == answer) {
      System.out.println("Correct!");
    } else if (operation == '-' && a - b == answer) {
      System.out.println("Correct!");
    } else if (operation == '*' && a * b == answer) {
      System.out.println("Correct!");
    } else if (operation == '/' && a / b == answer) {
      System.out.println("Correct!");
    } else {
      System.out.println("Incorrect, the correct answer is " + (a + b));
    }
  }
}
