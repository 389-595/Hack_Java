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

        //! Dichiarativo

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
        List<Person> females = people.stream().filter(person -> Gender.FEMALE.equals(person.gender)).toList();
         

        for(Person p : females){
            System.out.println(p.name);
        }




    }
}
