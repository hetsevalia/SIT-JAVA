Interface: Interface_STK
Purpose: Defines a stack interface with essential stack operations.
Methods:
push(int element): Pushes an element onto the stack.
pop(): Pops the top element from the stack.
displayStack(): Displays all elements in the stack.
isOverFlow(): Checks if the stack is full.
isUnderFlow(): Checks if the stack is empty.
Class: Fixed_STK
Purpose: Implements a fixed-size stack using an array.
Properties:
stack: Array to store stack elements.
top: Index of the top element in the stack.
Methods:
Constructor(int max_size): Initializes the stack with a given maximum size.
Implements all methods from Interface_STK, managing stack operations within a fixed array size.
Class: Growable_STK
Purpose: Implements a dynamically growing stack using an ArrayList.
Properties:
stack: ArrayList to store stack elements.
top: Index of the top element in the stack.
Methods:
Constructor(): Initializes the stack as an empty ArrayList.
Implements all methods from Interface_STK, allowing the stack to grow as needed.
Class: StackDemo
Purpose: Demonstrates operations on a fixed-size stack through a user interface.
Methods:
main(String[] args): Provides a menu-driven interface to perform stack operations like adding, displaying, popping elements, and exiting the program.
Class: StackDemoGrowable
Purpose: Demonstrates operations on a growable stack through a user interface.
Methods:
main(String[] args): Similar to StackDemo but for a growable stack, allowing dynamic addition without overflow concerns.
Interface: Exam
Purpose: Defines an educational interface for calculating results.
Methods:
Percent_cal(): Calculates the percentage based on student marks.
Class: Student
Purpose: Represents a student with basic educational attributes.
Properties:
name: Student's name.
roll_no: Roll number.
mark1, mark2: Marks in two subjects.
Methods:
Constructor(String name, int roll_no, double mark1, double mark2): Initializes student details.
Getter and Setter Methods: For name, roll number, and marks.
toString(): Returns a string representation of the student.
Class: Result
Purpose: Extends Student and implements Exam to manage student results.
Properties:
percentage: Calculated percentage of marks.
Methods:
Constructor(): Initializes with default values.
Percent_cal(): Implements percentage calculation.
enterStudentDetails(Scanner scanner): Collects student details from input.
displayStudentInfo(): Returns student details.
displayResult(): Calculates and displays results.
toString(): Overrides to include percentage in the student's details.
Class: Main (Result Management)
Purpose: Main class for interacting with the result system.
Methods:
main(String[] args): Provides a menu-driven interface for entering details, displaying student information, displaying results, and exiting the program.
