import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {

        /* Map<String, Person> rubrica = new HashMap<String,Person>();

        Person davide = new Person("Davide", "Semenzato", "SMNDVD03T27");

        rubrica.put(davide.cf , davide);
        
        Person giovanni = new Person("Giovanni", "Stravato", "SRTGVN03T18");
        rubrica.put(giovanni.cf , giovanni);
        

        System.out.println("Prima della rimozione" );
        

        for(String key :  rubrica.keySet()){
            System.out.println(rubrica.get(key).cf );
        }

        System.out.println("dopo la rimozione" );
        rubrica.remove(giovanni.cf);
        for(String key :  rubrica.keySet()){
            System.out.println(rubrica.get(key).cf );
        } */


        //! Object Key Comp


        Map<RubricaKey, Person> rubrica = new HashMap<RubricaKey,Person>();

        //? genero 2 persone da inserire in rubrica 

        Person davide = new Person("Davide", "Semenzato", "SMNDVD03T27");

        Person davide2 = new Person("Davide", "Semenzato", "SMNDVD03T27");

        //!  da queste 2 persone genero 2 chiavi
        
        RubricaKey key1 = new RubricaKey(davide.cf, 20);
        rubrica.put(key1, davide);


        RubricaKey key2 = new RubricaKey(davide2.cf, 20);
        rubrica.put(key2, davide2);

        for(RubricaKey key : rubrica.keySet()){
            System.out.println(rubrica.get(key).name);
        }

    }
}
