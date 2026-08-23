import java.util.Scanner;

public class Problem1 {

    public static int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();

        int add = sumOfTwoNumbers(firstNumber, secondNumber);

        System.out.println("The sum of numbers is " + add );

    }
}
