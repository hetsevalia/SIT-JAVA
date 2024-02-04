import java.io.*;
public class datainputstreaminput
{
    public static void main(String[] args) throws IOException
    {
        DataInputStream dataInputStream = new DataInputStream(System.in); // taking Data Input Stream class to take input
        System.out.print("Enter number to find factorial: ");
        String inputString = dataInputStream.readLine();
        int number = Integer.parseInt(inputString); // wrapper class: string value to integer/double/etc
        factorial f = new factorial(); // creating an instance of the factorial class
        int result = f.fact(number); // storing factorial of number in result
        System.out.println("Factorial of " + number + " is " + result + " using DataInputStream");
        dataInputStream.close();
    }
}
