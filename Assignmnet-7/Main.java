public class Main {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please provide four integers representing two rational numbers (numerator and denominator for each).");
            return;
        }
        try {
            int num1 = Integer.parseInt(args[0]);
            int denom1 = Integer.parseInt(args[1]);
            Rational r1 = new Rational(num1, denom1);

            int num2 = Integer.parseInt(args[2]);
            int denom2 = Integer.parseInt(args[3]);
            Rational r2 = new Rational(num2, denom2);

            System.out.println("Input Rational Numbers:");
            System.out.println("R1: " + r1);
            System.out.println("R2: " + r2);

            System.out.println("Addition: " + r1.add(r2));
            System.out.println("Subtraction: " + r1.subtract(r2));
            System.out.println("Multiplication: " + r1.multiply(r2));
            System.out.println("Division: " + r1.divide(r2));
            System.out.println("Comparison: " + (r1.compareTo(r2) == 0 ? "Equal" : (r1.compareTo(r2) > 0 ? "Greater" : "Less")));
            System.out.println("R1 to double: " + r1.toDouble());
            System.out.println("R2 to double: " + r2.toDouble());
            System.out.println("R1 absolute: " + r1.absolute());
            System.out.println("R2 absolute: " + r2.absolute());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
