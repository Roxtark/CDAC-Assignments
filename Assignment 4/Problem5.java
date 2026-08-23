import java.util.Scanner;

public class Problem5 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= num; i += 2) {
            sum = sum + i;
        }

        System.out.println("The sum of odd numbers from 1 to " + num + " is: " + sum);

    }
}
