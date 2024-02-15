package practica;

public class ReverseString {
    private String string;

    public ReverseString(String string) {
        this.string = string;
    }

    public String execute() {
        StringBuilder reversed = new StringBuilder();

        for (int i = string.length() - 1; i >= 0; i--) {
            reversed.append(string.charAt(i));
        }

        return reversed.toString();
    }
}