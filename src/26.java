public class MathProblems {
    public static void main(String[] args) {
        // Example problem 1: Sum of two numbers
        System.out.println("The sum of 3 and 5 is " + (3 + 5));
        
        // Example problem 2: Factorial of a number
        int num = 7;
        if (num > 0) {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + num + " is " + factorial);
        } else {
            System.out.println("Invalid input: The number must be greater than 0.");
        }
        
        // Example problem 3: Prime numbers between 1 and 20
        for (int i = 2; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Method to check if a number is prime
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
