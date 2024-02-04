Class: EvenOdd

-> Purpose: This class is designed to separate even and odd numbers from an input array and print them.

-> Methods:
evenOdd():

Purpose: Separates even and odd numbers from the input array and prints them.

Description:
This method initializes local variables for iteration, input retrieval, storage of even and odd numbers, as well as counters and flags.
It then iterates through the input array, storing even numbers in one array and odd numbers in another.
Additionally, it checks for the presence of zero in the input array and prints a special message if zero is present.
Finally, it prints the even and odd numbers separately.

-> Local Variables:
 i (int): Iteration variable.
 input (Input): Instance of the Input class to retrieve input data.
 d (int[]): Array to store input data.
 s (int): Length of the input data array.
 evenArray (int[]): Array to store even numbers.
 oddArray (int[]): Array to store odd numbers.
 evencount (int): Counter for even numbers.
 oddcount (int): Counter for odd numbers.
 flag (int): Flag to indicate the presence of zero in the input array.


Class: Input

-> Purpose: This class is designed to take user input for the size of an array and its elements.

-> Methods:
inputData():

Purpose: Takes user input for the size of an array and its elements and returns the input data as an integer array.

Returns: An integer array containing the user-input elements.

Description:
This method initializes a local variable for the size of the array and a Scanner object to capture user input.
It prompts the user to enter the size of the array and then initializes an integer array of the specified size.
It then prompts the user to enter each element of the array one by one, storing them in the array.
Finally, it returns the array containing the user-input elements.

-> Local Variables:
 size (int): Variable to store the size of the array.
 sc (Scanner): Scanner object to capture user input.
 data (int[]): Integer array to store user-input elements.


Class: Part1

-> Purpose: This class contains the main method to execute the EvenOdd class.

-> Methods:
main(String[] args):

Purpose: Entry point of the program. Creates an instance of the EvenOdd class and invokes its evenOdd method.

Description:
This method is the entry point of the program. It initializes an instance of the EvenOdd class and invokes its evenOdd method.
The evenOdd method separates even and odd numbers from an input array and prints them.
