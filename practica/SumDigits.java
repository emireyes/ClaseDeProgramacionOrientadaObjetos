package practica;

public class SumDigits {
    private int number;

    public SumDigits(int number) {
        this.number = number;
    }

    public int execute() {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}