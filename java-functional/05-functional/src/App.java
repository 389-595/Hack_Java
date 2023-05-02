import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        var sensors = new Sensor[] {
            new Sensor(37, 50),
            new Sensor(20, 50),
            new Sensor(30, 50),
            new Sensor(60, 50),
        };
        var therms = new thermometer[] {
            new thermometer(37),
            new thermometer(20),
            new thermometer(30),
            new thermometer(60),
        };
        var frigo = new SensorFrigo[] {
            new SensorFrigo(37),
            new SensorFrigo(20),
            new SensorFrigo(30),
            new SensorFrigo(60),
        };


        System.out.println("la temperatura eseterna sensori è di " + averageExternalTemp(sensors , (Object obj) -> ((Sensor) obj).getExternalTemp()));
        System.out.println("la temperatura eseterna termometri è di " + averageExternalTemp(therms , (Object obj) -> ((thermometer) obj).getExternalTemp()));
        System.out.println("la temperatura eseterna sensorefrigo è di " + averageExternalTemp(frigo , (Object obj) -> ((SensorFrigo) obj).getExternalTemp()));

        

    }
    public static <T> double averageExternalTemp(T[] sensors , PropertyGetter pGetter){
        double sum = 0;

        for(T sensor : sensors) {
            sum += pGetter.getDoubleProperty(sensor);
        }
        return (sum/sensors.length);
    }

}
