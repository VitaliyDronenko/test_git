package ProjectMosh;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Helloo mosh");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        String format = numberFormat.format(1234569.1);
        System.out.println(format);

    }
}
