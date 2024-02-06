public class NearingNeighbours
{
    public int findNeighboringNumbersIndex(int[] array)
            /*
            method to find the index of the first number in the pair of neighboring numbers
             with the smallest distance
             */
    {
        if (array == null || array.length < 2) // if array is null or contains only one element we can't find index
        {
            System.err.println("Array must have at least two elements");
            return -1;
        }

        int minDistance = Integer.MAX_VALUE; // initializing minDistance to Integer.MAX_VALUE to ensure any subsequent calculated distance will be smaller
        int minIndex = -1;

        for (int i = 0; i < array.length - 1; i++)
        {
            int currentDistance = Math.abs(array[i] - array[i + 1]);
            if (currentDistance < minDistance)
            {
                minDistance = currentDistance;
                minIndex = i;
            }
        }

        return minIndex;
    }
}