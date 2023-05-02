import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

        /* List<Person> people = List.of(
            new Person("Davide" ,Gender.FEMALE),
            new Person("Davide" ,Gender.MALE),
            new Person("Davide" ,Gender.FEMALE),
            new Person("Davide" ,Gender.MALE),
            new Person("Davide" ,Gender.FEMALE)

        );

        //! Imperativo

        List<Person> females = new ArrayList<>();
        for(Person p : people){
            if(Gender.FEMALE.equals(p.gender)) females.add(p);
        }
        for(Person f : females){
            System.out.println(f.name);
        } */



        List<Person> people = List.of(
            new Person("Davide" ,Gender.FEMALE),
            new Person("Davide" ,Gender.MALE),
            new Person("Davide" ,Gender.FEMALE),
            new Person("Davide" ,Gender.MALE),
            new Person("Davide" ,Gender.FEMALE)

        );

        //? dichiarativo
        people.stream().filter(person -> Gender.FEMALE.equals(person.gender))
         .collect(Collectors.toList())
         .forEach(person -> System.out.println(person.name));

        for(Person p : people){
            System.out.println(p.name);
        }



        List<Integer> ints = List.of(1,2,3,4,5,6,7,8,10);

        ints.stream().filter(el -> el >5).limit(5);


    }
}
