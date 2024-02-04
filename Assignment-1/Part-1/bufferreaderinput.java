import java.io.*;
public class bufferreaderinput
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r); // taking Buffered Reader class to take input
        // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number to find factorial: ");
        int number = Integer.parseInt(br.readLine()); // wrapper class: string value to integer/double/etc
        factorial f = new factorial(); // creating an instance of the factorial class
        int result = f.fact(number); // storing factorial of number in result
        System.out.println("Factorial of "+ number+" is "+ result +" using Buffered Reader ");
        // int c = bf.read(); for ascii value when taking string input
    }
}
