Class: OperationDemo

-> Purpose: This class serves as a demonstration of calculator operations. In this class, the user inputs the choice of operations, gives input accordingly, and gets output.

-> Local Variables:
calc: An instance of the Calculator class used to perform calculations.
num: An array to store the numbers required for calculations.
scanner: A Scanner object to take input from the user.
choice: An integer variable to store the user's choice of operation.
result: A double variable to store the result of the calculation.

-> Description:
Displays a menu of calculator operations.
Takes input from the user to select an operation.
Based on the user's choice, calls appropriate methods from the Calculator class to perform the operation.
Prints the result of the calculation.


Class: Input

-> Purpose: This class is responsible for taking user input for calculator operations.

-> Methods:

1) inputNumbers(): This method takes two user inputs and returns them as an array of doubles.

Purpose: To prompt the user to input two numbers and return them for further processing.

Local Variables:
sc: A Scanner object to take input from the user.
numbers: An array of doubles to store the user inputs.
firstNum: A double variable to store the first user input.
secNum: A double variable to store the second user input.

Description:
Prompts the user to enter the first number.
Takes the first number as input using Scanner's nextDouble() method.
Prompts the user to enter the second number.
Takes the second number as input using Scanner's nextDouble() method.
Stores the two numbers in an array and returns the array.


2) rootInput(): This method takes a single user input and returns it as an array of doubles.

Purpose: To prompt the user to input a number and return it for further processing.

Local Variables:
sc: A Scanner object to take input from the user.
numbers: An array of doubles to store the user input.
firstNum: A double variable to store the user input.

Description:
Prompts the user to enter a number.
Takes the number as input using Scanner's nextDouble() method.
Stores the number in an array and returns the array.

Class: Calculator

-> Purpose: This class is responsible for performing various arithmetic and statistical calculations.

-> Methods:

1) addition(double n1, double n2):

Purpose: Performs addition of two numbers.

Parameters:
n1: The first number.
n2: The second number.

Description: Returns the sum of n1 and n2.

2) subtraction(double n1, double n2):

Purpose: Performs subtraction of two numbers.

Parameters:
n1: The first number (minuend).
n2: The second number (subtrahend).

Description: Returns the result of subtracting n2 from n1.

3) multiplication(double n1, double n2):

Purpose: Performs multiplication of two numbers.

Parameters:
n1: The first factor.
n2: The second factor.

Description: Returns the product of n1 and n2.

4) division(double n1, double n2):

Purpose: Performs division of two numbers.

Parameters:
n1: The dividend.
n2: The divisor.

Description: Returns the result of dividing n1 by n2. Note that this method does not handle division by zero.

5) squareRoot(double n1):

Purpose: Calculates the square root of a number.

Parameters:
n1: The number to calculate the square root of.

Description: Returns the square root of n1.

6) power(double n1, double n2):

Purpose: Calculates the result of raising a number to a power.

Parameters:
n1: The base.
n2: The exponent.

Description: Returns n1 raised to the power of n2.

7) meanVariance(int flag):

Purpose: Calculates either the mean or the variance of a set of numbers.

Parameters:
flag: An integer flag indicating whether to calculate the mean (flag = 1) or the variance (flag = 2).

Description:
Prompts the user to input numbers until the string "end" is entered.
Calculates the sum of the numbers, the sum of their squares, and the count of valid numbers entered.
If no valid numbers are entered, it prints an error message and returns 0.
If flag is 1, it returns the mean of the numbers.
If flag is 2, it calculates the variance and returns it.
If flag is neither 1 nor 2, it prints an error message and returns 0.
