Class: ArrayListToArrayConverter

-> Purpose: This class provides functionality to convert an ArrayList to an array of integers.

-> Methods:

convertToArray(ArrayList<Integer> arrayList):

Purpose: Converts the given ArrayList of Integers to an integer array.

Parameters:

arrayList (ArrayList<Integer>): The ArrayList to be converted.
Returns: An integer array containing the elements of the input ArrayList.

Description:
This method initializes a new integer array with the size of the input ArrayList.
It iterates over each element of the ArrayList and copies it to the corresponding index in the array.
Finally, it returns the resulting integer array.

Class: ArrayToArrayListConverter

-> Purpose: This class provides functionality to convert an array of integers to an ArrayList.

-> Methods:

convertToArraylist(int[] array):

Purpose: Converts the given integer array to an ArrayList of Integers.

Parameters:

array (int[]): The integer array to be converted.
Returns: An ArrayList containing the elements of the input array.

Description:
This method initializes a new ArrayList to store the elements of the input array.
It iterates over each element of the array and adds it to the ArrayList.
Finally, it returns the resulting ArrayList.

Class: main

-> Purpose: This class contains the main method to demonstrate the conversion between ArrayList and array.

-> Methods:

main(String[] args):

Purpose: Entry point of the program. Takes user input for an array, converts it to an ArrayList, then back to an array, and prints the results.

Parameters:

args (String[]): Command-line arguments (not used in this program).
Description:
This method prompts the user to enter the size of the array and its elements.
It creates an integer array based on the user input.
It then converts the array to an ArrayList using the ArrayToArrayListConverter class.
After that, it prints the converted ArrayList.
Next, it converts the ArrayList back to an array using the ArrayListToArrayConverter class.
Finally, it prints the resulting array.
