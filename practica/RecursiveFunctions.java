package practica;

public class RecursiveFunctions {

    public static void main(String[] args) {
        SumDigits sumDigits = new SumDigits(12345);
        System.out.println("Sum of digits: " + sumDigits.execute());

        ReverseString reverseString = new ReverseString("Hello, world!");
        System.out.println("Reversed string: " + reverseString.execute());

        MCD mcd = new MCD(24, 36);
        System.out.println("MCD of " + 24 + " and " + 36 + " is: " + mcd.execute());

        Power power = new Power(2, 10);
        System.out.println("2 raise to the power of 10 is: " + power.execute());
    }
}