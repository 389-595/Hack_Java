public class Motorcycle {
    private String marca;
    private String modello;
    private int cilindrata;
    
    
    public Motorcycle(String marca, String modello, int cilindrata) {
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
    }

    public String print(){ return "Marca: " + marca+ " " + "Modello: " + modello+ " " + "Cilindrata: " + cilindrata; }
    

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Motorcycle) {
            Motorcycle other = (Motorcycle) obj;
            return marca == other.marca && modello == other.modello && cilindrata == other.cilindrata;
        }else{
            return false;
        }
    }

    /* @Override
    public int hasCode(){
        return cilindrata;
    } */
}
