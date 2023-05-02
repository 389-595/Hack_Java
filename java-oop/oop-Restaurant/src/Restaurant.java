public class Restaurant {
    private String name;
    private Dish[] dishes;
    private Drinks[] drinks;


    public Restaurant(String name , Dish[] dishes , Drinks[] drinks){
        this.name = name;
        this.dishes = dishes;
        this.drinks = drinks;
    }
    
    
    
    
    //! Funzione Stampa menu
    public void stampaMenu(){
        for (Dish dish: dishes) {
            System.out.println(dish.getName() + " , " + dish.getPrice() + " euro");
        }

        for (Drinks drink: drinks) {
            System.out.println(drink.getName() + " , " + drink.getPrice()+ " euro");
        }
        
    }


    //! Getter
    public String getName(){return name;}
    public Dish[] getDish(){return dishes;}
    public Drinks[] getDrinks(){return drinks;}

    //! Setter 
    public void setName(){this.name = name;}
    public void setDrinks(){this.drinks = drinks;}
    public void setDish(){this.dishes = dishes;}

}
