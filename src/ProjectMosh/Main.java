package ProjectMosh;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Helloo mosh");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        String format = numberFormat.format(1234569.1);
        System.out.println(format);

    }
}
