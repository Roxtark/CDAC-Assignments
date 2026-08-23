import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        for (int i = 3; i <= num; i += 3) {
            System.out.print(i + " ");
        }

    }
}
