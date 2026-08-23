import java.util.Scanner;

public class Problem6 {

 static int calculateSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = calculateSum(num);

        System.out.println("The sum of numbers from 1 to " + num + " is: " + sum);
    }
}
