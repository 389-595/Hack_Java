import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        //! Arraylist

        /* List<Person> people = new ArrayList<Person>();

        people.add(new Person("Davide", "Semenzato", 19));
        people.add(new Person("Alfredo", "Coppola", 21));
        people.add(new Person("Federico", "Bonaudo", 26));

        
        System.out.println("Ciclo con Nomi ");

       
        
        for(Person p : people){

            System.out.println(p.getName());
        }



        System.out.println("Ciclo con Cognomiomi ");

        
        
        
        for(Person p : people){

            System.out.println(p.getSurname());
        }


        System.out.println("Ciclo con Età ");


        for(Person p : people){

            System.out.println(p.getAge());
        }


        System.out.println("Ciclo Senza Davide ");

         people.remove(0);
        for(Person p : people){

            System.out.println(p.getName());
        } */



        //! LinkedList

        LinkedList<Person> people = new LinkedList<Person>(
            List.of(
                new Person("Davide", "Semenzato", 19),
                new Person("Alfredo", "Coppola", 21),
                new Person("Federico", "Bonaudo", 26)
            )
        );

        



        System.out.println("Ciclo Aggiungendo alla fine Angelo ");

        people.addLast(new Person("Angelo", "non lo so", 22));

        for(Person p : people){

            System.out.println(p.getName());
        }

        System.out.println("Ciclo rimuovendo alla fine Angelo ");

        people.removeLast();

        for(Person p : people){

            System.out.println(p.getName());
        }

        System.out.println("Ciclo rimuovendo tutti ");

        people.remove();

        for(Person p : people){

            System.out.println(p.getName());
        }

    }
}
