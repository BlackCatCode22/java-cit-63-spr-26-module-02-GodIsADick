import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {

        Scanner integerScanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstIntegerValue = integerScanner.nextInt();

        System.out.print("Enter second integer: ");
        int secondIntegerValue = integerScanner.nextInt();

        System.out.print("Enter third integer: ");
        int thirdIntegerValue = integerScanner.nextInt();

        int largestIntegerValue;

        if (firstIntegerValue > secondIntegerValue) {
            if (firstIntegerValue > thirdIntegerValue) {
                largestIntegerValue = firstIntegerValue;
            } else {
                largestIntegerValue = thirdIntegerValue;
            }
        } else {
            if (secondIntegerValue > thirdIntegerValue) {
                largestIntegerValue = secondIntegerValue;
            } else {
                largestIntegerValue = thirdIntegerValue;
            }
        }

        System.out.println("Largest number: " + largestIntegerValue);

        integerScanner.close();
    }
}
