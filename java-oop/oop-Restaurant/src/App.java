public class App {

    public static void main(String[] args) throws Exception {
        
        Dish dish1 = new Dish("Amatriciana", 8);
        Dish dish2 = new Dish("Lasagna", 10);
        Dish dish3 = new Dish("Cacio e pepe", 8);
        Dish dish4 = new Dish("Carbonara", 9);
        
        Drinks drink1 = new Drinks("Quattro Bianchi ", 8);
        Drinks drink2 = new Drinks("Whisky Sour ", 9);
        Drinks drink3 = new Drinks("Midori sour ", 8);
        Drinks drink4 = new Drinks("Vodka Lemon ", 6);
        
        Dish[] tuttiDish = new Dish[]{dish1, dish2, dish3, dish4};
        Drinks[] tuttiDrink = new Drinks[]{drink1, drink2, drink3, drink4} ;

        Restaurant restaurant = new Restaurant("Ristorante",tuttiDish, tuttiDrink);
        restaurant.stampaMenu();
    }
}
