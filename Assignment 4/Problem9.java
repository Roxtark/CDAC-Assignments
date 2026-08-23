import java.util.Arrays;
import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        int largest = numbers[numbers.length - 1];

        System.out.println("The largest element is: " + largest);

        
    }
}

