import java.util.Scanner;

public class BirthMonthChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = input.nextInt();

        if (birthMonth >= 1 && birthMonth <= 12) {
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            System.out.println("Error: Invalid month entered. Please enter a number between 1 and 12.");
        }
    }
}
