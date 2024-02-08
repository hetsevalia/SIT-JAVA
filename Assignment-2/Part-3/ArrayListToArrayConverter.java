import java.util.ArrayList;

public class ArrayListToArrayConverter  // method to convert ArrayList to array
{

    public int[] convertToarray(ArrayList<Integer> arrayList)
    {
        int[] array = new int[arrayList.size()];   // creating an integer array with size equal to the size of the ArrayList
        for (int i = 0; i < arrayList.size(); i++) // iterating through the elements of the ArrayList
        {
            array[i] = arrayList.get(i); // assigning each element of the ArrayList to the corresponding index of the array
        }
        return array; // returning array
    }
}
