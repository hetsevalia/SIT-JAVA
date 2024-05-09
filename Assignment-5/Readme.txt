Class: Circle
Purpose: Represents a circle with attributes for radius and color.
Methods:
Constructor(double radius, String color): Initializes a circle with specified radius and color.
getRadius(): Returns the radius of the circle.
setRadius(double radius): Sets the radius of the circle.
getColor(): Returns the color of the circle.
setColor(String color): Sets the color of the circle.
getArea(): Calculates and returns the area of the circle using the formula 
𝜋
𝑟
2
πr 
2
 .
Class: Rectangle
Purpose: Represents a rectangle with attributes for length and width.
Methods:
Constructor(double length, double width): Initializes a rectangle with specified length and width.
getLength(): Returns the length of the rectangle.
setLength(double length): Sets the length of the rectangle.
getWidth(): Returns the width of the rectangle.
setWidth(double width): Sets the width of the rectangle.
getArea(): Calculates and returns the area of the rectangle using the formula 
length
×
width
length×width.
Class: Triangle
Purpose: Represents a triangle with attributes for base and height.
Methods:
Constructor(double base, double height): Initializes a triangle with specified base and height.
getBase(): Returns the base of the triangle.
setBase(double base): Sets the base of the triangle.
getHeight(): Returns the height of the triangle.
setHeight(double height): Sets the height of the triangle.
getArea(): Calculates and returns the area of the triangle using the formula 
0.5
×
base
×
height
0.5×base×height.
Interface: Shapes
Purpose: Provides a common structure for geometric shapes to calculate their area.
Methods:
getArea(): Should be implemented to return the area of the shape.
Abstract Class: Employee
Purpose: Serves as a base class for different types of employees, providing common attributes and an abstract method for salary calculation.
Fields: Includes attributes like name, address, basic wage, and more.
Methods:
Abstract salaryCalculation(): Must be implemented by derived classes to calculate the salary based on specific rules.
Class: BonusEmployee (extends Employee)
Purpose: Represents an employee who is eligible for a bonus.
Fields:
bonusPercentage: The percentage of the total earnings given as a bonus.
Methods:
Constructor(s): Initializes a BonusEmployee with or without specified parameters.
salaryCalculation(): Implements the salary calculation including bonuses.
Class: NormalEmployee (extends Employee)
Purpose: Represents a regular employee potentially eligible for a bonus.
Fields:
bonusPercentage: The percentage of the total earnings given as a bonus, which might be zero.
Methods:
Constructor(s): Initializes a NormalEmployee with default or specified parameters.
salaryCalculation(): Implements the salary calculation, including handling of bonuses.
Main Classes
Purpose: Entry points for testing and interacting with shapes and employee classes.
Methods:
Main method for shapes: Takes user input for dimensions of various shapes, creates shape objects, and prints their areas.
Main method for employees: Takes user input to determine if an employee is a bonus employee, gathers details, and calculates their salary.
