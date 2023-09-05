package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _Lambdas {
    public static void main(String[] args) {
        System.out.println("Hello");
        List<Person> list = new ArrayList<>();
        list.add(new Person("vika"));
        list.add(new Person("vitos"));
        list.stream()
                .map(e->e.getName().toUpperCase()).forEach(System.out::println);
    }

    static class Person {
        private final String name;

        public Person(String name) {
            this.name = name;
        System.out.println("Hello");
        List<Person> list = new ArrayList<>();
        list.add(new Person("vika"));
        list.add(new Person(null));

        Person person1 = new Person(null);
        System.out.println(person1.getName().map(String::toUpperCase).orElse("hren!!!"));

        Person person2 = new Person("person2 not null!");
        if (person2.getName().isPresent()) {
            String email = person2.getName().get();
            System.out.println(email);
        } else {
            System.out.println("person2 == null");
        }


        List<String> stringList = List.of("x", "y", "z");
        List<String> collect = stringList.stream()
                .map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);
    }
}

class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
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
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}