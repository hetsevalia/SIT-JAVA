public class commandlineinput
{
    public static void main(String[] args)
    {
        // using command line to take input
        int number = Integer.parseInt(args[0]);
        factorial f = new factorial(); // creating an instance of the factorial class
        int result = f.fact(number); // storing factorial of number in result
        System.out.println("Factorial of " + number + " is " + result + " using Command Line Argument");
    }
}
