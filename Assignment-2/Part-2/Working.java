public class Working
{
    public static void main(String[] args)
    {
        Input inputHandler = new Input(); // creating an instance of Input to handle input operations
        int[] array = inputHandler.getInputArray(); // input array from the user

        NearingNeighbours finder = new NearingNeighbours();
        // creating an instance of NearingNeighbours to find the index of the first number in the pair of neighboring numbers with the smallest distance
        int index = finder.findNeighboringNumbersIndex(array); // getting index of first number
        if(index == -1) // if index == -1 exit
        {
            System.exit(0);
        }

        System.out.println("Index of the first number in the pair: " + index);
    }
}