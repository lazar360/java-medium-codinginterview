package calculatetheaverageage;

import java.util.*;

class Person{

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class CalculateTheAverageAgeStream {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(Arrays.asList(
                new Person("John", 25),
                new Person("Samantha", 32),
                new Person("Gaston", 19),
                new Person("Sophie", 40)
        ));

        //OptionalDouble averageAge = personList.stream().mapToInt(Person::getAge).average();

        double averageAge2 = personList.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);

        System.out.println("average age : " + averageAge2);
    }
}
