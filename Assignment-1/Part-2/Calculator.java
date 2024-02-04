import java.util.Scanner;
public class Calculator
// class for doing calculations
{
    private Scanner sc = new Scanner(System.in);
    public double addition(double n1, double n2) // method for addition of 2 numbers
    {
        return n1+n2;
    }
    public double subtraction(double n1, double n2) // method for subtracting of 2 numbers
    {
        return n1-n2;
    }
    public double multiplication(double n1, double n2) // method for multiplication of 2 numbers
    {
        return n1*n2;
    }
    public double division(double n1, double n2) // method for division of 2 numbers
    {
        return n1/n2;
    }
    public double squareRoot(double n1) // method for square root of a number
    {
        return Math.sqrt(n1);
    }
    public double power(double n1, double n2) // method for squaring/cubic/power in form of a^b
    {
        return Math.pow(n1,n2);
    }
    public double meanVariance(int flag) // method for calculating mean and variance. if flag == 1 then mean; if flag == 2 then variance else display error
    {
        double sum = 0;
        double sumSquared = 0;
        int count = 0;

        do {
            System.out.print("Enter a number (enter 'end' to stop): ");
            String input = sc.nextLine(); // taking string input

            if (input.equalsIgnoreCase("end")) // if end is the string break the loop
            {
                break;
            }
            else // if it's a number use wrapper class to convert string to double
            {
                double num = Double.parseDouble(input);
                sum += num;
                sumSquared += Math.pow(num, 2);
                count++;
            }
        } while (true);

        if (count == 0)
        {
            System.out.println("No valid numbers entered.");
            return 0;
        }

        if (flag == 1)
        {
            return sum / count; // returns mean
        }
        else if (flag == 2)
        {
            double mean = sum / count;
            return (sumSquared / count) - Math.pow(mean, 2); // returns variance
        }
        else
        {
            System.err.println("Invalid flag value");
            return 0; // return 0 if there is invalid flag
        }
    }
}