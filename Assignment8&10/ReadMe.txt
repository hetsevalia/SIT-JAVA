Class: EmployeeManager
Package: org.example.employee_registration
Extends: javafx.application.Application
Purpose: Provides a graphical user interface (GUI) for managing employee records including adding, viewing, and updating employee details.
Key Methods:
start(Stage primaryStage): Sets up the GUI components and event handlers. It initializes the connection to the database, creates the necessary table if it doesn't exist, and sets up the layout and actions for the UI components such as text fields and buttons.
main(String[] args): The entry point that launches the JavaFX application.
Class: EmployeeDatabase
Package: org.example.employee_registration
Purpose: Handles all interactions with the MySQL database, such as connecting to the database, creating tables, and CRUD (Create, Read, Update, Delete) operations.
Key Components and Methods:
URL, USER, PASSWORD: Constants to store the database connection details.
getConnection(): Establishes and returns a connection to the database.
connect(): Connects to the database and creates a new table for employee details if it doesn't exist.
createNewTable(): Executes a SQL statement to create a new table named employees with fields for ID, name, age, email, and department.
addEmployee(String name, int age, String email, String department): Inserts a new employee record into the database.
updateEmployee(int id, String name, int age, String email, String department): Updates an existing employee's details in the database based on the employee ID.
viewEmployees(): Retrieves and displays all employee records from the database.
main(String[] args): An additional main method to ensure the database is connected and the table is set up when the class is executed directly.
Execution Flow:
Initialization: When EmployeeManager is run, it calls connect() to establish a database connection and create the necessary table.
User Interaction: The GUI allows the user to input employee details and perform actions such as adding, viewing, and updating records. These actions are handled by corresponding methods in EmployeeDatabase.
Database Operations: Each action on the GUI triggers a specific method in EmployeeDatabase that executes SQL commands to interact with the MySQL database, ensuring that all employee data is managed appropriately.
Technology Stack:
JavaFX: Used for building the GUI.
MySQL: Database system used for storing and managing employee data.
JDBC: Java Database Connectivity used for database operations.
