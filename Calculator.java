import java.util.Scanner;
class Calculator
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter two numbers:");
                    double addend1 = scanner.nextDouble();
                    double addend2 = scanner.nextDouble();
                    System.out.println("Result: " + (addend1 + addend2));
                    break;
                case 2:
                    System.out.println("Enter two numbers:");
                    double minuend = scanner.nextDouble();
                    double subtrahend = scanner.nextDouble();
                    System.out.println("Result: " + (minuend - subtrahend));
                    break;
                case 3:
                    System.out.println("Enter two numbers:");
                    double factor1 = scanner.nextDouble();
                    double factor2 = scanner.nextDouble();
                    System.out.println("Result: " + (factor1 * factor2));
                    break;
                case 4:
                    System.out.println("Enter two numbers:");
                    double dividend = scanner.nextDouble();
                    double divisor = scanner.nextDouble();
                    if (divisor != 0) {
                        System.out.println("Result: " + (dividend / divisor));
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;
                case 5:
                    System.out.println("Enter the base and exponent:");
                    double base = scanner.nextDouble();
                    double exponent = scanner.nextDouble();
                    System.out.println("Result: " + Math.pow(base, exponent));
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }

        scanner.close();
        System.out.println("Calculator program closed.");
    }
}

