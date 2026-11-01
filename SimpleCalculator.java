import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();

        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;

        System.out.println("\n--- Results ---");
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
        System.out.println(firstNumber + " * " + secondNumber + " = " + product);

        if (secondNumber != 0) {
            double quotient = firstNumber / secondNumber;
            System.out.println(firstNumber + " / " + secondNumber + " = " + quotient);
        } else {
            System.out.println("Division: cannot divide by zero.");
        }

        input.close();
    }
}
