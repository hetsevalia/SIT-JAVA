public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) throws IllegalArgumentException {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    // Arithmetic operations (add, subtract, multiply, divide)
    public Rational add(Rational other) {
        int newNumerator = this.numerator * other.denominator + this.denominator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational subtract(Rational other) {
        int newNumerator = this.numerator * other.denominator - this.denominator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational multiply(Rational other) {
        return new Rational(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    public Rational divide(Rational other) {
        return new Rational(this.numerator * other.denominator, this.denominator * other.numerator);
    }

    // Comparison
    public int compareTo(Rational other) {
        int lhs = this.numerator * other.denominator;
        int rhs = this.denominator * other.numerator;
        return Integer.compare(lhs, rhs);
    }

    // Convert to floating point
    public double toDouble() {
        return (double) numerator / denominator;
    }

    // Absolute value
    public Rational absolute() {
        return new Rational(Math.abs(numerator), Math.abs(denominator));
    }

    // Utility methods
    private void reduce() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}