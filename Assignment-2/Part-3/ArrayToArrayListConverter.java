import java.util.ArrayList;

public class ArrayToArrayListConverter
{
    public ArrayList<Integer> convertToArraylist(int[] array) // method to convert array to ArrayList
    {
        ArrayList<Integer> arrayList = new ArrayList<>(); // creating a new ArrayList to store the elements of the array
        for (int num : array)  // iterating through the elements of the array
        {
            arrayList.add(num); // adding each element of the array to the ArrayList
        }
        return arrayList; // returning array list
    }
}
