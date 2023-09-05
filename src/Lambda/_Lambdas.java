package Lambda;

import java.util.function.Function;

public class _Lambdas {
    public static void main(String[] args) {
        Function<String, String> upperCase = (name) -> {
            if (name.isBlank()) throw  new IllegalArgumentException();
            return name.toUpperCase();
        };
        String str = upperCase.apply("vitos");
        System.out.println(str);
        }

    }