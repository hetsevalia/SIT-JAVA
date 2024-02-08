import java.util.ArrayList;
import java.util.Scanner;

public class main
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // creating a Scanner object to take user input from the console

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++)
        {
            array[i] = scanner.nextInt();
        }
        // creating an instance of ArrayToArrayListConverter to convert array to ArrayList
        ArrayToArrayListConverter arrayToArrayListConverter = new ArrayToArrayListConverter();
        // converting the array to ArrayList
        ArrayList<Integer> arrayList = arrayToArrayListConverter.convertToArraylist(array);

        System.out.println("Array converted to ArrayList: " + arrayList);
        // creating an instance of ArrayListToArrayConverter to convert ArrayList to array
        ArrayListToArrayConverter arrayListToArrayConverter = new ArrayListToArrayConverter();
        // converting the ArrayList to array
        int[] newArray = arrayListToArrayConverter.convertToarray(arrayList);

        System.out.println("ArrayList converted to array: " + java.util.Arrays.toString(newArray));
    }
}
