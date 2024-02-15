package practica;

public class MCD {
    private int a;
    private int b;

    public MCD(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int execute() {
        if (b == 0) {
            return a;
        }
        return execute(b, a % b);
    }

    private int execute(int a, int b) {
        if (b == 0) {
            return a;
        }
        return execute(b, a % b);
    }
}