Class: Student
Purpose: This class represents a student entity with attributes such as PRN, name, date of birth, and marks.
Methods:
Constructors: Overloaded constructors to initialize a student with different levels of detail.
Getters and Setters: Methods to access and update the student's PRN, name, date of birth, and marks.
toString: Returns a string representation of the student details.
Class: StudentFunctions
Purpose: Manages operations related to student management including adding, displaying, searching, updating, and deleting students.
Methods:
addStudent: Adds new students to the student database after taking input from the user.
printStudentDetails: Displays all students in the database.
searchStu: Searches for students based on PRN, name, date of birth, or marks.
updateOrDelete: Menu-driven method to update or delete student details or add a new student.
editStudent: Updates the details of an existing student.
deleteStudent: Removes a student from the database.
Class: StudentDemo
Purpose: Acts as the entry point of the program, containing the main method which orchestrates various functionalities of the StudentFunctions class.
Method:
main(String[] args):
Purpose: Serves as the command center to invoke various operations like adding, searching, updating, or deleting student records.
Parameters: args: Command-line arguments passed to the program.
Description: Initializes the system and processes user input to manage student records through a menu-driven interface.
