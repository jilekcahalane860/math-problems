import java.util.Scanner;
public class math_problems{
  public static void main (String[] args){
    Scanner input=new Scanner(System.in);
     System.out.println("Please enter an integer: ");
       int a=input.nextInt();
      System.out.println("Please enter another integer: ");
       int b=input.nextInt();
    System.out.println("The sum of the two integers is "+(a+b));
  }
}