import java.util.Scanner;

public class OperationDemo
//    class to demonstrate calculator operations
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        double[] num = new double[2];
        Scanner scanner = new Scanner(System.in); // using scanner class for input

        // menu for calculator
        System.out.println("Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square Root");
        System.out.println("6. Power");
        System.out.println("7. Mean");
        System.out.println("8. Variance");

        System.out.println("Choose operation:");
        int choice = scanner.nextInt();
        double result = 0;

        switch (choice)
        {
            case 1: // case for addition
                num = Input.inputNumbers();
                System.out.println("First Number: " + num[0] + " Second Number: " + num[1]);
                result = calc.addition(num[0], num[1]);
                break;
            case 2: // case for subtraction
                num = Input.inputNumbers();
                System.out.println("First Number: " + num[0] + " Second Number: " + num[1]);
                result = calc.subtraction(num[0], num[1]);
                break;
            case 3: // case for multiplication
                num = Input.inputNumbers();
                System.out.println("First Number: " + num[0] + " Second Number: " + num[1]);
                result = calc.multiplication(num[0], num[1]);
                break;
            case 4: // case for division
                num = Input.inputNumbers();
                System.out.println("First Number: " + num[0] + " Second Number: " + num[1]);
                result = calc.division(num[0], num[1]);
                break;
            case 5: // case for square root
                num = Input.rootInput();
                System.out.println("Number: " + num[0]);
                result = calc.squareRoot(num[0]);
                break;
            case 6: // case for power
                num = Input.inputNumbers();
                System.out.println("First Number: " + num[0] + " Second Number: " + num[1]);
                result = calc.power(num[0], num[1]);
                break;
            case 7: // case for mean
                result = calc.meanVariance(1);
                break;
            case 8: // case for variance
                result = calc.meanVariance(2);
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

        System.out.println("Result is: " + result);
    }
}
