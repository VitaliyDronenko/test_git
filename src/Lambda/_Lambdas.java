package Lambda;

import java.util.ArrayList;
import java.util.List;

public class _Lambdas {
    public static void main(String[] args) {
        System.out.println("Hello");
        List<Person> list = new ArrayList<>();
        list.add(new Person("vika"));
        list.add(new Person("vitos"));
        list.stream()
                .map(e->e.getName().toUpperCase()).forEach(System.out::println);
    }
}

class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}