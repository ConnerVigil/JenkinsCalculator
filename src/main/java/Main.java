import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int num1 = 0;
        int num2 = 0;

        while (true) {
            System.out.println("Enter a command or 0 to quit: ");
            Scanner in = new Scanner(System.in);
            String operation = in.nextLine();

            switch (operation) {
                case "add":
                    num1 = getNum1(in);
                    num2 = getNum2(in);
                    System.out.println(calc.add(num1, num2));
                    break;
                case "subtract":
                    num1 = getNum1(in);
                    num2 = getNum2(in);
                    System.out.println(calc.subtract(num1, num2));
                    break;
                case "multiply":
                    num1 = getNum1(in);
                    num2 = getNum2(in);
                    System.out.println(calc.multiply(num1, num2));
                    break;
                case "divide":
                    num1 = getNum1(in);
                    num2 = getNum2(in);
                    System.out.println(calc.divide(num1, num2));
                    break;
                case "fibonacci":
                    num1 = getNum1(in);
                    System.out.println(calc.fibonacciNumberFinder(num1));
                    break;
                case "binary":
                    num1 = getNum1(in);
                    System.out.println(calc.intToBinaryNumber(num1));
                    break;
                case "0":
                    System.out.println("Goodbye");
                    return;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
        }
    }

    public static int getNum1(Scanner in) {
        System.out.println("Enter first number: ");
        return Integer.parseInt(in.nextLine());
    }

    public static int getNum2(Scanner in) {
        System.out.println("Enter second number: ");
        return Integer.parseInt(in.nextLine());
    }
}
