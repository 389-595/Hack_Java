public class App {
    public static void main(String[] args) throws Exception {

        /* GenericClass gen = new GenericClass();
        gen.<String>print("Ciao");
        gen.<Integer>print(5);
       
        System.out.println(gen.<String>returnTypeGeneric("Ciaone"));
        System.out.println(gen.<Integer>returnTypeGeneric(10));
 */
        // Pair<String> p1 = new Pair<String>("String 1 ", "String 2 ");

        // System.out.println(p1.getS1() + " : " + p1.getS2());

        // PairrInt<Integer> p2 = new PairrInt<Integer>(5, 6);

        // System.out.println(p2.getI1() + " : " + p2.getI2());

        GenericPair<String> genp1 = new GenericPair<String>("Ciao", "Java");
        System.out.println(genp1.getParam1() + " " + genp1.getParam2());

        GenericPair<Integer> genp2 = new GenericPair<Integer>(5, 6);
        System.out.println(genp2.getParam1() + " " + genp2.getParam2());
    }
}
