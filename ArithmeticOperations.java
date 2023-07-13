import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println("Addition: " + add(firstNumber, secondNumber));
        System.out.println("Subtraction: " + subtract(firstNumber, secondNumber));
        System.out.println("Multiplication: " + multiply(firstNumber, secondNumber));
        System.out.println("Division: " + divide(firstNumber, secondNumber));
    }

    private static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private static int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    private static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    private static int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
}