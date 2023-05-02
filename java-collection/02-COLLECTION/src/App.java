import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        
        Motorcycle p1 =  new Motorcycle("KTM", "Super duke 1290 RR", 1300);
        Motorcycle p2 =  new Motorcycle("KTM", "450 EXC", 450);
        Motorcycle p3 =  new Motorcycle("YAMAHA", "MT-07", 700);
        Motorcycle p4 =  new Motorcycle("YAMAHA", "MT-07", 700);




       Set<Motorcycle> moto = Set.of(p1,p2,p3,p4);

        //! equals Override

       //? System.out.print(p3.equals(p4));

       //! hasCode

       


/*  
       for(Motorcycle m : moto){
            System.out.println(m.print());
        } */


    }

    
}
