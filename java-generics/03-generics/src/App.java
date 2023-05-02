public class App {
    public static void main(String[] args) throws Exception {
        String[] nomi = new String[] {"Davide" ,"Giuseppe" ,"Pino" ,"Francesca" ,"Eleonora"};

        String nomeMinimo = algoritmiPerArray.min(nomi);
        System.out.println(nomeMinimo);


        Integer[] numbers = new Integer[] {100, 200, 300 ,400};
        Integer numeroMinimo = algoritmiPerArray.min(numbers);
        System.out.println(numeroMinimo);


    }

}
