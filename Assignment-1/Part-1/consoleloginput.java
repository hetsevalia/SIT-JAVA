import java.io.*;
public class consoleloginput
{
    public static void main(String[] args)
    {
        Console c = System.console();
        System.out.println("Enter Username: ");
        String uname = c.readLine(); // taking username from user
        System.out.println("Enter Password: ");
        char[] password = c.readPassword(); // taking password from user
        System.out.println("Your username is "+ uname); // displaying username
        System.out.println("Your password is "+ String.valueOf(password)); // displaying password
        System.out.println("Enter number of find factorial: ");
        String num = c.readLine();
        int number = Integer.parseInt(num); // wrapper class: string value to integer/double/etc
        factorial f = new factorial(); // creating an instance of the factorial class
        int result = f.fact(number); // storing factorial of number in result
        System.out.println("Factorial of " + number + " is " + result + " using Console Log");
    }
}
