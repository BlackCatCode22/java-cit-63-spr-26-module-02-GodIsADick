import java.util.Scanner;

public class MaddnessWithMethods {

    public static void main(String[] args) {

        Scanner userScanner = new Scanner(System.in);

        int firstValue = getAnIntFromTheUser(userScanner);
        int secondValue = getAnIntFromTheUser(userScanner);

        compareTwoInts(firstValue, secondValue);

        int totalSum = sumTwoInts(firstValue, secondValue);
        System.out.println("Sum: " + totalSum);

        userScanner.close();
    }

    public static int getAnIntFromTheUser(Scanner sharedScanner) {
        System.out.print("Enter an integer: ");
        int userNumber = sharedScanner.nextInt();
        return userNumber;
    }

    public static void compareTwoInts(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is larger.");
        } else if (secondNumber > firstNumber) {
            System.out.println(secondNumber + " is larger.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

    public static int sumTwoInts(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
