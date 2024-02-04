import java.util.Scanner;
public class Input
// class for taking input
{
    public static double[] inputNumbers()
    // method for taking 2 user input
    {
        Scanner sc = new Scanner(System.in); // using scanner class for input
        double[] numbers = new double[2]; // using array to store input

        System.out.println("Enter First Number: ");
        double firstNum = sc.nextDouble();

        System.out.println("Enter Second Number: ");
        double secNum = sc.nextDouble();

        numbers[0] = firstNum;
        numbers[1] = secNum;

        return numbers;
    }
    public static double[] rootInput()
    // method for taking 1 user input
    {
        Scanner sc = new Scanner(System.in); // using scanner class for input
        double[] numbers = new double[1]; // using array to store input

        System.out.println("Enter Number: ");
        double firstNum = sc.nextDouble();

        numbers[0] = firstNum;

        return numbers;
    }
}
