import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any integer number: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Result: " + number + " is an even number.");
        } else {
            System.out.println("Result: " + number + " is an odd number.");
        }

        input.close();
    }
}
