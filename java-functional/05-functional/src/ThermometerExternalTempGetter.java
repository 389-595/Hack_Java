public class ThermometerExternalTempGetter implements PropertyGetter {
    public double getDoubleProperty(Object obj){
        thermometer s = (thermometer) obj;
        return s.getExternalTemp();
    }
}
