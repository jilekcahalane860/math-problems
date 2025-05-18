public class MathProblems {
    public static void main(String[] args) {
        // Randomly generate a number between 1 and 10
        int randomNumber = (int)(Math.random() * 10 + 1);
        
        // Check if the number is even or odd
        if (randomNumber % 2 == 0) {
            System.out.println("The number " + randomNumber + " is even.");
        } else {
            System.out.println("The number " + randomNumber + " is odd.");
        }
    }
}
