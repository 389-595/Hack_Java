public class App {
    public static void main(String[] args) throws Exception {
            GenericsPair<String, Integer > p1 = new GenericsPair<String,Integer>("caio", 8);
            System.out.println("i parametri sono: " + p1.getParam1()+ " " + p1.getParam2());

            /* public <T3> T2 returnSomething(T3 param){
                return param2;
            } */

            System.out.println( p1.<String>returnSomething("Ciao belli"));

    }
}
