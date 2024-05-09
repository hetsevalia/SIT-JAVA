Class: Main
Purpose: Serves as the entry point for the program, handling the parsing and arithmetic operations of rational numbers.
Method:
main(String[] args):
Purpose: Processes command-line arguments to create and manipulate rational numbers, and displays the results of various arithmetic operations.
Details: Validates that exactly four integers are provided (two numerators and two denominators). Creates two Rational objects, performs arithmetic operations (addition, subtraction, multiplication, division), compares them, and converts them to double and absolute values. Errors are handled via exception catching.
Class: Rational
Purpose: Represents a rational number and provides methods for arithmetic operations and utility functions.
Properties:
numerator: The numerator part of the rational number.
denominator: The denominator part of the rational number (must be non-zero).
Constructor:
Rational(int numerator, int denominator): Initializes a rational number and throws an IllegalArgumentException if the denominator is zero. Also reduces the fraction to its simplest form.
Methods:
add(Rational other): Returns a new Rational object representing the sum of this rational number with another.
subtract(Rational other): Returns a new Rational object representing the difference between this rational number and another.
multiply(Rational other): Returns a new Rational object representing the product of this rational number with another.
divide(Rational other): Returns a new Rational object representing the quotient of this rational number divided by another.
compareTo(Rational other): Compares this rational number with another. Returns 0 if equal, a positive number if greater, and a negative number if less.
toDouble(): Converts the rational number to a double.
absolute(): Returns a new Rational object that is the absolute value of this rational number.
reduce(): Reduces the rational number to its simplest form using the greatest common divisor.
gcd(int a, int b): A utility method to compute the greatest common divisor of two integers.
toString(): Returns a string representation of the rational number in the form "numerator/denominator".
