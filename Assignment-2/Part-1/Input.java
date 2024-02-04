import java.util.Scanner;
public class Input // class to take input
{
    public int[] inputData() // method to take user input of array size and data of return type integer array
    {
        int size;
        Scanner sc = new Scanner(System.in); // using scanner class to rake input
        System.out.println("Enter size of array: ");
        size = sc.nextInt(); // int type input
        int[] data = new int[size]; // array declaration of size 'size' to avoid  overallocation or over-sizing of the array.
        System.out.println("Enter elements:");
        for(int i=0;i<size;i++)
        {
            System.out.println("Element "+(i+1)+":");
            data[i] = sc.nextInt();
        }
        return data; // returning array: data
    }
}
