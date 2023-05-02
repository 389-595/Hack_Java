import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class App {
    public static void main(String[] args) throws Exception {
        Person p = new Person("Davide" , "Semenzato");
        stampaNome(p.name);
        cambiaNome(p);
        stampaNome(p.name);

       
    }
    //! Side effect
    public static void stampaNome(String name){
        System.out.println(name);
    }
    public static void cambiaNome(Person p){
        p.name = "Arturo";
    }

    //! Senza
    
    /* public static int sum(int num1 , int num2){
        System.out.println("i Dati personali sono" + num1 + " e " + num2);
        return num1 + num2;
    } */
    

   
    
}
