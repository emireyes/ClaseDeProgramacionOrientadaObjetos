package practica;

public class Power {
    private int base;
    private int exponent;

    public Power(int base, int exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    public int execute() {
        if (exponent == 0) {
            return 1;
        }
        return base * execute(base, exponent - 1);
    }

    private int execute(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * execute(base, exponent - 1);
    }
}