import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class App {
    public static void main(String[] args) throws Exception {
        
        Person p = new Person("Davide" , "Semenzato");
        Person p2 = p.clone();

        p.saluta();
        p2.saluta();
       
    }

    

   
    
}
