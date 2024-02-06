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

Local Variables:
size (int): Variable to store the size of the array.
sc (Scanner): Scanner object to capture user input.
data (int[]): Integer array to store user-input elements.


Class: NearingNeighbours

-> Purpose: This class is designed to find the index of the first number in the pair of neighboring numbers with the smallest distance.

-> Methods:
findNeighboringNumbersIndex(int[] array):

Purpose: Finds the index of the first number in the pair of neighboring numbers with the smallest distance.

Returns: The index of the first number in the pair of neighboring numbers with the smallest distance. Returns -1 if the array is null or contains less than two elements.

Description:
This method takes an integer array as input and iterates through the array to find the pair of neighboring numbers with the smallest absolute difference. It returns the index of the first number in this pair. If the input array is null or contains less than two elements, it prints an error message and returns -1.

Parameters:
array (int[]): The input array of integers.

Local Variables:
minDistance (int): Variable to store the minimum distance between neighboring numbers.
minIndex (int): Variable to store the index of the first number in the pair of neighboring numbers with the smallest distance.
currentDistance (int): Variable to store the distance between current neighboring numbers being compared.


Class: Working

-> Purpose: This class serves as the main entry point of the program. It initializes instances of Input and NearingNeighbours classes to handle input operations and find the index of the first number in the pair of neighboring numbers with the smallest distance, respectively.

-> Methods:
main(String[] args):

Purpose: Main method to execute the program.

Description: This method initializes an instance of Input to handle input operations, prompts the user to input an array of integers, and then initializes an instance of NearingNeighbours to find the index of the first number in the pair of neighboring numbers with the smallest distance. It prints the index of the first number in the pair and exits if the index is -1.

Local Variables:
inputHandler (Input): Instance of Input class to handle input operations.
array (int[]): Array of integers input by the user.
finder (NearingNeighbours): Instance of NearingNeighbours class to find the index of the first number in the pair of neighboring numbers with the smallest distance.
index (int): Index of the first number in the pair of neighboring numbers with the smallest distance.





