package NPE;

import java.util.Optional;

public class _npe {
    public static void main(String[] args) {
        String str=null;
        //System.out.println(str.toUpperCase());

        Optional<String> str1 = Optional.ofNullable("strxxx");
        String s = str1.map(String::toUpperCase)
        .orElse("ups!");
        System.out.println(s);
        System.out.println("123");

        Person vasa = new Person("vasa", "null");
        System.out.println(vasa.getEmail().map(String::toUpperCase).orElse("fuck"));
        System.out.println("ups");
    }
}

class Person {
    private final String Name;
    private final String Email;

    public Person(String name, String email) {
        Name = name;
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(Email);
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
