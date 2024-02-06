import java.util.Scanner;

public class Input
{
    public int[] getInputArray() // method to take input from the user and return an array of integers
    {
        Scanner scanner = new Scanner(System.in); // using scanner class to take input
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt(); // integer input
        int[] array = new int[n]; // array of size n to avoid overallocation

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) // loop to take input of array
        {
            array[i] = scanner.nextInt();
        }

        scanner.close();
        return array; // returning array
    }
}
