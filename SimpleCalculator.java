import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.println("Welcome to the Simple Calculator!");
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.printf("%.1f + %.1f = %.1f\n", num1, num2, result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("%.1f - %.1f = %.1f\n", num1, num2, result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("%.1f * %.1f = %.1f\n", num1, num2, result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.printf("%.1f / %.1f = %.1f\n", num1, num2, result);
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;
            default:
                System.out.println("Error! Operator is not correct.");
                break;
        }

        scanner.close();
    }
}