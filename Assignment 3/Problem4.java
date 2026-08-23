import java.util.Scanner;

public class Problem4 {


        static void askForPositiveNumber() {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a positive number: ");
            num = sc.nextInt();
        } while (num <= 0);

        System.out.println("Entered number is : " + num);

    }

    public static void main(String[] args) {
        askForPositiveNumber();
    }
}
    

